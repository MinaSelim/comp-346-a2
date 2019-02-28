/**
 * Class BlockStack
 * Implements character block stack and operations upon it.
 *
 * $Revision: 1.4 $
 * $Last Revision Date: 2019/02/02 $
 *
 * @author Serguei A. Mokhov, mokhov@cs.concordia.ca;
 * Inspired by an earlier code by Prof. D. Probst

 */
class BlockStack
{
	
	public static final int MAX_SIZE = 28;

	public static final int DEFAULT_SIZE = 6;

	public int iSize = DEFAULT_SIZE;

	public int iTop  = 3;

	/**
	 * stack[0:5] with four defined values
	 */
	public char acStack[] = new char[] {'a', 'b', 'c', 'd', '*', '*'};
	
	private int accessCounter = 0;

	public int getAccessCounter() {
		return accessCounter;
	}

	public void setAccessCounter(int stackAccessCounter) {
		this.accessCounter = stackAccessCounter;
	}
	
	public void incrementStackAccessCounter()
	{
		accessCounter++;
	}

	/**
	 * Default constructor
	 */
	public BlockStack()
	{
	}

	/**
	 * Supplied size
	 */
	public BlockStack(final int piSize)
	{


                if(piSize != DEFAULT_SIZE)
		{
			this.acStack = new char[piSize];

			// Fill in with letters of the alphabet and keep
			// 2 free blocks
			for(int i = 0; i < piSize - 2; i++)
				this.acStack[i] = (char)('a' + i);

			this.acStack[piSize - 2] = this.acStack[piSize - 1] = '*';

			this.iTop = piSize - 3;
                        this.iSize = piSize;
		}
	}

	/**
	 * Picks a value from the top without modifying the stack
	 * @return top element of the stack, char
	 */
	public char pick()
	{
		incrementStackAccessCounter();
		return this.acStack[this.iTop];
	}

	/**
	 * Returns arbitrary value from the stack array
	 * @return the element, char
	 */
	public char getAt(final int piPosition)
	{
		incrementStackAccessCounter();
		return this.acStack[piPosition];
	}
	
	public void push(final char pcBlock)
	{
		incrementStackAccessCounter();
		this.acStack[++this.iTop] = pcBlock;
		System.out.println("Successful Push");
	}


	public char pop()
	{
		incrementStackAccessCounter();
		char cBlock = this.acStack[this.iTop];
		this.acStack[this.iTop--] = '*'; // Leave prev. value undefined
		System.out.println("Successful Pop");
		return cBlock;
	}	
}

// EOF
