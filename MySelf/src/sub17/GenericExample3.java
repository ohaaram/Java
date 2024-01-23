package sub17;

public class GenericExample3 {
	public static void main(String[] args) {
		//모든 사람이 신청가능
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		
		//학생만 신청가능
	Course.registerCourse2(new Applicant<Student>(new Student()));	
	Course.registerCourse2(new Applicant<Student>(new HighStudent()));	
	Course.registerCourse2(new Applicant<Student>(new MiddleStudent()));
	//Course.registerCourse2(new Applicant<Person>(new Person()));
	
	//직장인 및 일반인만 신청가능
	Course.registerCourse3(new Applicant<Person>(new Person()));
	Course.registerCourse3(new Applicant<Worker>(new Worker()));
	
	}

}