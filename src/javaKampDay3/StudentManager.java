package javaKampDay3;

public class StudentManager extends UserManager{
	@Override
	public void add(User user ) 
	{
		System.out.println("��renci derse kat�ld� --> " + user.name);
		
	}
	
	public void homework(Student student) 
	{
		System.out.println("��renci �devini yapt� --> " + student.name);
	}
}
