package model;

public class CodeTimer 
{
	private long executionTime;
	public CodeTimer myTimer;
	
	
	public CodeTimer()
	{
		this.executionTime = 0;
		myTimer = new CodeTimer();
	}
	
	public void startTimer()
	{
		this.executionTime = System.nanoTime();
	}
	
	public void stopTimer()
	{
		this.executionTime = System.nanoTime() - executionTime;
	}
	
	public void resetTimer()
	{
		this.executionTime = 0;
	}

	public long getExecutionTime() 
	{
		return executionTime;
	}
	
	public String toString()
	{
		String timerDescription = "Current execution time is: " + this.executionTime + " in nanoseconds.";
		
		return timerDescription;
	}
	
	
	
}
