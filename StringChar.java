package week3.day1.assignment;

public class StringChar {
	
	public static void main(String[] args) {
		String text = "Java Exercises";
				 // Index for character E and s   
		char[] charArray = text.toCharArray();
		 for (int i = 0; i <charArray.length; i++) {
			 
			//System.out.println(charArray[i]);
			if(charArray[i]=='E'|| charArray[i]=='s')	
				{
				System.out.println("charcter is available: "+charArray[i]);
				}
			
		 }

	}
}
