package ExceptionHandling;

public class StringIndex {
public static void main(String[] args)
{
	System.out.println("Welcome");
	try
	{
	String name="Exception";
	System.out.println(name.charAt(name.length()+1));
	}
	catch(StringIndexOutOfBoundsException ibe)
	{
		System.out.println("Length of the String is ahead of the Size");
	}
}
}
