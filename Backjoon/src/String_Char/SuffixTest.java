package String_Char;

import java.util.Scanner;
import java.util.stream.Stream;

public class SuffixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문장에서 내가 입력한 접미사가 들어있는지 체크

		Scanner sc = new Scanner(System.in);

		System.out.println("문장 입력 : ");
		String stream = sc.nextLine();

		System.out.println("접미사 입력: ");
		String suff = sc.nextLine();
		
		int result = 0;

		for (int i = 0; i < stream.length(); i++) {
			if (suff.equals(stream.substring(i)))
			{
					result = 1;
					break;
			}
		}
		System.out.println("결과 값 :" + result);
	}

}
