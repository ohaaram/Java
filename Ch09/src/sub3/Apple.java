package sub3;

import java.io.Serializable;

public class Apple implements Serializable {//implements Serializable 임포트해주고
	
	private static final long serialVersionUID = 1L;//버전아이디 생성해주기! 그래야 직렬화할 수 있는 객체로 완성됨.
	private String country;
	private int price;

	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	public void show() {
		System.out.println("--------------");
		System.out.println("원산지 : "+country);
		System.out.println("가격 :"+price);
		System.out.println("--------------");
	}

}
