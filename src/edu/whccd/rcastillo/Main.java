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


	public static void displayMenu()
	{
		System.out.println("Make a Profile (1)");
		System.out.println("Edit Profile (2)");
		System.out.println("Find a Date (3)");
		System.out.print("Exit (4)");
	}


	public static void main(String[] args)
	{


		Boolean exitProgram = false; // Bool Variable to exit While Loop.


		// Title Screen
		System.out.print("Welcome to the Binary love connection form.");
		System.out.println();
		System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");
		System.out.println();

		int option;

		while (!exitProgram) // Main Event Loop
		{
			displayMenu();

			makeProfile();



		}




	}

	public static void makeProfile()
	{
		Profile user = new Profile();
		Scanner s1 = new Scanner(System.in);

		System.out.print("Enter First Name: ");
		user.firstName = s1.next();
		System.out.print("Enter Last Name: ");
		user.lastName = s1.next();
		System.out.println("Hello " + user.lastName + ", " + user.firstName);
	}

}

class Profile
{
	String firstName = "";
	String lastName = "";
}