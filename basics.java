import java.util.Scanner;

public class basics {

	public static void main(String[] args) {

		System.out.println("Please enter your age:");

		Scanner in = new Scanner(System.in);
		int age = in.nextInt();

		if (age <= 0) {
			System.out.println("Invalid input");

		} else if (age >= 1 && age <= 5) {
			System.out.println("Infant");

		} else if (age >= 6 && age <= 10) {
			System.out.println("Child");

		} else {
			System.out.println("Adult");

		}

	}

}
