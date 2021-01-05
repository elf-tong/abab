package job2;

import java.util.Scanner;
public class J15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		// Enter annual interest rate in percentage, e.g., 7.25%
		System.out.print("Enter annual interest rate, e.g., 7.25%: ");
		double annualInterestRate=input.nextDouble();
		
		// Obtain monthly interest rate
		double monthlylnterestRate=annualInterestRate / 1200; 
		
		System.out.print("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();
		
		// Enter loan amount
		System.out.print("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();
		
		// Calculate payment
		double monthlyPayment = loanAmount * monthlylnterestRate /(1-1 / Math.pow(1+ monthlylnterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		// Display results
		System.out.println("The monthly payment is S" +(int)(monthlyPayment * 100)/ 100.0);
		System.out.println("The total payment is S" + (int)(totalPayment * 100)/ 100.0);
	}

}