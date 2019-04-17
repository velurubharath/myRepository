package coding.ArrayAndStrings;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "bbccdd";
		System.out.println(isPermutationOfPalindrome(word));
		

	}

	static boolean isPermutationOfPalindrome(String word) {
		int[] table = buildCharFrequencyTable(word);
		return checkMaxOnOdd(table);
	}

	private static boolean checkMaxOnOdd(int[] table) {
		// TODO Auto-generated method stub
		
		boolean foundOdd = false;
		for(int count:table){
			if(count%2==1){
				if(foundOdd)
				return false;
			}
			foundOdd = true;
		}
		return true;
	}

	static int[] buildCharFrequencyTable(String word) {
		int[] table = new int[100];
		for (char c : word.toCharArray()) {
			int x = getCharNumber(c);
			if (x != -1) {
				table[x]++;
			}
		}
		return table;

	}

	private static int getCharNumber(char c) {
		// TODO Auto-generated method stub
		
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		if(a<=Character.getNumericValue(c) && Character.getNumericValue(c)<=z){
//			System.out.println(a);
//			System.out.println(Character.getNumericValue(c));
//			System.out.println(z);
			return c-a;
		}
		return -1;
		
	}

}
