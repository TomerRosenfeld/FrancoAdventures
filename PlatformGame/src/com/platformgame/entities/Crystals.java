package com.platformgame.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.platform.game.PlatformGame;

public class Crystals extends B2DSprite {

	public Crystals(Body body) {
		super(body);
		
		Texture text = PlatformGame.manager.get("images/crystal.png");
				//new Texture("images/crystal.png");
		TextureRegion[] reg = TextureRegion.split(text, 150,200)[0];
		
		setAnimation(reg, 1/ 12f, 0.17f);
	}

}
