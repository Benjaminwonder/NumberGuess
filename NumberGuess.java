package sem1;

import java.util.Scanner;
import java.util.Random;
public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to NumberGuess!");
		System.out.println("+----------------------+");
		System.out.println(" ");
		
		
		
		
		
		/*
		 * Game Description
		 * Basically giving the user the choice of reading about the game or just jumping right into it.
		 * 
		 */
		
		Scanner desc = new Scanner(System.in); 
		System.out.println("Do you want a brief description of what the game is about or how to play? (y/n)");

		String descr =  desc.next();
		descr.toLowerCase();
		
		System.out.println("");
		System.out.println("+-------------+"); // for relatable user interface
		
		if (descr.equals("yes") || descr.equals("y")) {
			System.out.println("+-------------------------------------------------------------------+");
			System.out.println("+ So, basically, I generate a random number between 1 and 100.      +\n"
					+ "+ You have 5 attemps to be able to guess what this number is.       +\n"
					+ "+ Renewed attempts come with renewed numbers. And at the end,if you +\n"
					+ "+ get it wrong, I will tell you what the number is.                 +");
			System.out.println("+-------------------------------------------------------------------+");
			
		} else if (descr.equals("no") || descr.equals("n")){
			
			System.out.println("Okay, then!. Lets get right to it");
			
		}else {
			System.out.println("I don't know what that means! Kindly rerun program again.");
			
			desc.close();
			System.exit(0); // Quits the program  right after the else statement is called
		
		}
	
	
		
	
		
		
		/*
		 * Game algorithm
		 * Framework and stuff
		 * 
		 */
		
		
		
		// generating random numbers
		Random random = new Random();
		
		
		// creating a range for my random number
		int lborder = 1;
		int rborder = 100;
		
		int randomnum = random.nextInt((rborder - lborder) + 1) + lborder;

		//performing a debug print (debugging) to make sure random number is between 1 and 100
		//System.out.println("Random number between " + lborder + " and " + rborder + " =: " + randomnum);
		//System.out.println("+-------------+");
		
		System.out.println("");
		// Using the user input from the question below to kick start the while loop
		Scanner ask = new Scanner (System.in);
		System.out.println("Ready to begin?('y'/ yes and 'n'/ no)");
		String bag = ask.next();
		bag.toLowerCase();
		
		// if statement for no
		if (bag.equals("no") || bag.equals("n")) {
			System.out.println("");
			System.out.println("+-------------+");
			
			System.out.println("Have a great day!");
			System.exit(0);
		}else if (bag.equals("yes") || bag.equals("y")) {
			System.out.println("perfect");
		}
		
		
		else {
			
			System.out.println("");
			System.out.println("+-------------+");
			System.out.println("Incorrect input. Rerun program again!");
			System.exit(0);
		}
		
		
		
		int trials = 1; // Records the amount of attempts made by the user
		
		// creating a loop to manage multiple attempts by the user
		while (bag.equals("yes") || bag.equals("y")) {
			Scanner ask2 = new Scanner (System.in);
			
			System.out.println("+-------------+"); // for relatable user interface
			System.out.println("");
			
			System.out.println("Enter guess: ");
			double take = ask2.nextDouble();
			
			
			// Creating a variable to calculate the proximity of the user's guess to the actual number
			double humor = randomnum - take;
			
			/*
			 * checking systems(using line 128 to check whether  program
			 *  executes the right command when user correctly guesses the number.
			 */
			
			//System.out.println(randomnum);
			
			
			
			// In case user guesses the correct number
			if (take == randomnum) {
				
				System.out.println("");
				System.out.println("+-------------+");
				System.out.println("");
				
				System.out.println("Nice. Great Job.\nYou won!");
				System.out.println("You got it after " + trials +" attempt(s).");
				break;
				
				
				// In case User runs out of attempts without guessing the right number
			} else if (trials == 5 && take != randomnum) {
				
				System.out.println("");
				System.out.println("I'm sorry. You're out of attempts.");
				System.out.println("The number is " + randomnum);
				System.out.println("Rerun the program to try again!");
				break;
				
				
			// Adding a little humor to enhance user interaction with the game
				// In this case, it checks how close an attempt is to the random number
			}else if (humor == 1 || humor == -1) {
				
				System.out.println("");
				System.out.println("Whew...very close. You almost got me there.");
				
			
			// Just in case user input is lesser than the number, block gives a little hint
			}else if (take < randomnum && take > lborder) { 
				
				System.out.println("");
				System.out.println("Too low. Target is bigger");
				
				
			// Just in case user input is greater than the number, block gives a little hint
			}else if (take > rborder) {
				
				System.out.println("");
				System.out.println("That's too high. Target is between " + lborder + " and " + rborder);
				

				
			}else if (take < lborder){// In case user input is negative
				
				System.out.println("");
				System.out.println("That's too low. Target is between " + lborder + " and " + rborder);
				
			} else if(take > randomnum && take < rborder) {
				System.out.println("");
				System.out.println("Too high. Target is smaller than that!");
				
			}
			
			else {
				System.out.println("Ooops. Rerun NumberGuess");
				ask2.close();
				System.exit(0);
			}
			
			
			
			
			if (trials == 4) {
				
				System.out.println("You have one remaining attempt.");
			}
			
	
			
			// incrementing the number of attempts made by the user by 1 after each loop
			trials++;
		}
		
		
		ask.close();

		
		
		
		
		
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Go Hatters!");
		System.out.println("Program by: [Benjamin N. Davis]");


		
		
		
		
	}

}
