
void setup()
{
	//your variable declarations here
	Cow milk = new Cow("cow", "moo");
	System.out.println(milk.getType() + " goes " + milk.getSound());
	Chick poultry = new Chick("chicken", "cluck");
	System.out.println(poultry.getType() + " goes " + poultry.getSound());
	Pig pork = new Pig("Pig", "oink");
	System.out.println(pork.getType() + " goes " + pork.getSound());
}

