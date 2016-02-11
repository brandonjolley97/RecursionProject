package view;

import controller.RecursionController;
import javax.swing.JFrame;

public class RecursionFrame extends JFrame
{
	private RecursionPanel basePanel;
	private RecursionController baseController;
	
	public RecursionFrame(RecursionController baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Let's Recurse");
		this.setSize(500,500);
		this.setVisible(true);
	}
}
