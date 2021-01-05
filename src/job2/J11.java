package job2;

import java.util.Scanner;
public class J11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);  // Prompt the user for input
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt(); 
		int remainingSeconds = seconds % 60; // Seconds remaining
		System.out.println(seconds + " seconds is "+" minutes and " + remainingSeconds + " seconds");
	}

}
