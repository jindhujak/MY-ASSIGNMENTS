package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName(String name) {
		
		System.out.println("Name of the student: " +name);
	}
	public void studentDept(String dept) {
		System.out.println("Student's department: " +dept);
	
	}
	public void studentId(int id) {
		System.out.println("Student's ID: " +id);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName("Jindhu");
		s.studentDept("BIO-TECH");
        s.studentId(16);
      
		
	}

}
