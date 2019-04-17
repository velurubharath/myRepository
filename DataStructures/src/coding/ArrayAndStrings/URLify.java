package coding.ArrayAndStrings;

public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Bharath is a good boy   ";
		char[] sentenceArray = sentence.toCharArray();
		
		int spaces = findBlankSpaces(sentenceArray);
		System.out.println("Blank spaces in the sentence "+spaces);
		
		int truelength = 50;
		
		replaceSpaces(sentenceArray,truelength,spaces);
		
	}

	private static void replaceSpaces(char[] sentenceArray, int truelength, int spaces) {
		// TODO Auto-generated method stub
		
		int index= truelength+spaces*2;
		if(truelength<sentenceArray.length) sentenceArray[truelength]='\0';
		for(int i=truelength-1;i>=0;i--){
			if(sentenceArray[i]==' '){
				sentenceArray[index-1]='0';
				sentenceArray[index-2]='2';
				sentenceArray[index-3]='%';
				index-=3;
			}else{
				sentenceArray[index-1]=sentenceArray[i];
				index--;
			}
		}
		
	}

	private static int findBlankSpaces(char[] sentenceArray) {
		// TODO Auto-generated method stub
		int count =0;
		
		for(int i=0;i<sentenceArray.length;i++){
			if(sentenceArray[i]==' ')
				count++;
		}
		
		return count;
	}


}
