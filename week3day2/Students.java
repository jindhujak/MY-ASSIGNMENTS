package week3day2;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("The student Id is : " +id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Name of the Student : "+name);
		System.out.println("Student ID : "+id);
	}
	public void getStudentInfo(long phno, String email) {
		System.out.println("Phone number " +phno);
		System.out.println("E-mail ID : "+email);
	}
    public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(1016);
		s.getStudentInfo(1018, "Jindhu");
		s.getStudentInfo(9087654321l, "123@gmail.com");
	}


}
