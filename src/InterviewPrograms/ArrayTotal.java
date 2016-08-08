package InterviewPrograms;
//Calculate the sum total in an array?

public class ArrayTotal {
	public static void main(String[] args) {

		int a[] = new int[]{12,23,45,56,47,85,15};
		
		/*System.out.println(a[0]);
		System.out.println(a[2]);
		System.out.println(a[0]+a[1]+a[2]);
		
		System.out.println(a.length);*/
		
		int total=0;
		
		for(int i=0;i<=6;i++)
		{
			total = total+a[i];
		}
		System.out.println(total);
		
	}

}
