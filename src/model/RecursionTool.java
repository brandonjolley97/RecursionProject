package model;

public class RecursionTool 
{
	
	
	public int getFibNumber(int position)
	{
		//Defensive code against user evilness
		if(position  <0)
		{
			return Integer.MIN_VALUE;
		}
		
		//Base Case
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else //Recursive case - We must keep calling the method.
		{
			return getFibNumber(position - 1) + getFibNumber(position - 2);
		}
	}
	
		public int getFactorialNumber(int position)
		{
			//Defensive code against user evilness
			if(position < 0)
			{
				return Integer.MIN_VALUE;
			}
			
			if(position == 0)
			{
				return 1;
			}
			else
			{
				return position * getFactorialNumber(position - 1);
			}
		}
		
}
