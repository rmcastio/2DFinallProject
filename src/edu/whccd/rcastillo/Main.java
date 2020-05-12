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
					editProfile(storedProfiles);
					break;
				case '3': //Find a Date
					findLove();
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
	public static void editProfile(ArrayList<Profile> storedProfiles)
	{
		Boolean exitEdit = false;

		char editProfile;
		Scanner s1 = new Scanner(System.in);
		while (!exitEdit)
		{
			System.out.println("Edit First Name? (1)");
			System.out.println("Edit Last Name? (2)");
			System.out.println("Exit (3)");
			System.out.println();
			System.out.print("Your Selection: ");

			editProfile = s1.next().charAt(0);

			if (editProfile == '1' && storedProfiles.size() != 0)
			{
				System.out.print("New First Name: ");
				storedProfiles.get(0).firstName = s1.next();
			}
			else if (editProfile == '2' && storedProfiles.size() != 0)
			{
				System.out.print("New Last Name: ");
				storedProfiles.get(0).lastName = s1.next();
			}
			else if (editProfile == '3')
			{
				exitEdit = true;
			}
			else if (storedProfiles.size() == 0)
			{
				System.out.println("<3 <3 <3 No Profiles are stored. <3 <3 <3");
			}
			else
				System.out.println("<3 <3 <3 Invalid input! <3 <3 <3");
		}

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


	public static void findLove() {
		ArrayList<Profile> findGirls = new ArrayList<Profile>(); // Array List of Biological Women.

		Profile user = new Profile();
		user.firstName = "Patricia";
		user.lastName = "Borba";
		findGirls.add(user);

		Profile user1 = new Profile();
		user1.firstName = "Oprah";
		user1.lastName = "Winphrey";
		findGirls.add(user1);

		Boolean exitLove = false;

		char Swipe;
		Scanner s1 = new Scanner(System.in);

		int i = 0; // variable to iterate profiles.
		while (!exitLove)
		{
			if (findGirls.size() < i)
			{
				i = 0;
			}
			else
			{
				System.out.println(findGirls.get(i).lastName + ", " + findGirls.get(i).firstName);
				System.out.println("No (1)");
				System.out.println("Yes (2)");
				System.out.println("Exit (3)");
				System.out.println();
				System.out.print("Your Selection: ");
				Swipe = s1.next().charAt(0);
				if (Swipe == '1' )
				{
					System.out.print("New First Name: ");
					//storedProfiles.get(0).firstName = s1.next();
				}
				else if (Swipe == '2')
				{
					System.out.print("New Last Name: ");
					//storedProfiles.get(0).lastName = s1.next();
				}
				else if (Swipe == '3')
				{
					exitLove = true;
				}
			}


		}

	}

}

class Profile
{
	String firstName = "";
	String lastName = "";
}