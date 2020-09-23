package ArraysAndStrings;

import java.util.Arrays;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Bharath";	
		//Used boolean array for checking the chars status, time complexity is O(n)
		System.out.println("Is the string Unique " + isUnique(str));

		//used sort to check, time complexity is O(n logn)
		//System.out.println("Is the string Unique1 " + isUnique1(str));
		
		//used to check all characters with each other, time complexity is O(n^2)
		//System.out.println("Is the string Unique2 " + isUnique2(str));
	}

	private static boolean isUnique2(String str) {
		
		char[] char_set = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				
				if(char_set[i]==char_set[j]) return false; 
			}
		}
		
		return true;
	}

	private static boolean isUnique1(String str) {
		// TODO Auto-generated method stub
		char[] char_set = str.toCharArray();
		Arrays.sort(char_set);
	//Didnt give the increment here as in the next line i is incremented
		for(int i=0;i<str.length()-1;) {
			if(char_set[i]==char_set[++i]) {
				System.out.println(char_set[i]);
				return false;
			}
			}
		
		return true;
		
	}

	private static boolean isUnique(String str) {

//checking the string the value if it is more than 128  
	if(str.length()>128) return false;
	boolean[] char_set = new boolean[128];
	for(int i=0;i<str.length();i++) {
		int value = str.charAt(i);
		
//checking if already that character is avaialable
		if(char_set[value]) {
			return false;
		}

//setting that particular bit as true
		char_set[value]=true;
	}
	return true;
	}

}
