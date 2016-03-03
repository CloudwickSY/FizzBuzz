
/**
 * FuzzBuzz class is a class that contains an implementation of the fizzBuzz algorithm 
 * For multiples of three print “Fizz” instead of the number
 * For the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”.
 * @author Stanislav
 *
 */
public class FuzzBuzz {
	private static String[] fizzBuzz = {"","Fizz","Buzz","FizzBuzz"};
	/**
	 * 
	 * @param number the value for which we need to compute fizzBuzz
	 * @return
	 */
	public String version1(int number) {
		String result = fizzBuzz[(number%3==0?1:0)+(number%5==0?2:0)];
		return result.isEmpty()?(number+""):result;
	}
	/**
	 * 
	 * @param number the value for which we need to compute fizzBuzz
	 * @return the fizzBuzz string for the input
	 */
	public String version2(int number) { 
		String result = (number%3==0?"Fizz":"")+(number%5==0?"Buzz":"");
		return result.isEmpty()?(number+""):result;
	}
}



