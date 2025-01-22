package studio1;

import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What are the integers?");
		int x = in.nextInt();
		int y = in.nextInt();
		double average = ((double) x+y)/2;
		System.out.println("Average of " + x + " and " + y + " is " + average + ".");
	}
}
