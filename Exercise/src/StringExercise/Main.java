package StringExercise;

import java.util.Scanner;

public class Main {

	static int maxNumber(String S) {
		int maxval = 0;
		int currentval = 0;

		if (S == null)
			return 0;

		// traverse through the given string
		for (int i = 0; i < S.length(); i++) {

			// identify if there is a digit, if yes
			// convert it into integer till there are consecutive digits
			if (Character.isDigit(S.charAt(i))) {
				currentval = (currentval * 10) + Character.getNumericValue(S.charAt(i));

				// update the maximum value if end of string is reached 
				// with last character being digit
				if (i == S.length() - 1) {
					maxval = Math.max(maxval, currentval);
				}

				// update maximum value and reset the current value variable
			} else {
				maxval = Math.max(maxval, currentval);
				currentval = 0;
			}
		}
		return maxval;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		System.out.println("Maximum number extracted is " + maxNumber(S));
		sc.close();
	}

}
