package ExceptionHandling;

public class NullPointerExce {
	public static void main(String [] args)
	{
		System.out.println("Welcome");
		try {
			
		String name=null;
		System.out.println(name.toUpperCase());
		}
		catch(ArithmeticException ae)
		{
		System.out.println("Arithemetic Exception");
		}
		catch(NullPointerException np)
		{
			System.out.println(np);
			System.out.println("Null Pointer exception");
			np.printStackTrace();
		}
		catch(NumberFormatException nf)
		{
			System.out.println("Number Format Exception");
		}
		catch(Exception e)
		{
			System.out.println("Dont modify the null values ");
		}
		System.out.println("Thank You");
		
	}

}
