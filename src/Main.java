
public class Main {
	public static void main(String[] argv){
		FuzzBuzz  fuzzBuzz = new FuzzBuzz ();
		for (int number=0; number<100;number++){
			fuzzBuzz.version1(number);
		}
		for (int number=0; number<100;number++){
			fuzzBuzz.version2(number);
		}
	}
}
