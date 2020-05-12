package edu.whccd.rcastillo;

/* This is application is the Final, that will showcase the result of the courses past lessons.
    Author: Richard Castillo
 */




import java.util.Scanner;
//import java.lang.System;
//import java.lang.Runtime;
import java.lang.*;
import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;






public class Main
{



	public static void main(String[] args)
	{


		Boolean exitProgram = false; // Bool Variable to exit While Loop.


		// Title Screen
		System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");
		System.out.print("     Welcome to the Binary love connection.");
		System.out.println();
		System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");
		System.out.println();

		char option;
		Scanner userInput = new Scanner(System.in);

		ArrayList<Profile> storedProfiles = new ArrayList<Profile>();

		while (!exitProgram) // Main Event Loop
		{
			displayMenu();
			option = userInput.next().charAt(0);


			switch (option)
			{
				case '1': // Chose to make Profile
					makeProfile(storedProfiles);
					break;
				case '2': //Edit Profile
					editProfile();
					break;
				case '3': //Find a Date
					break;
				case '4': // exit
					System.exit(0);
					break;
				default:
			}

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");


		}




	}


	// Display Main Menu
	public static void displayMenu()
	{
		System.out.println("Make a Profile Enter: (1)");
		System.out.println("Edit Profile Enter: (2)");
		System.out.println("Find a Date Enter: (3)");
		System.out.println("Exit Enter: (4)");
		System.out.println();
		System.out.print("Your selection: ");
	}


	// Function to edit profile
	public static void editProfile()
	{
		Scanner s1 = new Scanner(System.in);

		System.out.println("Edit First Name? (1)");
		System.out.println("Edit Last Name? (2)");
		System.out.println("Exit");
		System.out.println();
		System.out.print("Your Selection: ");
	}



	//Displays form to create Create Profile
	//and accepts user input
	public static void makeProfile(ArrayList<Profile> storedProfiles)
	{
		Profile user = new Profile();
		Scanner s1 = new Scanner(System.in);

		System.out.print("Enter First Name: ");
		user.firstName = s1.next();
		System.out.print("Enter Last Name: ");
		user.lastName = s1.next();
		System.out.println("Hello " + user.lastName + ", " + user.firstName);

		storedProfiles.add(user);
	}



}

class Profile
{
	String firstName = "";
	String lastName = "";
}