package javaKampDay3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Mert",20);
		Student student2 = new Student(2,"İlker",19);
		
		
		Instructor instructor1 = new Instructor(1,"Engin",30,"JAVA");
		Instructor instructor2 = new Instructor(2,"Melih",37,"C#");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.homework(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.checkHomework(instructor1);
		
		UserManager userManager = new UserManager();
		userManager.add(instructor2);
		userManager.add(student2);
		

	}

}
