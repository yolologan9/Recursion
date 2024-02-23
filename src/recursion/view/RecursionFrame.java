package recursion.view;
import recursion.controller.Controller;

import javax.swing.JFrame;

public class RecursionFrame extends JFrame
{
	private Controller app;
	private RecursionPanel panel;
	
	public RecursionFrame (Controller app)
	{
		super();
		this.app = app;
		
		this.panel = new RecursionPanel(this.app); //sending a reference to the app as a parameter
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel); //puts panel inside frame
		this.setTitle("Chatbot GUI");
		this.setSize(1024, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //you dont need JFrame.EXIT_ON_CLOSE because it inherits jframe
		setResizable(false);
		this.setVisible(true);
	}
}
