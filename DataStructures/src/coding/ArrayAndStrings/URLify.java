package coding.ArrayAndStrings;

public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Bharath is a good boy";
		String result = replaceTheWhiteSpaces(sentence);
		System.out.println("Result is "+ result);
		
	}

	private static String replaceTheWhiteSpaces(String sentence) {
		// TODO Auto-generated method stub
		
		char[] array = sentence.toCharArray();
		for(int i=0;i<sentence.length();i++){
			if(array[i]==' ')
				array[i]='c';
			else{
				System.out.println("No white spaces are found");
			}
		}
		return array.toString();
	}

}