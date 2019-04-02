package deliverable_two;

import java.util.Scanner;

public class UnicodeCalculation {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String str1;
		String str2;
		int difference;// the difference between str1 and str2 in terms of unicode.
		int to_unicode;
		int sum_str1; // sum all converted unicode in str1
		int sum_str2; // sum all converted unicode in str2

		/* get user input string 1 */
		System.out.print("Please enter your first string: ");
		str1 = scnr.nextLine();

		/* get user input string 2 */
		System.out.print("Please enter your second string: ");
		str2 = scnr.nextLine();

		System.out.println("");

		/* convert each character in string 1 to unicode and get the sum */
		sum_str1 = 0;
		for (int i = 0; i < str1.length(); ++i) {
			to_unicode = (int) (str1.charAt(i));
			System.out.println(str1.charAt(i) + ": " + to_unicode);
			sum_str1 += to_unicode;
		}

		System.out.println("");
		/* convert each character in string 2 to unicode and get the sum */
		sum_str2 = 0;
		for (int i = 0; i < str2.length(); ++i) {
			to_unicode = (int) (str2.charAt(i));
			System.out.println(str2.charAt(i) + ": " + to_unicode);
			sum_str2 += to_unicode;
		}

		System.out.println("");

		/* calculate the different between str1 and str2 */
		difference = Math.abs(sum_str1 - sum_str2);
		System.out.println("Difference (as an absolute value): " + difference);

		scnr.close();

	}
}

