package controller;

import model.RecursionTool;
import model.CodeTimer;

import view.*;

public class RecursionController 
{
	private RecursionTool mathTool;
	private RecursionFrame baseFrame;
	private CodeTimer recursionTimer;
	private String calculatedValue;
	private long nanoTime = 0;
	private CodeTimer myTimer;
	
	public RecursionController()
	{
		mathTool = new RecursionTool();
		recursionTimer = new CodeTimer();
		baseFrame = new RecursionFrame(this);
	}
	
	public void start()
	{
		calculatedValue = Integer.toString(mathTool.getFibNumber(0));
	}
	
	public String getCalculatedValue()
	{
		return calculatedValue;
	}
	
	public String doFibonacci(String inputValue)
	{

		recursionTimer.startTimer();

		calculatedValue = "The Fibonacci sequence number of " + inputValue + " is " + Integer.toString(mathTool.getFibNumber(Integer.parseInt(inputValue)));
		recursionTimer.stopTimer();
		
		
		return calculatedValue;
	}
	
	public String doFactorial(String inputValue)
	{
		recursionTimer.startTimer();
		calculatedValue = "The factorial of " + inputValue + " is " + Integer.toString(mathTool.getFactorialNumber(Integer.parseInt(inputValue)));
		recursionTimer.stopTimer();
		
		return calculatedValue;
	}
	
	public String timingInfo()
	{
		return recursionTimer.toString();
	}
}
