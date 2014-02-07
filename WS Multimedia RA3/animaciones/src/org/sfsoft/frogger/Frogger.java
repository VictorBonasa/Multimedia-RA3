package org.sfsoft.frogger;

import org.sfsoft.frogger.characters.Cocodrile;
import org.sfsoft.frogger.characters.Frog;
import org.sfsoft.frogger.util.Constants;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Clase principal del proyecto principal del juego
 * 
 * @author Santiago Faci
 *
 */
public class Frogger extends Game {

	public OrthographicCamera camera;
	SpriteBatch spriteBatch;
	BitmapFont fuente;
	
	Frog frog;
	Cocodrile cocodrile;
	
	/*
	 * M�todo invocado en el momento de crearse la aplicaci�n
	 * @see com.badlogic.gdx.ApplicationListener#create()
	 */
	@Override
	public void create() {
		spriteBatch = new SpriteBatch();
		fuente = new BitmapFont();
		
		// Crea la c�mara y define la zona de visi�n del juego (toda la pantalla)
		camera = new OrthographicCamera();
		camera.setToOrtho(false, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
		camera.update();
		
		Texture.setEnforcePotImages(false);
		
		frog = new Frog(10, 10, 3);
		cocodrile = new Cocodrile(0, 300);
	}

	/*
	 * M�todo que se invoca cada vez que hay que renderizar
	 * Es el m�todo donde se actualiza tambi�n la l�gica del juego
	 * @see com.badlogic.gdx.ApplicationListener#pause()
	 */
	@Override
	public void render() {
		
		float dt = Gdx.graphics.getDeltaTime();
		
		// Pinta el fondo de la pantalla de azul oscuro (RGB + alpha)
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		// Limpia la pantalla
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		// Actualiza la c�mara
		camera.zoom = 1 / 5f;
		camera.update();
		
		handleInput(dt);
		update(dt);
		
		spriteBatch.begin();
		frog.render(spriteBatch);
		cocodrile.render(spriteBatch);
		spriteBatch.end();
	}
	
	private void handleInput(float dt) {
		
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			frog.state = Frog.State.LEFT;
			frog.move(new Vector2(-dt, 0));
		}
		else if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			frog.state = Frog.State.RIGHT;
			frog.move(new Vector2(dt, 0));
		}
		else if (Gdx.input.isKeyPressed(Keys.UP)) {
			frog.state = Frog.State.UP;
			frog.move(new Vector2(0, dt));
		}
		else if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			frog.state = Frog.State.DOWN;
			frog.move(new Vector2(0, -dt));
		}
		else 
			frog.state = Frog.State.IDLE;
	}
	
	private void update(float dt) {
		
		frog.update(dt);
		cocodrile.update(dt);
	}
	
	/*
	 * M�todo invocado cuando se destruye la aplicaci�n
	 * Siempre va precedido de una llamada a 'pause()'
	 * @see com.badlogic.gdx.ApplicationListener#dispose()
	 */
	@Override
	public void dispose() {
		spriteBatch.dispose();
		fuente.dispose();
	}
	
	
}
