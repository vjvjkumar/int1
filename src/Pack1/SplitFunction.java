package Pack1;
//Split a string and print one by one word?
public class SplitFunction {
	public static void main(String[] args) {
		String str="the rain have been started";
		
		String[] words=str.split(" ");
		
		System.out.println("Total words in the string: "+words.length);
		
		for(int i=0; i<=4; i++){
			System.out.println(words[i]);
		}
	}
}
