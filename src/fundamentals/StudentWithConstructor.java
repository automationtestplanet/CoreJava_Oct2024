package fundamentals;

public class StudentWithConstructor {

	String sName;
	static String sQualification;
	long sRollNum;

	public StudentWithConstructor(String sName, String sQualification, long sRollNum) {
		this.sName = sName;
		StudentWithConstructor.sQualification = sQualification;
		this.sRollNum = sRollNum;
		
	}

	void displayStudentDetials() {
		System.out.println("Student Name: " + sName);
		System.out.println("Student Qualification: " + sQualification);
		System.out.println("Student Roll Num: " + sRollNum);
	}

	public static void main(String[] args) {

		StudentWithConstructor student1 = new StudentWithConstructor("Ramesh",  "B.Tech", 1001);	
		student1.displayStudentDetials();
		
		
		System.out.println("---------------------------");
		
		StudentWithConstructor student2 = new StudentWithConstructor("Krishna",  "B.Tech", 1002);
		student2.displayStudentDetials();
		
	}

}
