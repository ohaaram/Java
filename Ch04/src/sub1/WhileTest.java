package sub1;
/*
 * 날짜 : 2023/12/28
 * 이름 : 오아람
 * 내용 : while 실습하기
 */

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int k = 1;
		///////// while문 1부터 10까지의 합 구하기
		while (k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		///////// while문 홀수의 합구하기
		int tot = 0;
		int j = 1;

		while (j <= 10) {
			if (j % 2 != 0)
				tot += j;
			j++;
		}
		System.out.println("1부터 10까지의 홀수합 : " + tot);

		/// do-while문
		int eSum = 0;
		int i = 1;
		do {
			if (i % 2 == 0)
				eSum += i;
			i++;
		} while (i <= 10);// 무조건 실행코드를 한번은 실행.그다음에 조건식을 보고 실행할지 판별
		System.out.println("1부터 10까지의 짝수의 합 : " + eSum);

		//// break
		int num = 0;
		while (true) {
			if (num % 5 == 0 && num % 7 == 0)
				break;
		}
		System.out.println("5와 7의 최소공배수 : " + num);

		// continue

		int total = 0;
		int n = 1;

		while (n <= 10) {

			n++;
			if (n % 2 == 1) {
				continue;
			}
			total += n;
		}
		System.out.println("1부터 10까지의 짝수합 : " + total);
	}
}
