package sub6;

public class InstanceofExample {
	public static void personInfo(Person person) {
		System.out.println("name : "+person.name);
		person.walk();
	
		if(person instanceof Student Student) {
			System.out.println("studentNo: "+Student.studentNo);
			Student.study();
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);

		System.out.println();

		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}
}
