package Pack1;
//Split a string and print one by one word?
public class SplitFunctionVJ 
{
	public static void main(String[] args)
{
		
		String sentence="vijay should become the king of selenium";
		
		String[] words=sentence.split(" ");
		 
		
		 for(int i=0; i<words.length; i++)
		 {
		 System.out.println(words[i]);
		 }
}
}
