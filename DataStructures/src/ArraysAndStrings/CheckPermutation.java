package ArraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "lvoe";
		String str2 = "exam";
		// It sorts the two strings and compare them, time Complexity is O(n logn)
		//System.out.println("Are the two words permutations " + isPermutation(str1,str2));
		
		// It makes int array and increment the character count in array and verify it with second string is O(n logn)
		System.out.println("Are the two words permutations " + isPermutation1(str1,str2));

	}

	private static boolean isPermutation1(String str1, String str2) {
		if(str1.length()!=str2.length()) return false;
		
		int[] letters = new int[128];
		char[] s_array = str1.toCharArray();
		
		for(char c: s_array) {
			letters[c]++;
		}
		
		char[] s_array1 = str2.toCharArray();
			for(char c: s_array1) {
				letters[c]--;
				if(letters[c]<0) return false;
			}
			
		return true;
	}

	private static boolean isPermutation(String str1, String str2) {
		// TODO Auto-generated method stub
		
		if(str1.length()!=str2.length()) return false;
		
		char[] strSet1 = str1.toCharArray();
		char[] strSet2 = str2.toCharArray();
		
		Arrays.sort(strSet1);
		Arrays.sort(strSet2);
		
		for(int i=0;i<str1.length();i++) {
			if(strSet1[i]!=strSet2[i]) return false;
		}
		
	//	System.out.println( strSet1.toString() + "+" +  strSet2.toString());
	// Below ill be false as its values will be as 	C@15db9742+[C@6d06d69c
	//return strSet1.toString().equals(strSet2.toString());
		return true;

	}

}
