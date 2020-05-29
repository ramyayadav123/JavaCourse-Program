package Exceptions;

public class RuntimeExcep {
	public static void main(String[] args) {
		String text=null;
		try
		{
			System.out.println(text.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.toString());
		}
		
		String[] texts={"one","two","three"};
		try
		{
			System.out.println(texts[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
		}
	}
}
