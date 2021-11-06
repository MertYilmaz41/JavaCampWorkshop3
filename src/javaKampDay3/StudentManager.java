package javaKampDay3;

public class StudentManager extends UserManager{
	@Override
	public void add(User user ) 
	{
		System.out.println("Öğrenci derse katıldı --> " + user.name);
		
	}
	
	public void homework(Student student) 
	{
		System.out.println("Öğrenci ödevini yaptı --> " + student.name);
	}
}
