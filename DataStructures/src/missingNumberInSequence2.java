

public class missingNumberInSequence2 {

	/*
	 * FInd the missing number in the series where each digit repeats thrice Ex:
	 * 11122233444 Here program should print digit '3'. Only one number is missing
	 * as per the requirement
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 1, 1, 1, 5, 5, 5 };
		isMissing(arr);
		System.out.println("Execution Complete");

	}

	static boolean isMissing(int[] arr) {
		for (int i = 0; (i + 2) < arr.length;) {
			System.out.println(i);
			if (arr[i] != arr[i + 2]) {

				System.out.println(arr[i] + " is missing");
				return true;
			}
			i += 3;

		}
		return false;
	}
}