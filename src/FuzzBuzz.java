

public class FuzzBuzz {
	private static String[] fizzBuzz = {"","Fizz","Buzz","Fizzbuzz"};
	public String version1(int number) {
		return fizzBuzz[(number%3==0?1:0)+(number%5==0?2:0)];
	}
	public String version2(int number) {
		return (number%3==0?"Fizz":"")+(number%5==0?"Buzz":"")+number;
	}
}



