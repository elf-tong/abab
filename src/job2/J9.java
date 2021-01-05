package job2;

import java.util.Scanner;
public class J9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object
		Scanner input =new Scanner(System.in);  // Prompt the user to enter three numbers
		System.out.print("Enter three numbers: ");
		double numberl = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// Compute average
		double average = (numberl + number2 + number3) / 3;
		
		// Display results
		System.out.println("The average of " + numberl + " "+ number2
		 + " " + number3 + " is " + average);
	}

}
