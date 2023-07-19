package ExceptionHandling;

public class NumberFormatExce {
	public static void main(String[] args)
	{
		System.out.println("Welcome");
		try {
		String numberFromat="TN45BL9158";
		int a=Integer.parseInt(numberFromat);
		System.out.println(a);
		System.out.println();
		}
		catch (NumberFormatException nfe)
		{
			
			//System.out.println(nfe);
			System.out.println("String Can not be converted to Integer");
			
		}
		
	}

}
