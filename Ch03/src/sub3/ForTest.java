package sub3;
/*
 * 날짜 : 2023/12/27
 * 이름 : 오아람
 * 내용 : Java 조건문 for문 실습하기
 */

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		System.out.println("1부터 10까지의 합은 : " + sum);

		sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("1부터 10까지의 짝수의 합은 : " + sum);

		for (int a = 1; a <= 3; a++) {
			System.out.println("a:" + a );
			for (int b = 1; b <= 5; b++) {
				System.out.println("b:" + b);
			}
		}

		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
				//System.out.printf("%d X %d = %d\n",i,j,i*j);위와 똑같음
			}
		}
		//삼각형 별 출력하기
		for(int start=1;start<=10;start++) {
			for(int end=1;end<=start;end++) {
				System.out.print("★");
			}
			System.out.println();
		}	
		//역삼각형 출력하기
		
		System.out.println("역삼각형 출력하기");
		
		for(int i=0;i<=9;i++) {
			for(int j=1;j<=10-i;j++)
			{
				System.out.print("★");
			}
			System.out.println(); 
		}
		/*
		for(int i=10;i>1;i--)
		{
			for(int j=1;j<i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		*/
		
	}
}
