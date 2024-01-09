package sub8;

public class Exam extends Activity{
	public static void main(String[] args) {
		MainActivity ma = new MainActivity();
		ma.onCreate();
		
		Activity a = new MainActivity();
		
		MainActivity ma2=(MainActivity)a;
		
		System.out.println("test");

	}
	

}
