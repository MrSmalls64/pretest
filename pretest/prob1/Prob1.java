package prob1;

public class Prob1 {
	static void findMaxDifference() {
		int[] x = {5,1,7,8,3};
		for (int i=0; i < x.length; i++) {
			int difference = x[i]-x[i+1];
			if(difference<0) {
				difference = (difference*difference)/(-difference);
				//this is a very dumb way to go about getting the absolute value i know lol
				
			}
			System.out.println(difference);

			}
		}
		

	public static void main(String[] args) {
		findMaxDifference();

			
		}

	}


