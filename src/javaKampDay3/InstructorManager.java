package javaKampDay3;

public class InstructorManager extends UserManager{
	
	@Override
	public void add(User user) 
	{
		System.out.println("E�itmen derse girdi --> " + user.name);
	}
	
	public void checkHomework(Instructor instructor) 
	{
		System.out.println("E�itmen �devi kontrol etti --> " + instructor.name);
	}

}
