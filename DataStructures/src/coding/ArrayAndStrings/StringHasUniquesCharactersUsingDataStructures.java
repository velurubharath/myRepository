package coding.ArrayAndStrings;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class StringHasUniquesCharactersUsingDataStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Requirement is to check whether all the characters in a string are
		 * unique? Without using additional data structures
		 */

		String name = "Bharath";
		System.out.println("Using HashTable " + checkUsingHashTable(name));
		System.out.println("Using bitVector " + checkUsingBitVector(name));
		System.out.println("Using Set "+checkUsingSortMethod(name));

	}

	private static boolean checkUsingSortMethod(String name) {
		// TODO Auto-generated method stub
		HashSet resultSet = new HashSet();
		for(int i=0;i<name.length();i++){
			resultSet.add(name.charAt(i));
		}
		
		if(resultSet.size()==name.length())
			return true;
		
		return false;
		
	}

	private static boolean checkUsingBitVector(String name) {

		int checker = 0;

		for (int i = 0; i < name.length(); i++) {
			int value = name.charAt(i) - 'a';
			if ((checker & (1 << value)) > 0)
				return false;
			else {
				checker |= (1 << value);
			}

		}

		return true;

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
