package mypackage;

import java.util.HashSet;
import java.util.Scanner;

public class Memory {

	public void requestInput() {
		Scanner input = null;

		int count = 0;
		HashSet<Integer> list = new HashSet<>();
		for (int i = 1; i <= 10; i++) {

			input = new Scanner(System.in);
			System.out.print("Enter number: ");

			try {
				int myInput = input.nextInt();
				count++;
				if (list.contains(myInput)) {
					System.err.println("This is not a unique number");
					i--;
				} else {
					System.out.println("This is a unique number");
					list.add(myInput);
				}
			} catch (Exception e) {
				System.err.println("This is not an integer.");
				i--;
			}

		}

		System.out.println(list);
		System.out.println("You have typed " + count + " times");

		input.close();

	}

}
