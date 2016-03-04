import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		FizzBuzz fuzzBuzz = new FizzBuzz();
		for (int number = 1; number <= 100; number++) {
			System.out.println(fuzzBuzz.version1(number));
		}
		for (int number = 1; number <= 100; number++) {
			System.out.println(fuzzBuzz.version2(number));
		}
		int num = ReadNum();
		while (num > 0) {// Iterate until the user gives a negative number
			System.out.println(fuzzBuzz.version2(num));
			num = ReadNum();
		}
		System.out.println("Thank you for playing. Please come again.");
	}

	/**
	 * This function reads an integer from input
	 * and handles input mismatch.
	 * @return an integer read from console
	 */
	public static int ReadNum() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please provide with a positive intiger.\nNegative intiger will terminate the loop");
		int num = in.nextInt();
		try {
			num = in.nextInt();// To do: Verify user input
		} catch (java.util.InputMismatchException e) { // Catch imput missmatch Exception
			System.out.println("Invalid input :( . Please provide an integer.");
			num = ReadNum();
		}finally{
			//do nothing
		}
		in.close();
		return num;
	}
}