package Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleExceptions {
	public static void main(String[] args) {
		Test test=new Test();
		try {
			test.run();
		} catch (Exception e) {
			System.out.println("Catch block");
		}
		try{
			test.input();
		}catch(FileNotFoundException e)
		{
			System.out.println("Multiple Exception");
		}
		catch(IOException e)
		{
			System.out.println("Exception caught");
		}
	}
	
	
}
