package javaKampDay3;

public class InstructorManager extends UserManager{
	
	@Override
	public void add() 
	{
		System.out.println("Eðitmen derse girdi ");
	}
	
	public void checkHomework(Instructor instructor) 
	{
		System.out.println("Eðitmen ödevi kontrol etti --> " + instructor.name);
	}

}
