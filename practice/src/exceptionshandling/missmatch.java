package exceptionshandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class missmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter an integer");
			a=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}


