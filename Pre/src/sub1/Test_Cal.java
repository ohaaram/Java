package sub1;

public class Test_Cal {
	
	private static Test_Cal instance= new Test_Cal();//생성?
	
	public static Test_Cal getInstance() {
		return instance;
	}
	private Test_Cal(){	}
	
	
	public int oven(int A,int B) {		
		return A+B;
	}

}
