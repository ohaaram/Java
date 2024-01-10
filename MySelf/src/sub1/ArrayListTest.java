package sub1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);

		list.add(1, 6);
		System.out.println(list);

		System.out.println("1번째 원소 : " + list.get(0));
		System.out.println("2번째 원소 : " + list.get(1));
		System.out.println("4번째 원소 : " + list.get(3));

		System.out.println("list size : " + list.size());

		for (Integer num : list) {
			System.out.print(num + " ");
		}
		System.out.println();

		List<String> peple = new ArrayList<>();
		peple.add("김유신");
		peple.add("김춘추");
		peple.add("장보고");
		peple.add("강감찬");
		peple.add("이순신");

		System.out.println(peple);

		List<Apple> apples = new ArrayList<>();
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 3000);
		Apple a3 = new Apple("일본", 3000);

		apples.add(a1);
		apples.add(a2);
		apples.add(a3);

		System.out.println(apples);

		for (Apple apple : apples) {
			System.out.println(apple);
		}

	}

}
