package prob2;

public class Prob2 {
	static void countVowelSequences() {
		String str = "Hello World";
		int counter = 0;
		for(int i = 0; i < str.length(); i++) {
			str = str.toUpperCase();
			if( str.charAt(i)="a" ) {
				counter++;
			}else if( str.charAt(i)="e" ) {
				counter++;
			}else if( str.charAt(i) ="i" ) {
				counter++;
			}else if( str.charAt(i) ="o" ) {
				counter++;
			}else if( str.charAt(i) ="u" ) {
				counter++;
			}
		}
	}

	public static void main(String[] args) {
		countVowelSequences();
	}

}
