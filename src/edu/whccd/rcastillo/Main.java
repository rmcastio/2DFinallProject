package edu.whccd.rcastillo;

/* This is application is the Final, that will showcase the result of the courses past lessons.
    Author: Richard Castillo
 */

import java.time.LocalDate;
import java.util.*;
import java.util.InputMismatchException;
import java.lang.*;
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
			System.out.println("Edit First Name? (q)");
			System.out.println("Edit Last Name? (w)");
			System.out.println("What is your favorite color? (e)");
			System.out.println("What is your favorite vacation spot? (r)");
			System.out.println("What is your ideal first date? (t)");
			System.out.println("Who are the most important people in your life? (y)");
			System.out.println("What makes you laugh? (u)");
			System.out.println("Do you have a dream you're pursuing? (i)");
			System.out.println("What do your Saturdays usually look like? (o)");
			System.out.println("Where did you grow up, and what was your family like? (p)");
			System.out.println("What's your big passion? (a)");
			System.out.println("Do you read reviews, or just go with your gut? (s)");
			System.out.println("Exit (X)");
			System.out.println();
			System.out.print("Edit your Selection: ");


			editProfile = s1.next().charAt(0);

			if (editProfile == 'q' && storedProfiles.size() != 0)
			{
				System.out.print("New First Name: ");
				storedProfiles.get(0).firstName = s1.next();
			}
			else if (editProfile == 'w' && storedProfiles.size() != 0)
			{
				System.out.print("New Last Name: ");
				storedProfiles.get(0).lastName = s1.next();
			}
			else if (editProfile == 'e' && storedProfiles.size() != 0) {
				System.out.print("Change: What is your favorite color?");
				storedProfiles.get(0).questionLove[0] = s1.next();
			}
			else if (editProfile == 'r' && storedProfiles.size() != 0) {
				System.out.print("Change: What is your favorite vacation spot? ");
				storedProfiles.get(0).questionLove[1] = s1.next();
			}
			else if (editProfile == 't' && storedProfiles.size() != 0) {
				System.out.print("Change: What is your ideal first date? ");
				storedProfiles.get(0).questionLove[2] = s1.next();
			}
			else if (editProfile == 'y' && storedProfiles.size() != 0) {
				System.out.print("Change: Who are the most important people in your life?  ");
				storedProfiles.get(0).questionLove[3] = s1.next();
			}
			else if (editProfile == 'u' && storedProfiles.size() != 0) {
				System.out.print("Change: What makes you laugh? ");
				storedProfiles.get(0).questionLove[4] = s1.next();
			}
			else if (editProfile == 'i' && storedProfiles.size() != 0) {
				System.out.print("Change: Do you have a dream you're pursuing? ");
				storedProfiles.get(0).questionLove[5] = s1.next();
			}
			else if (editProfile == 'o' && storedProfiles.size() != 0) {
				System.out.print("Change: Where did you grow up, and what was your family like? ");
				storedProfiles.get(0).questionLove[6] = s1.next();
			}
			else if (editProfile == 'p' && storedProfiles.size() != 0) {
				System.out.print("Change: What makes you laugh? ");
				storedProfiles.get(0).questionLove[7] = s1.next();
			}
			else if (editProfile == 'a' && storedProfiles.size() != 0) {
				System.out.print("Change: What's your big passion? ");
				storedProfiles.get(0).questionLove[8] = s1.next();
			}
			else if (editProfile == 's' && storedProfiles.size() != 0) {
				System.out.print("Change: Do you read reviews, or just go with your gut? ");
				storedProfiles.get(0).questionLove[9] = s1.next();
			}
			else if (editProfile == 'X')
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

		while (true)
		{
			System.out.print(" Enter Age (Must be over 18): ");
			String input = s1.next();
			user.personAge = 0;
			try
			{
				user.personAge = Integer.parseInt(input);
				break;
			} catch (NumberFormatException ne) {
				System.out.print("Invalid. ");
			}
		}

		if (user.personAge < 18)
		{
			System.out.print("Must be 18 or above");
			return;
		}



		String empty = new String();
		empty = s1.nextLine();
		System.out.print("Enter First Name: ");
		user.firstName = s1.nextLine();
		System.out.print("Enter Last Name: ");
		user.lastName = s1.nextLine();
		System.out.print("Enter Gender: ");
		user.gender = s1.nextLine();
		System.out.print("Enter BirthYear: ");
		user.personAge = s1.nextInt();


		String[] questionBank = new String[10];
		questionBank[0] = "What is your favorite color? ";
		questionBank[1] = "What is your favorite vacation spot? ";
		questionBank[2] = "What is your ideal first date? ";
		questionBank[3] = "Who are the most important people in your life? ";
		questionBank[4] = "What makes you laugh? ";
		questionBank[5] = "Do you have a dream you're pursuing? ";
		questionBank[6] = "What do your Saturdays usually look like? ";
		questionBank[7] = "Where did you grow up, and what was your family like? ";
		questionBank[8] = "What's your big passion? ";
		questionBank[9] = "Do you read reviews, or just go with your gut? ";




		String fake = new String();
		fake = s1.nextLine();
		for (int i = 0; i <= questionBank.length - 1; i++)
		{
			System.out.println(questionBank[i]);
			user.questionLove[i] = s1.nextLine();
		}

		System.out.println("Hello " + user.lastName + ", " + user.firstName);
		//System.out.println("You are " + user.gender + " and, born in " + user.birthYear);
		//System.out.println("Your answers to Questions: " + Arrays.toString(user.questionLove[i]));
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
			if (findGirls.size() <= i)
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
					i++;
				}
				else if (Swipe == '2')
				{
					System.out.print("\n\n");
					System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");
					System.out.println("<3 <3  Congratulations you matched with" + " " + findGirls.get(i).lastName + ", " + findGirls.get(i).firstName);
					System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");
					exitLove = true;
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
	String gender = "";
	int personAge = 0;
	String[] questionLove = new String[10];
}