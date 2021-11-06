package javaKampDay3;

public class StudentManager extends UserManager{
	@Override
	public void add( ) 
	{
		System.out.println("Öğrenci derse katıldı");
		
	}
	
	public void homework(Student student) 
	{
		System.out.println("Öğrenci ödevini yaptı --> " + student.name);
	}
}
