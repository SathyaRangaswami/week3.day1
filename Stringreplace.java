package week3.day1.assignment;

public class Stringreplace {
	public static void main(String[] args) {

		String str = "I am working with Java8";
		String str1 = str.replaceAll("\\s", "");
		String replace = "";
		// replace 8 to 11
		// Print the characters from 5 to 14
		char[] charArray = str1.toCharArray();
			 replace = str1.replace(charArray[8], charArray[11]);
		
		System.out.println(replace);

		System.out.print("String print from 5 to 14 :");
		for (int j = 5; j <= 14; j++) {
			System.out.print(charArray[j]);
		}
		
	}

}
