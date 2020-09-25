package ArraysAndStrings;

public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Mr John Smith   ";
		int trueLength= 13;
		int count=0;
		char[] strArray = str.toCharArray();
		
		int charLength = strArray.length;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') count++;
		}
		
		System.out.println("Total white spaces "+ count);
		
		int index = charLength+2*count;
		if(trueLength<str.length()) strArray[trueLength]='\0';
		
		for(int i=charLength-1;i>=0;i--) {
			if(strArray[i]==' ') {
				strArray[index-1]='0';
				strArray[index-2]='2';
				strArray[index-3]='%';
				index=index-3;
			} else {
				strArray[index-1]=strArray[i];
				index--;
			}
		}
		System.out.println("Final String "+ strArray.toString());
		
	}

}
