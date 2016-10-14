class Cow implements Animal 
{     
     //your code here
	protected String myType, mySound;

	public Cow(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}



	public  Cow()
	{
		mySound = "unknown";
		myType = "unknown";
	}

	public String getType() {return myType;}
	public String getSound() {return mySound;}
}
