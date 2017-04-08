/*
 * @ Seby Tom Sebastian
 */

// Abstract Class
public abstract class gameItem implements game{

	
	private int minTime;
	private int maxTime;

	
	public gameItem() {
		// TODO Auto-generated constructor stub
	}

	public int getMin()
	{
		return minTime;
	}
	
	public int getMax()
	{
		return maxTime;
	}
}
