package workshop;

public class Subject {

	// properties of subject
	public String subjectName;
	public String subjectCode;

	// constructor
	public Subject() {
		System.out.println("defualt constructor ");

	}

	// instance methods
	public void getSubjectDetails() {
		System.out.println("this is getSubjectDetails method");
	}

	public void getSubjectDetails(String subjectName) {
		System.out.println("this is getSubjectDetails method");
		System.out.println("subject name:" + subjectName);
	}

//to get the length of the given subject
	public void getNumberOfChar(String subjectName) {
		System.out.println("finding the char count");
		System.out.println("subject char count:" + subjectName.length());
	}
}
