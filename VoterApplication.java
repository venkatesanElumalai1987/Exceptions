package ExceptionHandling;
//CustomException
public class VoterApplication {
	public static void main (String[] args)throws AgeException
	{
		String name=args[0];
		int age =Integer.parseInt(args[1]);
		System.out.println(name);
		if(age>=18)
		{
			System.out.println("Valid Age");
		}
		else {
			throw new AgeException("Invalid Age");
		}
		System.out.println("Gender");
	}

}
