package coding.ArrayAndStrings;

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first="bale";
		String second = "ale";
		boolean result = oneEditAway(first,second);
		System.out.println(result);
		
		
	}

	private static boolean oneEditAway(String first, String second) {
		
		if(Math.abs(first.length()-second.length())>1)
			return false;
		
		int index1 =0;
		int index2 =0;
		
		String s1 = first.length()<second.length()?first:second;
		String s2 = first.length()<second.length()?second:first;
		
		boolean foundDifference = false;
		while(index2<s2.length() && index1<s1.length()){
			if(s1.charAt(index1)!=s2.charAt(index2)){
			if(foundDifference) return false;
			foundDifference = true;
			
			if(s1.length()==s2.length()){
				index1++;
			}
			}else{
				index1++;
			}
			index2++;
			
			
		}
		
		
		
		
		return true;
		// TODO Auto-generated method stub
		
	}

}
