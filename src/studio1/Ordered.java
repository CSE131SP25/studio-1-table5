package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean isOrdered_as1 = (x < y);
		boolean isOrdered_as2 = (y < z);
		boolean isOrdered_as = isOrdered_as1 && isOrdered_as2;
		boolean isOrdered_de1 = (x > y);
		boolean isOrdered_de2 = (y > z);
		boolean isOrdered_de = isOrdered_de1 && isOrdered_de2;

		boolean isOrdered = isOrdered_de || isOrdered_as;
		System.out.println(isOrdered);
		
		
		

	}

}
