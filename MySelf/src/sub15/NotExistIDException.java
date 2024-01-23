package sub15;

public class NotExistIDException extends Exception{
	public NotExistIDException() {}//생성자 
	public NotExistIDException(String message) {
		super(message);
	}

}
