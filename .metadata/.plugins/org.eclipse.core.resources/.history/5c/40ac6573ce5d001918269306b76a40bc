package coding.ArrayAndStrings;

import java.util.Hashtable;

public class StringHasUniquesCharactersUsingDataStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Requirement is to check whether all the characters in a string are
		 * unique? Without using additional data structures
		 */

		String name = "Bharath";
		System.out.println("Using HashTable "+checkUsingHashTable(name));
	}

	private static boolean checkUsingHashTable(String name) {
		// TODO Auto-generated method stub
		Hashtable<Character, Integer> characterArray = new Hashtable<Character, Integer>();
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (characterArray.containsKey(charArray[i])) {
				return false;
			} else {
				characterArray.put(charArray[i], 1);
			}
		}

		System.out.println(characterArray);

		return true;

	}

	
	
}
