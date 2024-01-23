package sub25;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr= {1,2,3,4,5};
		
		//잘못 작성한 경우
		Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println(n));
		//최종 처리가 없으므로 동작하지 않음
		
		
		//중간 처리 메소드 peek()을 이용해서 반복 처리
		int total=Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println(n))
				.sum();//최종처리
		System.out.println("총합 : "+total+"\n");
		
		//최종 처리 메서드 forEach()를 이용해서 반복 처리
		Arrays.stream(intArr).filter(a->a%2==0).forEach(n->System.out.println(n));
		
		//forEach()와 peek()는 둘 다 반복이지만 peek는 뒤에 최종처리가 따라와야함.
	}

}
