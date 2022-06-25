package oop;

public class student {

		int studentId;
		String studentName;
		String studentCity;
		
		public void study()
		{
			System.out.println(studentName +"is studing");
		}
		public void showfulldetails() {
			System.out.println("My name is" + studentName);
			System.out.println("My Id is" + studentId);
			System.out.println("My City is" + studentCity);
		}
	

	public static void main(String[] args) {
		student st1;
		st1=new student();
		st1.studentName="Ram";
		st1.studentId=123;
		st1.studentCity="ayodhya";
		st1.study();
		st1.showfulldetails();

	}

}
