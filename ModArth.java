public class ModArth 
{
	public static int add(int x, int y, int base)	
	{
		int result =  (x + y) % base;	
		while(result < 0)
			result += base;
		return result;
	}
	public static int addInverse(int x, int base)
	{
		int result = base - x;
		return result;
	}
	/**************************************************
	 * r1-r2-r			t1-t2-
	 * r2-r-
	**************************************************/
	public static int mulInverse(int x, int y)	
	{
		if(x < y)
		{
			int z = y; 
			y = x; 
			x = z;
		}
		int r = 0, q = 0;
		int t1 = 0, t2 = 1, t = 0;
		while(y > 0)
		{
			r = x % y;
			q = x / y;
			x = y;
			y = r;
			t = t1 - q*t2; 
			t1 = t2;
			t2 = t;

		}
		if(x == 1)
			return t1;
		else 
			return -1;
	}
	public static int gcd (int x, int y)
	{
		if(x < y)
		{
			int z = y; 
			y = x; 
			x = z;
		}
		int r = 0;
		while(y > 0)
		{
			r = x % y;
			x = y;
			y = r;
		}
		if(!(y < 0))
			return x;
		return -1;
	}
}
