package fundamentals;

public class Student {
	
	String sName;
	static String sQualification;
	long sRollNum;
	
	void displayStudentDetials() {
		System.out.println("Student Name: "+sName);
		System.out.println("Student Qualification: "+sQualification);
		System.out.println("Student Roll Num: "+sRollNum);
	}

	public static void main(String[] args) {
		
		Student student1= new Student();		
		student1.sName = "Ramesh";
		student1.sQualification = "B.Tech";
		student1.sRollNum = 1001;		
		student1.displayStudentDetials();
		
		System.out.println("---------------------------");
		
		Student student2= new Student();
		student2.sName = "Krishna";
		student2.sQualification = "B.Tech";
		student2.sRollNum = 1002;		
		student2.displayStudentDetials();
		
		System.out.println("---------------------------");
		student1.sName = "Ramesh Kumar";
		student1.displayStudentDetials();
		System.out.println("---------------------------");
		student2.displayStudentDetials();
		
	}

}
