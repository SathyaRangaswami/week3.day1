package week3.day1.assignment;

public class Stringreplace {
	public static void main(String[] args) {
		String sentence = "I am working with Java8";
	      String replacedword = sentence.replaceAll("\\d", "11");
	      System.out.println("Repaced  8 with 11: "+replacedword);
		  System.out.println( replacedword.concat("#"));
		  System.out.println(replacedword.substring(5,14));

				
	}

}
