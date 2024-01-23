package sub17;

public class Course {

	// 모든 사람이면 등록 가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass()
				.getSimpleName() + "이(가) Course1를 등록함");
	}

	// 학생만 등록 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이(가) Course2를 등록함");
	}
	
	//직장인 및 일반인만 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이(가) Course3를 등록함");	
		//person과 worker만 가능
		//person을 쓰면 모든 사람들이 다 가능하게 됨(student가 person의 자식이라..)
	}

}
