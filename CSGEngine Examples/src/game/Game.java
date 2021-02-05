package game;

import org.cg.engine.CSGEngine;
import org.cg.engine.components.Renderer2D;
import org.cg.engine.game_components.GameState;
import org.cg.engine.lib.AbstractGame;

public class Game extends AbstractGame // Our game is now an abstract game
{
	private GameState mainGameState = new MainGameState();
	
	public static void main(String[] args)
	{
		CSGEngine engine = new CSGEngine(new Game()); // Creates the engine instance with our game class passed as the abstract game
		engine.setScale(1.5f); // We scaled our window to a bigger size
		engine.start(); // Starting our engine object
	}

	@Override
	public void init(CSGEngine e)
	{
		// Set the current gamestate to our maingamestate
		GameState.setCurrentGameState(mainGameState);
		
		// Automatically Init the current GameState
		if(GameState.getCurrentGameState() != null)
		{
			GameState.getCurrentGameState().init(e);
		}
	}

	@Override
	public void render(CSGEngine e, Renderer2D renderer)
	{
		// Automatically Render the current GameState
		if(GameState.getCurrentGameState() != null)
		{
			GameState.getCurrentGameState().render(e, renderer);
		}
	}

	@Override
	public void update(CSGEngine e, float dt)
	{
		// Automatically Update the current GameState
		if(GameState.getCurrentGameState() != null)
		{
			GameState.getCurrentGameState().update(e, dt);
		}
	}
}
