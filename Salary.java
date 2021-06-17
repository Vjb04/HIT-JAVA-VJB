package basic;

import java.text.NumberFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double currentSalary;
		double raise;
		double newSalary;
		String rating;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print("Enter the performance rating (Excellent, Good, Poor): ");
		rating = scan.next();
		String e = "Excellent";
		String g = "Good";
		String p = "Poor";
		if(rating.equals(e))
			raise = (currentSalary/100)*6;
		else if(rating.equals(g))
			raise = (currentSalary/100)*4;
		else
			raise = (currentSalary/100)*1.5;
		newSalary = currentSalary + raise;
		System.out.println(newSalary);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary: " + money.format(currentSalary));
		System.out.println("Amount of your raise: "+ money.format(raise));
		System.out.println("Your new salary: : "+ money.format(newSalary));
		System.out.println();
	}

}