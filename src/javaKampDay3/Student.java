package javaKampDay3;

public class Student extends User{
	int studentId;
	
	public Student() 
	{
		
	}
	
	public Student(int studentId, String name, int age) 
	{
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}

	public int getStudentId()
	{
		return studentId;
	}

	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}
	
}
