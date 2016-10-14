class Farm 
{     
   //your code here
	private Animal[] produce = new Animal[3];
	Farm()
	{
		produce[0] = new NamedCow("cow", "moo", "Betsy");
        produce[1] = new Chick("chick","cluck", "cheep cheep");       
        produce[2] = new Pig("pig","oink");
	}

	public void animalSounds()
	{
		for(int i = 0; i < produce.length; i++)
		{
			System.out.println(produce[i].getType() + " goes " + produce[i].getSound());
		}

		System.out.println("The cow is known as " + ((NamedCow)produce[0]).getName());
	}
}
