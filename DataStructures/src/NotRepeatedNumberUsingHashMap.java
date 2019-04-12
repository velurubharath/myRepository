import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*The requirement is to find the msiisng number in the array of integers 
 * Each integer is repeated twice. Expect to print the missing number in sequence
 * Ex: 1,4,1,3,4 in this case 3 needs to be printed
 */

public class NotRepeatedNumberUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 4, 1, 2, 2, 11 };
		isNumberMissing(array);

	}

	static void isNumberMissing(int[] array) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			if (hm.containsKey(array[i])) {
				hm.put(array[i], hm.get(array[i]) + 1);

				// System.out.println("Key is " + array[i] + " Value is " +
				// hm.get(array[i]));

			}

			else {
				hm.put(array[i], 1);

			}
		}

			Set set = hm.entrySet();
			Iterator it = set.iterator();
			while (it.hasNext()) {
				Map.Entry mentry = (Entry) it.next();
				System.out.println("Key is " + mentry.getKey() + " Value is " + mentry.getValue());

			}

			if (hm.containsValue(1)) {
				System.out.println("Missing number is found ");
			}

		

	}
}
