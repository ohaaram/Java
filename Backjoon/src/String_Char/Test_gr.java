package String_Char;

public class Test_gr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "동해물과 백두산이 마르고 닳도록 하느님이";
		String comp = "마르고 닳도록";

		if (comp.equals(str.substring(10, 17)))
			System.out.println("되네?");
		else
			System.out.println("안되네?");
	}

}
