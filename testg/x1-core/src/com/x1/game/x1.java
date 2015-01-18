package com.x1.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class x1 implements ApplicationListener {
	
	private Texture quadTex;
	private SpriteBatch bat;
	private TextureRegion redRegion;
	
	private Stage stage;
	
	class RedQuad extends Actor{
		@Override
		public void draw (Batch batch, float parentAlpha){ //обязательно  Batch, а не SpriteBatch
			batch.draw(redRegion, getX(), getY(), getWidth(), getHeight());
		}
	}
	
	class CoolRedQuads extends Actor{
		public void draw (Batch batch, float parentAlpha){
			batch.draw(redRegion, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
		}
	}
		
	@Override
	public void create () {
	
		quadTex = new Texture ("quads.png");
		bat = new SpriteBatch ();
		redRegion = new TextureRegion (quadTex, 32, 0, 64, 32);
		
		stage = new Stage (new StretchViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight()), bat);
		
	RedQuad redQ = new RedQuad();
	redQ.setSize(100, 50);
	redQ.setPosition(50, 50);
	stage.addActor(redQ);
	
	initCoolRedQuads();
	//initRedQuads();
	}
	
private void initRedQuads(){
	for (int i = 0; i < 6; i++){
		RedQuad rQ = new RedQuad ();
		rQ.setSize(i*10,  i*5);
		rQ.setPosition(i*50,  200);
		stage.addActor(rQ);
	}
}

private void initCoolRedQuads(){
	CoolRedQuads coolQ = new CoolRedQuads();
	coolQ.setSize(100,100);
	coolQ.setPosition(200,200);
	coolQ.setOrigin(50,50);
	coolQ.setRotation(75);
	
	stage.addActor(coolQ);
}

	@Override
	public void render () {
		stage.draw();
		stage.act(Gdx.graphics.getDeltaTime());
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
