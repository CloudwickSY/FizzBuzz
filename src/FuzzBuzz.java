
public class FuzzBuzz {
	private static String[] fizzBuzz = {"","fizz","buzz","fizzbuzz"};
	public static void main(String[] argv){
		for (int i=0; i<100;i++){
			System.out.println(fizzBuzz[ (i%3==0?1:0) + (i%5==0?2:0)] + i);	
		}
	}
}