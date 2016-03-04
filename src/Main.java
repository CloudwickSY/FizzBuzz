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
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while (num>0){//Iterate until the user gives a negative number
			System.out.println(fuzzBuzz.version2(num));
			num = in.nextInt();
		}
		
		
	}
}
