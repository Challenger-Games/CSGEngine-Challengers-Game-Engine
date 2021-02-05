package renderering.font_renderering;

import org.cg.engine.CSGEngine;
import org.cg.engine.components.Renderer2D;
import org.cg.engine.lib.AbstractGame;
import org.cg.engine.lib.CSGColor;

public class FontRenderering extends AbstractGame // You need abstract game for the engine to reconize your main file
{
	private static CSGEngine engine; // Here is a static refrence to our engine
	
	public static void main(String[] args)
	{
		engine = new CSGEngine(new FontRenderering()); // Create a new instance of the engine with our main file for the argument
		engine.setTitle("Font Renderering Example!"); // This will set the title
		engine.setPrintFpsOnScreen(true); // Our FPS is now being printed on screen
		engine.start(); // This will start the engine
	}

	@Override
	public void init(CSGEngine e)
	{
	}

	@Override
	public void render(CSGEngine e, Renderer2D renderer)
	{
		renderer.addBackgroundShadowEffect(30); // Max background shadow effect
		
		// Lets render text
		renderer.drawText("Font Renderering Example", 270, 180, CSGColor.Green); // Renders text to the center of the screen
	}

	@Override
	public void update(CSGEngine e, float dt)
	{
	}
}
