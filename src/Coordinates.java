
public class Coordinates {
	public Coordinates()
	{
		
	}
	
	public static boolean isNorthOf(int x1, int y1, int x2, int y2)
	{
		if(y1 > y2 && x1 == x2)
			return true;
		else
			return false;
	}
	
	public static boolean isSouthOf(int x1, int y1, int x2, int y2)
	{
		if(y1 < y2 && x1 == x2)
			return true;
		else
			return false;
	}
	
	public static boolean isEastOf(int x1, int y1, int x2, int y2)
	{
		if(x1 > x2 && y1 == y2)
			return true;
		else
			return false;
	}
	
	public static boolean isWestOf(int x1, int y1, int x2, int y2)
	{
		if(x1 < x2 && y1 == y2)
			return true;
		else
			return false;
	}
	
	public static boolean isNorthWestOf(int x1, int y1, int x2, int y2)
	{
		if(x1 < x2 && y1 > y2)
			return true;
		else
			return false;
	}
	public static boolean isNorthEastOf(int x1, int y1, int x2, int y2)
	{
		if(x1 > x2 && y1 > y2)
			return true;
		else
			return false;
	}
	
	public static boolean isSouthWestOf(int x1, int y1, int x2, int y2)
	{
		if(x1 < x2 && y1 < y2)
			return true;
		else
			return false;
	}
	
	public static boolean isSouthEastOf(int x1, int y1, int x2, int y2)
	{
		if(x1 > x2 && y1 < y2)
			return true;
		else
			return false;
	}
	
}
