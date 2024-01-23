package sub15;

public class TestEx {
	public static void main(String[] args) {

		String[] strArray = { "10", "2a" };

		int value = 0;

		for (int i = 0; i <= 2; i++) {
			try {
				value=Integer.parseInt(strArray[i]);				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("catch1의 값(인덱스) : "+value);
				System.out.println("인덱스를 초과했음");
			}catch(NumberFormatException e) {
				System.out.println("catch2의 값(숫자) : "+value);
				System.out.println("숫자로 변환할 수 없음");
			}finally {
				System.out.println(value);
			}
		}
	}

}
