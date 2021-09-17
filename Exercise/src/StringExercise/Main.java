package StringExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static BigInteger maxNumber(String S) {
		BigInteger maxval = BigInteger.valueOf(0);
		BigInteger currentval = BigInteger.valueOf(0);

		if (S == null || S.length() > 20 || S.length() < 2) {
			return BigInteger.valueOf(-404);
		}

		if (S.matches("^[a-z0-9]*$")) {

			// traverse through the given string
			for (int i = 0; i < S.length(); i++) {

				// identify if there is a digit, if yes
				// convert it into BigInteger till there are consecutive digits
				if (Character.isDigit(S.charAt(i))) {
					currentval = currentval.multiply(BigInteger.valueOf(10))
							.add(BigInteger.valueOf(Character.getNumericValue(S.charAt(i))));

					// update the maximum value if end of string is reached
					// with last character being digit
					if (i == S.length() - 1) {
						maxval = maxval.max(currentval);
					}

					// update maximum value and reset the current value
				} else {
					maxval = maxval.max(currentval);
					currentval = BigInteger.valueOf(0);
				}

			}
			return maxval;
		}

		else {

			return BigInteger.valueOf(-404);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		System.out.println(maxNumber(S));
		sc.close();
	}

}
