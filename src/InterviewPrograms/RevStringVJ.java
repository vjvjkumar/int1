package InterviewPrograms;

public class RevStringVJ 
{
	public static void main(String[] args)
{
	String words = "vijay should become the king of selenium";
	
	System.out.println("Total Chars: "+words.length());
	
	   for(int i=39; i>=0; i--)
	   {
	   System.out.print(words.charAt(i));
	   }
}
}
