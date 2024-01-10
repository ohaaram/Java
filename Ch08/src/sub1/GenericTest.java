package sub1;
/*
 * 날짜 : 2024/01/10
 * 이름 : 오아람
 * 내용 : Java제네릭 실습하기
 */

public class GenericTest {
	public static void main(String[] args) {
		Apple a = new Apple("한국",3000);
		Banana b = new Banana("일본", 2500);
		
		FruitBox<Apple> box1  = new FruitBox<>();//앞에 apple썼기때문에 뒤에는 생략 가능
		FruitBox<Banana> box2 = new FruitBox<>();
		box1.setFruit(a);
		box2.setFruit(b);
		
		System.out.println("box1 내용 : "+box1.getFruit());
		System.out.println("box2 내용 : "+box2.getFruit());
	}

}