package javaKampDay3;

public class Instructor extends User{
	int instructorId;
	String courseName;
	
	public Instructor() 
	{
		
	}
	
	public Instructor(int instructorId, String name, int age, String courseName) 
	{
		this.instructorId = instructorId;
		this.name = name;
		this.age = age;
		this.courseName = courseName;
	}
	
	public int getInstructorId() 
	{
		return instructorId;
	}
	
	public void setInstructorId(int id) 
	{
		this.instructorId = id;
	}
	
	public String getCourseName() 
	{
		return courseName;
	}
	
	public void setCourseName(String courseName) 
	{
		this.courseName = courseName;
	}
}
