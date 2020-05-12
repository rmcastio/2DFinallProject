package edu.whccd.rcastillo;

/* This is application is the Final, that will showcase the result of the courses past lessons.
    Author: Richard Castillo
 */




import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;




public class Main
{

	public static void main(String[] args)
	{
		Profile user = new Profile();

		Boolean exitProgram = false;

		while (!exitProgram) // Main Event Loop
		{
			System.out.print("Welcome to the Binary love connection form.");
			System.out.println();
			System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");
			System.out.println();


			Scanner s1 = new Scanner(System.in);
			System.out.print("Enter First Name: ");
			user.firstName = s1.next();
			System.out.print("Enter Last Name: ");
			user.lastName = s1.next();
			System.out.println("Hello " + user.lastName + ", " + user.firstName);

		}




	}


}

class Profile
{
	String firstName = "";
	String lastName = "";
}