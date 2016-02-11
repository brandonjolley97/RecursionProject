package view;

import controller.RecursionController;

import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea resultsArea;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		baseLayout =new SpringLayout();
		fibonacciButton = new JButton("Get the Fibonacci sequence for this number!");
		factorialButton = new JButton("Get n");
		inputField = new JTextField(20);
		resultsArea = new JTextArea(10, 20);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(resultsArea);
		this.setBackground(Color.BLUE);
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true);
		resultsArea.setEditable(false);
		resultsArea.setText(baseController.getCalculatedValue());
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 48, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, factorialButton, 182, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, factorialButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, resultsArea, 6, SpringLayout.SOUTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, resultsArea, 93, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 77, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fibonacciButton, 6, SpringLayout.SOUTH, inputField);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 10, SpringLayout.NORTH, this);
	}
	private void setupListeners()
	{
		fibonacciButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					resultsArea.setText(baseController.doFibonacci(userInput));
				}
			}
		});
	}
	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		try
		{
			Integer.parseInt(input);
			isNumber = true;
		}
		catch(Exception numberException)
		{
			resultsArea.setText("type in a number!!!!");
		}
		
		return isNumber;
	}
}
