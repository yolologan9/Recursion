package recursion.controller;

import java.math.BigInteger;

import recursion.model.RecursionDemo;
import recursion.view.RecursionFrame;
public class Controller 
{
	public Controller()
	{
		this.window = new RecursionFrame(this); //lets us access the panel
	}
	
	public void start()
	{
		
	}
	
	public String factorialInfo(String source)
	{
		String result = "The int based factorial of " + source + "is: \n";
		
		int intVersion = Integer.parseInt(source);
		
		result += RecursionDemo.factorialDemo(intVersion); //how we are using recursionDemo object
		
		result += "\n\n";
		
		result += "The double version is:\n";
		
		double doubleVersion = (double) intVersion;
		
		result += RecursionDemo.factorialDemo(doubleVersion);
		
		result += "\n\n";
		
		result += "Are they the same?";
		
		BigInteger large = new BigInteger(source);
		
		result += "\n\n";
		
		result += "The BigInteger version is: " + large.toString();
		
		return result;
	}
}
