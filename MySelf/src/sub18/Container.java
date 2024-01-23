package sub18;

public class Container <K,M>{
	private K k;
	private M m;
	
	public void set(K k,M m) {
		this.k=k;
		this.m=m;
	}
	public K getKey(){
		return k;  
	}
	public M getValue(){
		return m;
	}

}
