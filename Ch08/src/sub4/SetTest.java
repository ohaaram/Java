package sub4;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 날짜 : 2024/01/10
 * 이름 : 오아람
 * 내용 : Java HashSet 실습하기
 */


public class SetTest {
	public static void main(String[] args) {
		//HashSet(집합) 생성
		HashSet<Integer>set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		
		System.out.println(set);
		
		//반복자(Iterator)를 이용한 데이터 출력
		//지정해서 하나만 끄집어내지 못한다.
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			//다음 데이터가 있을때까지 반복
			System.out.print(it.next());
		}
		System.out.println();
		for(int num:set)//위랑 똑같다.
		{
			System.out.println(num);
		}
		
	}

}
