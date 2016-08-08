package Pack1;
//compare the two different strings
public class StringCompareVJ {
	
	public static void main(String[] args){
		String str="vijay should become the king of selenium";
		String str1="Vijay became The king of selenium";
		
				
		String name = "Selenium WebDriver";
		boolean status = name.startsWith("Selenium");
			
		System.out.println("Status is "+status);
		
		boolean status2 = str.equalsIgnoreCase(str1);
		System.out.println("New Status2 is "+status2);
		
				
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.charAt(13));
		System.out.println(str.indexOf("e"));
		
		System.out.println(str1.substring(13,16));
		System.out.println(str1.substring(20));
		
		
		String fullname = "Selenium-qtp-grid-webdriver";
		String toolname [] = fullname.split("-");
		
		for (int i=0; i<toolname.length; i++){
			System.out.println("Value for "+i+" is "+toolname[i]);
			
			if (toolname[i].equalsIgnoreCase("selenium")){
				
				System.out.println("Test Passed");
				break;
			}
		}
		
	}

	
}
