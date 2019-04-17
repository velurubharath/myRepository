package coding.ArrayAndStrings;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaabbbcccdd";
		Compressed(str);
		System.out.println(Compressed(str));
	}

	private static String Compressed(String str) {
		
		StringBuilder compressed =  new StringBuilder();
		int count=0;
		for(int i=0;i<str.length();i++){
			count++;
			if(i+1>=str.length()||str.charAt(i)!=str.charAt(i+1)){
				compressed.append(str.charAt(i));
				compressed.append(count);
				count=0;
			}
		}
		
		
		return str.length()>compressed.length()?compressed.toString():str;
		
		
		
		
	}

}
