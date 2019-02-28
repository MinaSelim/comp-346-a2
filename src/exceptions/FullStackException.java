package exceptions;

public class FullStackException extends RuntimeException{
	
	public FullStackException() {
		super("Stack is Full!");
	}

}
