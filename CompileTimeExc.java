package ExceptionHandling;
import java.io.*;
public class CompileTimeExc {
	public static void main(String [] args) throws IOException {
		//File f=new File("C:\\Users\\User\\OneDrive - Ciber Global LLC\\Desktop\\Test.txt");
		try
		{
		File f=new File("C:\\Users\\User\\OneDrive - Ciber Global LLC\\Desktop\\Tet.txt");
		
		FileReader fr=new FileReader(f);//read the file 
		int temp=0;
		   while((temp=fr.read())!=-1)//read() is used to read the file 
		   {
			  System.out.print((char)(temp)); 
		   }
		}
		   catch(FileNotFoundException fe)
		   {
			  System.out.println("File not found Please check your file name"+fe);
			  
			  
		   }
		
	}

		
	}


