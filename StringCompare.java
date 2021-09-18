package week3.day1.assignment;

public class StringCompare {
	public static void main(String[] args) {
		String str1 = "I am Learning Java";
		String str2 = "I am learning ava";
		if (str1 == str2) {
			System.out.println("Strings are equal using ==");
		} 
		else {
			System.out.println("String are not equal using ==");
		}
		if (str1.equals(str2)) {
			System.out.println("Strings are equal using equals");
		} 
		else {
			System.out.println("String are not equal using equals");
		}

		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Strings are equal using equalsignorecase");
		} 
		else {
			System.out.println("String are not equal using  equalsignorecase");
		}

	}

}
