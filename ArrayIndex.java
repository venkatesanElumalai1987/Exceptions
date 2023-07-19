package ExceptionHandling;

public class ArrayIndex {
	public static void main(String[] args)
	{
		String name[]= {"Abcd","Venkatesh"};
		try {
			System.out.println(name[0].concat(name[2]));
			
		}
		/*catch(ArrayIndexOutOfBoundsException stb)
		{
			System.out.println("Length of String is less than the Array Size");
		}*/
		
		finally {
			System.out.println("finaly it got executed");
		}
	}

}
