import java.util.HashSet;
import java.util.Iterator;

public class NotRepeatedNumber {

	public static void main(String[] args) {

		/*The requirement is to find the msiisng number in the array of integers 
		 * Each integer is repeated twice. Expect to print the missin number in sequence
		 * Ex: 1,4,1,3,4 in this case 3 needs to be printed
		 */
		HashSet arr =new HashSet();
		arr.add(new Integer("1"));
		arr.add(new Integer("4"));
		arr.add(new Integer("1"));
		arr.add(new Integer("3"));
		arr.add(new Integer("4"));
		
		findMissingNumber(arr);
	}
	
	static void findMissingNumber(HashSet arr){
		
		Iterator it = arr.iterator();
		int count = 0;
		while(it.hasNext()){
			if(arr.contains(new Integer("1"))){
				count+=1;
				System.out.println("count is "+count);
				
			}
			if((count>=2)&&(count%2!=0)){
				System.out.println("Missing nuber is found");
				break;
			}
			
			
		}
		
	}

}
