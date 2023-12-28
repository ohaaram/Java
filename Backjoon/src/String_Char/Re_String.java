package String_Char;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Scanner;

public class Re_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string;
		int num=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		my_string=sc.nextLine();
		
		System.out.print("뒤에서부터 몇글자 출력? :");
		num=sc.nextInt();
		
		String result =my_string.substring(my_string.length()-num);		
		System.out.println(result);	

	}

}
