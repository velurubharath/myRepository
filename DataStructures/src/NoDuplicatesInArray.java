import java.util.LinkedHashSet;

public class NoDuplicatesInArray {

	/*
	 * Duplicates removed from an array without using any library initial array:
	 * 1,1,4,5,6,2,4,2 final array: 1,4,5,6,2
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 1, 4, 5, 6, 2, 4, 2 };

		// LinkedHashSet array = new LinkedHashSet();
		// for (int i = 0; i < inputArray.length; i++) {
		// array.add(inputArray[i]);
		// }

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					for (int k = j; k < array.length; k++) {

						if (k < array.length - 1)
							array[k] = array[k + 1];
						else {
							array[array.length - 1] = 0;
						}

					}
				}
			}
		}

		for (int element = 0; element < array.length; element++) {
			System.out.println(array[element]);
		}
	}

}
