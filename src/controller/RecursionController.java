package controller;

import model.RecursionTool;
import model.CodeTimer;

import view.*;

public class RecursionController 
{
	private RecursionTool mathTool;
	private RecursionFrame baseFrame;
	private String calculatedValue;
	private String myTimer;
	private long nanoTime = 0;
	
	public RecursionController()
	{
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
	}
	
	public void start()
	{
		calculatedValue = Integer.toString(mathTool.getFibNum(0));
	}
	
	public String getCalculatedValue()
	{
		return calculatedValue;
	}
	
	public String doFibonacci(String inputValue)
	{
		calculatedValue = "The Fibonacci sequence number of " + inputValue + " is " + Integer.toString(mathTool.getFibNum(Integer.parseInt(inputValue)));
		
		return calculatedValue;
	}
	
	public String doFactorial(String inputValue)
	{
		calculatedValue = "The factorial of " + inputValue + " is " + Integer.toString(mathTool.getFactorialNumber(Integer.parseInt(inputValue)));
		
		return calculatedValue;
	}
	
	public String timingInfo()
	{
		return myTimer.toString();
	}
}
