package org.sfsoft.holalibgdx;

import com.badlogic.gdx.ApplicationListener;

/**
 * Clase principal del proyecto principal del juego
 * @author Santiago Faci
 *
 */
public class HolaLibgdx implements ApplicationListener {

	/*
	 * M�todo invocado en el momento de crearse la aplicaci�n
	 * @see com.badlogic.gdx.ApplicationListener#create()
	 */
	@Override
	public void create() {
	}

	/*
	 * M�todo invocado cuando se destruye la aplicaci�n
	 * Siempre va precedido de una llamada a 'pause()'
	 * @see com.badlogic.gdx.ApplicationListener#dispose()
	 */
	@Override
	public void dispose() {
	}

	/*
	 * En Android se invoca a este m�todo cuando la aplicaci�n
	 * pasa a segundo plano.
	 * En la versi�n de PC, se invoca siempre antes de invocar a 'dispose()'
	 * Es el momento de almacenar el estado de la partida
	 * @see com.badlogic.gdx.ApplicationListener#pause()
	 */
	@Override
	public void pause() {
	}

	/*
	 * M�todo que se invoca cada vez que hay que renderizar
	 * Es el m�todo donde se actualiza tambi�n la l�gica del juego
	 * @see com.badlogic.gdx.ApplicationListener#pause()
	 */
	@Override
	public void render() {
	}

	/*
	 * M�todo invocado cada vez que se redimensiona la pantalla sin pausar el juego
	 * Tambi�n se invoca justo despu�s de 'create()'
	 * @see com.badlogic.gdx.ApplicationListener#dispose()
	 */
	@Override
	public void resize(int arg0, int arg1) {
	}

	/*
	 * S�lo se invoca en Android, cuando la aplicaci�n continua
	 * despu�s de haber sido pausada
	 * @see com.badlogic.gdx.ApplicationListener#resume()
	 */
	@Override
	public void resume() {
	}
}
