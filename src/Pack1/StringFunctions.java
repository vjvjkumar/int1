package Pack1;

public class StringFunctions {
	public static void main(String[] args) {
		
		String str="the rain have been started";
		System.out.println(str.length());
		
		//compare
		String str1="The rain have been started";
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		//startswith and endswith
		System.out.println(str.startsWith("th55e"));
		System.out.println(str.endsWith("ted"));
		
		//indexof and charat
		System.out.println(str.indexOf('t'));
		System.out.println(str.charAt(25));
		
		//substring 
		System.out.println(str.substring(14));
		System.out.println(str.substring(9,4));
		
		}

}
