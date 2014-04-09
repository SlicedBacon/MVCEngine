
public class Sprite {
	private int[] coords = new int[2]; //coordinates of the Sprite
	private String fileName; //name of the file that the Sprite will use
	private int[] hitBox = new int[4]; // The hitbox is given as an array of 2 corners. collisions are calculated later using this information.
	
	public Sprite()
	{
		
	}
	
	
	public int[] getCoords()
	{
		return coords;
	}
	
	
	public void setCoords(int[] listIn)
	{
		coords[0] = listIn[0];
		coords[1] = listIn[1];
	}
	
	
	public String getFileName()
	{
		return fileName;
	}
	
	
	public void changeFile(String fileNameIn)
	{
		fileName = fileNameIn;
	}
	
	//gets the hitbox corners
	public int[] getHitBox()
	{
		return hitBox;
	}
	
	
	public void setHitBox(int[] listIn)
	{
		for(int i = 0; i < hitBox.length;i++)
			hitBox[i] = listIn[i];	
	}
}
