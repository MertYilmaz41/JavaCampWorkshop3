package javaKampDay3;

public class InstructorManager extends UserManager{
	
	@Override
	public void add() 
	{
		System.out.println("E�itmen derse girdi ");
	}
	
	public void checkHomework(Instructor instructor) 
	{
		System.out.println("E�itmen �devi kontrol etti --> " + instructor.name);
	}

}
