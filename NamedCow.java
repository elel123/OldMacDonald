class NamedCow extends Cow
{
	String myName;
	NamedCow(String type, String sound, String name)
	{
		myName = name;
		mySound = sound;
		myType = type;
	}

	String getName() {return myName;}
}