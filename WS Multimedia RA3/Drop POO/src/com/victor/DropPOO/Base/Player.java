package com.victor.DropPOO.Base;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class Player extends Character{
	
	public Player(Vector2 position, float speed, Texture texture){
		super(position, speed, texture);
	}
		

	@Override
	public void update(float dt) {
		
		
		if(position.x <= 0)
			position.x = 0;
		
		if(position.x + texture.getWidth() >= Constants.SCREEN )
		
	}

}
