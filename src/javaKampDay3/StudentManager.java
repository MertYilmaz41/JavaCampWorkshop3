package javaKampDay3;

public class StudentManager extends UserManager{
	@Override
	public void add( ) 
	{
		System.out.println("��renci derse kat�ld�");
		
	}
	
	public void homework(Student student) 
	{
		System.out.println("��renci �devini yapt� --> " + student.name);
	}
}
