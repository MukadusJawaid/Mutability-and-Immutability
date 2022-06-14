public final class MutabilityAndImmutability {
	final String courseName;
	final int rollNumber;
	final String courseCode;
public MutabilityAndImmutability (String courseName, int rollNumber, String courseCode) {
	this.courseName = courseName;
	this.rollNumber = rollNumber;
	this.courseCode = courseCode;
}
public String getCourseName() {
	return courseName;
}
public int getRollNumber() {
	return rollNumber;
}
public String getCourseCode() {
	return courseCode;
}
public static void main(String[] args) {
	MutabilityAndImmutability  obj = new MutabilityAndImmutability  ("Software Construction and Development" , 100,"SWE-102");
	System.out.println("FAILED STUDENTS IN 4TH SEMESTER\n");
	System.out.println("Department: Software Engineering RollNumber "+obj.getRollNumber()+" CourseCode: "+obj.getCourseCode()+" CourseName: "+obj.getCourseName());
        MutabilityAndImmutability  obj1 = new MutabilityAndImmutability  ("Artifical Intelligence" ,130,"SWE-103");
	System.out.println("Department: Software Engineering RollNumber "+obj1.getRollNumber()+" CourseCode: "+obj1.getCourseCode()+" CourseName: "+obj1.getCourseName());
    
}
}

