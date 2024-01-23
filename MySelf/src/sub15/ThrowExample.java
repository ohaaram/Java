package sub15;

public class ThrowExample {
	public static void main(String[] args) throws Exception{
		findClass();
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class.forName("Java.lang.String2");
	}

}
