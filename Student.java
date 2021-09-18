package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName(String sName)
	{
		System.out.println("Student name: "+sName);
	}
	public void studentDept(String sdname)
	{
		System.out.println("Student Department name "+sdname);
	}
	public void studentId(int id)
	{
		System.out.println("Student Id "+id);
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.collegeName("Kongu");
		st.collegeCode(711);
		st.collegeRank(82);
		st.deptName("Computer Technology");
		st.studentName("sathya");
		st.studentDept("CT");
		st.studentId(256341);
	}

}
