package sub9;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person=new Person();
		person.ordering(String::compareToIgnoreCase);
		//person.ordering((a,b)->a.compareToIgnoreCase(b));
	}

}
