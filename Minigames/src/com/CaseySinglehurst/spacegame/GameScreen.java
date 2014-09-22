package com.CaseySinglehurst.spacegame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import android.graphics.Color;
import android.graphics.Paint;

import com.kilobolt.framework.Game;
import com.kilobolt.framework.Graphics;
import com.kilobolt.framework.Image;
import com.kilobolt.framework.Input.TouchEvent;
import com.kilobolt.framework.Input;
import com.kilobolt.framework.Screen;

public class GameScreen extends Screen {
	enum GameState {
		Ready, Running, Paused, GameOver
	}

	GameState state = GameState.Ready;
	Ship player = new Ship();
	// Variable Setup

	

	public GameScreen(Game game) {
		super(game);
		
		// Initialize game objects here

		

	}

	
	@Override
	public void update(float deltaTime) {
		
		List touchEvents = game.getInput().getTouchEvents();
		int len = touchEvents.size();
		for (int i = 0; i < len; i++) {
            TouchEvent event = (TouchEvent) touchEvents.get(i);
            
            player.update(event);
          
		}
		
		
	}

	private void updateReady(List touchEvents) {

		// This example starts with a "Ready" screen.
		// When the user touches the screen, the game begins.
		// state now becomes GameState.Running.
		// Now the updateRunning() method will be called!

		if (touchEvents.size() > 0)
			state = GameState.Running;
	}

	

		// 2. Check miscellaneous events like death:

	

	private void updatePaused(List touchEvents) {
	}

	private void updateGameOver(List touchEvents) {
	}

	@Override
	public void paint(float deltaTime) {
		Graphics g = game.getGraphics();
		g.clearScreen(5);
		int screenWidth = g.getWidth();
		int screenHeight = g.getHeight();
		
		g.drawImage(player.sprite, player.xpos -( player.sprite.getWidth()/2), player.ypos-( player.sprite.getHeight()/2));
	}



	private void nullify() {

		// Set all variables to null. You will be recreating them in the
		// constructor.
		

		// Call garbage collector to clean up memory.
		System.gc();

	}

	private void drawReadyUI() {

	}


	private void drawPausedUI() {
	}

	private void drawGameOverUI() {
	}

	@Override
	public void pause() {
		if (state == GameState.Running)
			state = GameState.Paused;

	}

	@Override
	public void resume() {
		if (state == GameState.Paused)
			state = GameState.Running;
	}

	@Override
	public void dispose() {

	}

	@Override
	public void backButton() {
		pause();
	}

	private void goToMenu() {
		// TODO Auto-generated method stub
		game.setScreen(new MainMenuScreen(game));

	}
}