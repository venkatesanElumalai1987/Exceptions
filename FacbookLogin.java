package ExceptionHandling;
import java.util.Scanner;
public class FacbookLogin {
	public static void main(String [] args)throws LoginException
	{
		Scanner s=new Scanner(System.in);
		String name=s.next();
		System.out.println(name);
		if(name.contains(name))
		{
			System.out.println("Hi Cool! Enter Password");
		}
		else {
			throw new LoginException("Sorry!Username is Invalid");
		}
	}

}
