package InterviewPrograms;
//PRint a string in the reverse order? Ex: selenium  output: muineles
public class RevString 
{
	public static void main(String[] args) 
{
		String name="selenium";
		
		System.out.println("Total chars: "+name.length());
		
		for(int i=7;i>=0;i--)
		{
		System.out.print(name.charAt(i));
		}
}
}
