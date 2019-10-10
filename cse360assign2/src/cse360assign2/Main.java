package cse360assign2;

/*
 * Name: Andrew Garza
 * ID: 1213817694
 * Seat: R A 8
 * Assignment Number: 2
 */

import java.util.Scanner;
/**
 * Main class for using and testing the AddingMachine class. It just allows
 * you to test out all of the operations that the AddingMachine class contains
 * @author Andrew Garza
 *
 */
public class Main {
	public static void main (String[] args) {
		int action = 5;
		int value;
		AddingMachine myCalculator = new AddingMachine();
		Scanner scan = new Scanner(System.in);
		//Continues looping until user inputs 0
		while(action != 0) {
			//Displays Menu
			System.out.println("WHAT DO YOU WANNA DO??");
			System.out.println("0 - Exit");
			System.out.println("1 - Add");
			System.out.println("2 - Subtract");
			System.out.println("3 - To string");
			System.out.println("4 - Get total");
			System.out.println("5 - Clear");
			action = scan.nextInt();
			//Add value if user puts in 1
			if(action == 1) {
				System.out.println("HOW MUCH???");
				value = scan.nextInt();
				myCalculator.add(value);
			}
			//Subtract value if user puts in 2
			if(action == 2) {
				System.out.println("HOW MUCH???");
				value = scan.nextInt();
				myCalculator.subtract(value);
			}
			//Prints out the history string if user puts in 3
			if(action == 3) {
				System.out.println("HERE IT IS:");
				System.out.println(myCalculator.toString());
			}
			//Prints out the total if the user puts in 4
			if(action == 4) {
				System.out.println(myCalculator.getTotal());
			}
			//Resets everything if the user puts in 5
			if(action == 5) {
				System.out.println("CLEARED!!!");
				myCalculator.clear();
			}
		}
		scan.close();
	}
}
