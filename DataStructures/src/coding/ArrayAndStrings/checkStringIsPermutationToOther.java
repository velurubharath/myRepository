package coding.ArrayAndStrings;

import java.nio.charset.Charset;
import java.util.Arrays;

public class checkStringIsPermutationToOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * requiremetn is to check two words are permutable to other
		 */

		String word1 = "sky";
		String word2 = "yks";
		boolean result = isPermutable(word1, word2);
		System.out.println("Result is " + result);
		
		System.out.println("The two string are Permutatuion is " + sort(word1).equals(sort(word2)));

	}

	private static String sort(String word1) {
		// TODO Auto-generated method stub
		
		char[] word1Array = word1.toCharArray();
		Arrays.sort(word1Array);
		return new String (word1Array);
		
		
	}

	private static boolean isPermutable(String word1, String word2) {
		// TODO Auto-generated method stub
		if (word1.length() == word2.length()) {
			int[] array = new int[128];

			char[] word1Array = word1.toCharArray();
			char[] word2Array = word2.toCharArray();

			for (char c : word1Array) {
				array[c]++;
			}

			for (char c : word2Array) {
				array[c]--;
				if (array[c] < 0)
					return false;

				return true;
			}

		} else {
			System.out.println("Both are of different length, So not a permutation");

		}
		return false;
	}

}
