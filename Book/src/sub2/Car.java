package sub2;

public class Car {
	
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	Car(String model)
	{
		this(model,"은색",250);
	}
	Car(String model,String color){
		this(model,color,250);
	}
	Car(String model,String color,int maxSpeed)
	{
		this.color=color;
		this.model=model;
		this.maxSpeed=maxSpeed;
	}

}
