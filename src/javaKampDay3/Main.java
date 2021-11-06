package javaKampDay3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Mert",20);
		
		
		Instructor instructor1 = new Instructor(1,"Engin",30,"JAVA");

		
		StudentManager studentManager = new StudentManager();
		studentManager.homework(student1);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.checkHomework(instructor1);
		
		
	}

}
