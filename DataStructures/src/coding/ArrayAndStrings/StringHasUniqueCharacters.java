package coding.ArrayAndStrings;

import java.lang.reflect.Array;

public class StringHasUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Requirement is to check whether all the characters in a string are
		 * unique? Without using additional data structures
		 */

		String name = "Bharath";
		System.out.println(isUniqueCharacters(name));
	}

	private static boolean isUniqueCharacters(String name) {
		// TODO Auto-generated method stub

		char[] nameArray = name.toCharArray();
		for (int i = 0; i < nameArray.length; i++) {
			for (int j = i + 1; j < nameArray.length; j++) {
				if (nameArray[i] == nameArray[j])
					return false;
			}
		}
		return true;

	}

}
