package sub4;

import java.io.Serializable;

public class Apple implements Serializable{
	private static final long serialVersionUID = 1L;
	private int price;
	private String country;
	public Apple( String country,int price) {
		this.price = price;
		this.country = country;
	}
	
	public void show() {
		System.out.println("==========================");
		System.out.println("나라 : "+country);
		System.out.println("가격 : "+price);
		System.out.println("==========================");
		
	}
	
	

}
