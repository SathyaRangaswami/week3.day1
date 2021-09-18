package week3.day1.assignment;

public class Sudents {
	public void getStudentInfo(String name)
	{
	System.out.println("Student name: "+name);
	}
	public void getStudentInfo(int id)
	{
	System.out.println("Student id: "+id);
	}
	public void getStudentInfo(String email, long pno)
	{
	System.out.println("Student Email: "+email	);
	System.out.println("Student Phone number: "+pno);
	}
	public void getStudentInfo(String address,int pincode)
	{
	System.out.println("Student Address: "+address);
	System.out.println("pincode :"+pincode);
	}

	public static void main(String[] args) {
		Sudents st=new Sudents();
	st.getStudentInfo(21584);
	st.getStudentInfo("sathya");
	st.getStudentInfo("coimbatore", 641020);
	st.getStudentInfo("testleaf@gmail.com",1234567899);
	
}
}
