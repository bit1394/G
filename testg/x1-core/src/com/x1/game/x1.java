package com.x1.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class x1 implements ApplicationListener {
	
	private Texture quadTex;
	private SpriteBatch bat;
	private TextureRegion redRegion, yelRegion, blueRegion, greenRegion;
	
	@Override
	public void create () {
	
		quadTex = new Texture ("quads.png");
		bat = new SpriteBatch ();
		redRegion = new TextureRegion (quadTex, 32, 0, 64, 32);
		blueRegion = new TextureRegion (quadTex, 0, 32, 32, 64);
		yelRegion = new TextureRegion (quadTex, 1, 1, 31, 31);
		greenRegion = new TextureRegion (quadTex, 31, 32, 64, 64);
		
	}

	@Override
	public void render () {
		bat.begin();
		bat.draw(quadTex, 100, 100);
		bat.draw(redRegion, 20, 20, 50, 50);
		bat.draw(blueRegion, 25, 25, 100, 10);
		bat.draw(yelRegion, 20, 350);
		bat.draw(greenRegion, 250, 120, 10, 10);
		bat.end();
	}
		

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
