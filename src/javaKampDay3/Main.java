package javaKampDay3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1,"Mert",20);
		Instructor instructor = new Instructor(1,"Engin",30,"JAVA");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add();
		
		UserManager userManager = new UserManager();
		userManager.add();
		System.out.println("");

	}

}
