package sub1;

public class Apple {// 눈에 보이진 않지만 Object를 상속받고 있는 상태이다.(묵시적 상속)

	private String country;
	private int price;
	
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Apple [hashcode = "+hashCode()+"country=" + country + ", price=" + price + "]";
	}

}
