import java.util.Scanner;

public class Main {
	public static void main(String[] argv){
		FizzBuzz  fuzzBuzz = new FizzBuzz ();
		for (int number=1; number<=100;number++){
			System.out.println(fuzzBuzz.version1(number));
		}
		for (int number=1; number<=100;number++){
			System.out.println(fuzzBuzz.version2(number));
		}
		
		/* Create a scanner so that we can read from the user */
		System.out.println("Please provide with a positive intiger.\nNegative intiger will terminate the loop");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();//To do: Verify user input
		while (num>0){//Iterate until the user gives a negative number
			System.out.println(fuzzBuzz.version2(num));
			System.out.println("~~~~~~~~~~~~~\nPlease provide with a positive intiger.\nNegative intiger will terminate the loop"); 
			num = in.nextInt();
		}
		in.close();
		System.out.println("Thank you for playing. Please come again.");
		
	}
}
