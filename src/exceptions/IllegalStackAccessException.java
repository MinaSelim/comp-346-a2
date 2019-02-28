package exceptions;

public class IllegalStackAccessException extends RuntimeException
{
	public IllegalStackAccessException()
	{
		super("Stack accessed at illegal index");
	}

}
