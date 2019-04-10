import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bharathveluru
 *
 */
public class missingNumberInSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The problem statement is to findout the missin number in the sequence
		// where each number repeats thrice.
		// Ex: 1112233

		String str = "11122333";
		char[] arr = str.toCharArray();

		System.out.println("Length of the array " + arr.length);
		findMissingNumber(arr);

	}

	public static void findMissingNumber(char[] arr) {

		int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

			if (arr[i] == '0') {
				count[0] += 1;
			}

			if (arr[i] == '1') {
				System.out.println("1 is found");
				count[1] += 1;
			}

			if (arr[i] == '2') {
				count[2] += 1;
			}

			if (arr[i] == '3') {
				count[3] += 1;
			}

			// Supposibly 10 Ifs for each digit. But I have checked only for 4
			// characters here

		}
		System.out.println("count 3 " + count[3]);

		for (int i = 0; i < 10; i++) {

			if (count[i] < 3) {
				System.out.println(i + " is missing in the sequence");
			}
		}

	}

}
