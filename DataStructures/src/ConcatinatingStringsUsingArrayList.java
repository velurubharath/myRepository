import java.util.ArrayList;

public class ConcatinatingStringsUsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Concatination string of words into a sentence with and without StringBuilder
 */
		
		String[] words = {"Good","bad","ugly"};
		concatinateWithoutStringBuildet(words);
		concatinateWithStringBuildet(words);
	}

	private static void concatinateWithStringBuildet(String[] words) {
		// TODO Auto-generated method stub
		StringBuilder sentence = new StringBuilder();
		for(String w:words){
			
			sentence.append(w);
			sentence.append(" ");
		}
		
		System.out.println(sentence);
	}

	private static void concatinateWithoutStringBuildet(String[] words) {
		// TODO Auto-generated method stub
		
		String sentence = "";
		for(String w:words){
			sentence+=w;
		}
		
		System.out.println(sentence);
		
	}

	private static void intoArrayListS(String[] words) {
		// TODO Auto-generated method stub
		
		ArrayList sentence = new ArrayList();
		for(String w:words)
		{
			sentence.add(w);
		}
		
		System.out.println(sentence);
	}

}
