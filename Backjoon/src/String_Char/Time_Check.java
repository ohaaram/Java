package String_Char;

import java.util.Scanner;

public class Time_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int hour= sc.nextInt();//시간 입력
		int min = sc.nextInt();//분 입력
		int oven= sc.nextInt();//타이버 맞추기
		
		hour+=((min+oven)/60);
		min=((min+oven)%60);
		
		
		if(hour>23)
		{
			hour-=24;
		}
		
		System.out.print(hour+" "+min);		
	}

}
