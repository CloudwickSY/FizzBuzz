
public class Main {
	public static void main(String[] argv){
		FuzzBuzz  fuzzBuzz = new FuzzBuzz ();
		for (int number=1; number<=100;number++){
			System.out.println(fuzzBuzz.version1(number));
		}
		for (int number=1; number<=100;number++){
			System.out.println(fuzzBuzz.version2(number));
		}
	}
}
