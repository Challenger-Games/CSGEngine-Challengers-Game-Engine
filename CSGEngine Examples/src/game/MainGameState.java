package game;

import java.util.ArrayList;

import org.cg.engine.CSGEngine;
import org.cg.engine.components.Renderer2D;
import org.cg.engine.game_components.GameObject;
import org.cg.engine.game_components.GameState;

public class MainGameState extends GameState // This will make our class a GameState
{
	// This is a trick for convience
	private ArrayList<GameObject> gameObjects = new ArrayList<GameObject>(); // GameObject is a object in game from the enginer
	
	public MainGameState()
	{}

	@Override
	public void init(CSGEngine e)
	{
	}

	@Override
	public void render(CSGEngine e, Renderer2D renderer)
	{
		for(GameObject obj : gameObjects)
		{
			obj.render(e, renderer);
		}
	}

	@Override
	public void update(CSGEngine e, float dt)
	{
		for(int i = 0; i < gameObjects.size(); i++)
		{
			gameObjects.get(i).update(e, dt);
		}
	}
}
