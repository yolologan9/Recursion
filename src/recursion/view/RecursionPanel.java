package recursion.view;

import recursion.controller.Controller; //THIS HAS ACCESS TO CONTROLLER

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import java.awt.Color;

import java.math.BigInteger;


public class RecursionPanel extends JPanel
{
	private Controller app;
	
	private SpringLayout layout;
	private JPanel buttonPanel;
	private JPanel menuPanel;
	private JTextField inputField;
	private JTextArea resultArea;
	private JScrollPane resultsPane;
	private JButton fibButton;
	private JButton factorialButton;
	private JButton stringButton;
	private JButton voidButton;
	
	
	public RecursionPanel(Controller app)
	{
		super();
		
		this.app = app;
		this.layout = new SpringLayout();
		this.resultsPane = new JScrollPane();
		this.buttonPanel = new JPanel(new GridLayout(1,0));
		this.menuPanel = new JPanel(new GridLayout(0,1));
		this.inputField = new JTextField("Numbers Only");
		this.fibButton = new JButton("Fibonacci");
		this.factorialButton = new JButton("Factorial");
		this.stringButton = new JButton("String recursion");
		this.voidButton = new JButton("void recursion");
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		setBackground(Color.GRAY);
		setLayout(layout);
		resultsPane.setViewportView(resultArea);
		
		this.add(resultsPane);
		this.add(menuPanel);
		
		menuPanel.add(buttonPanel);
		menuPanel.add(inputField);
		
		resultArea.setEnabled(false);
		resultArea.setWrapStyleWord(true);
		resultArea.setLineWrap(true);
	}
	
	
	
	private void setupListeners()
	{
		factorialButton.addActionListener(click -> factorialLoad());
	}
	
	private void factorialLoad()
	{
		String value = inputField.getText();
		
		String result = app.factorialInfo(value);
		
		resultArea.setText(result);
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, resultsPane, 20, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, resultsPane, 400, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, resultsPane, -20, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.WEST, resultsPane, 20, SpringLayout.WEST, this);
		
		layout.putConstraint(SpringLayout.NORTH, menuPanel, 20, SpringLayout.SOUTH, resultsPane);
		layout.putConstraint(SpringLayout.EAST, menuPanel, 0, SpringLayout.EAST, resultsPane);
		layout.putConstraint(SpringLayout.WEST, menuPanel, 0, SpringLayout.WEST, resultsPane);
		layout.putConstraint(SpringLayout.SOUTH, menuPanel, -20, SpringLayout.SOUTH, this);



	}
}
