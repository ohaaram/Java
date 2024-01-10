package sub3;

import java.util.LinkedList;

/*
 * 날짜 : 2024/01/10
 * 이름 : 오아람
 * 내용 : Java LinkedList 실습하기
 */

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list =  new LinkedList<String>();
		
		list.add("서울");
		list.add("대전");
		list.add("대구");
		list.add("부산");
		list.add("광주");
		
		System.out.println(list);
		
		//링크(데이터) 추가
		list.add(1,"수원");//칸이 하나씩 밀리는게 아니라
		//링크처럼 연결하고 있는 주소값이 변하는것.
		list.addFirst("인천");//제일 첫링크를 인천으로
		list.addLast("울산");//제일 마지막 링크를 울산으로
		System.out.print(list);
	}

}
