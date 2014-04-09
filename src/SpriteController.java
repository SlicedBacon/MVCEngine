
public class SpriteController {
	public SpriteController()
	{
		
	}
	public boolean checkHitBoxIntersect(int[] hitBoxOne, int[] hitBoxTwo) //checks for a collison between 2 hitboxes
	{
		
		//instance variables to make calling methods easier for me
		int xOne = hitBoxOne[0];
		int yOne = hitBoxOne[1];
		int xTwo = hitBoxOne[2];
		int yTwo = hitBoxOne[3];
		
		int xThree = hitBoxTwo[0];
		int yThree = hitBoxTwo[1];
		int xFour = hitBoxTwo[2];
		int yFour = hitBoxTwo[3];
		
		//hitbox intersection detecting
		if(Coordinates.isSouthEastOf(xOne, yOne, xTwo, yTwo) && Coordinates.isSouthEastOf(xTwo, yTwo, xThree, yThree) && 
				Coordinates.isSouthEastOf(xTwo, yTwo, xFour, yFour) && Coordinates.isNorthWestOf(xOne, yOne, xTwo, yTwo))
			return true;
		else if(Coordinates.isEastOf(xOne, yOne, xThree, yThree) && Coordinates.isNorthWestOf(xOne, yOne, xFour, yFour) && 
				Coordinates.isEastOf(xTwo, yTwo, xFour, yFour) && Coordinates.isSouthEastOf(xTwo, yTwo, xThree, yThree))
			return true;
		else if(Coordinates.isSouthOf(xOne, yOne, xThree, yThree) && Coordinates.isNorthWestOf(xOne, yOne, xFour, yFour) && 
				Coordinates.isSouthOf(xTwo, yTwo, xFour, yFour) && Coordinates.isSouthEastOf(xTwo, yTwo, xThree, yThree))
			return true;
		else if(Coordinates.isNorthWestOf(xOne, yOne, xThree, yThree) && Coordinates.isNorthWestOf(xOne, yOne, xFour, yFour) &&
				Coordinates.isSouthEastOf(xTwo, yTwo, xThree, yThree) && Coordinates.isNorthWestOf(xTwo, yTwo, xFour, yFour))
			return true;
		else if(Coordinates.isWestOf(xOne, yOne, xThree, yThree) && Coordinates.isNorthWestOf(xOne, yOne, xFour, yFour) && 
				Coordinates.isWestOf(xTwo, yTwo, xFour, yFour) && Coordinates.isSouthEastOf(xTwo, yTwo, xThree, yThree))
			return true;
		else if(Coordinates.isNorthOf(xOne, yOne, xThree, yThree) && Coordinates.isNorthWestOf(xOne, yOne, xFour, yFour) && 
				Coordinates.isNorthOf(xTwo, yTwo, xFour, yFour) && Coordinates.isSouthEastOf(xTwo, yTwo, xThree, yThree))
			return true;
		else if(Coordinates.isNorthEastOf(xOne, yOne, xThree, yThree) && Coordinates.isNorthWestOf(xOne, yOne, xFour, yFour) 
				&& Coordinates.isNorthWestOf(xTwo, yTwo, xFour, yFour) && Coordinates.isSouthEastOf(xTwo, yTwo, xThree, yThree))
			return true;
		else if(Coordinates.isSouthWestOf(xOne, yOne, xThree, yThree) && Coordinates.isNorthWestOf(xOne, yOne, xFour, yFour) && 
				Coordinates.isSouthWestOf(xTwo, yTwo, xFour, yFour) && Coordinates.isSouthEastOf(xTwo, yTwo, xThree, yThree))
			return true;
		else
			return false;
	}
}
