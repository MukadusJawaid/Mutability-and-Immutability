public class Mutable {
	String courseName;
	String courseCode;
	int rollNumber;
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName=courseName;
}
public int getRollNumber() {
	return rollNumber;
}
public void setRollNumber(int rollNumber) {
	this.rollNumber=rollNumber;
}
public String getCourseCode() {
	return courseCode;
}
public void setCourseCode(String courseCode) {
	this.courseCode=courseCode;
}
public static void main(String[] args) {
	Mutable obj = new Mutable();
	System.out.println("PROMOTED STUDENTS FROM 5TH SEMESTER");
	obj.setRollNumber(104);
	obj.setCourseCode("SWE-129");
	obj.setCourseName("SDA");
	System.out.println("Department: Software Engineering RollNumber: "+obj.getRollNumber()+" CourseCode: "+obj.getCourseCode()+" CourseName: "+obj.getCourseName());
	
    
}
}
