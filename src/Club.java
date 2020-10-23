
public class Club
{
	private String name;
	private int number_of_feet;
	
	public Club(String name, int number_of_feet)
	{
		this.name = name;
		this.number_of_feet = number_of_feet;
	}

	public Club(String s)
	{
		String[] parts = s.split(";");
		this.name = parts[0];
		this.number_of_feet = Integer.parseInt(parts[1]);
	}
	
	public int getNumber_of_feet() 
	{
		return number_of_feet;
	}

	public String getName()
	{
		return this.name;
	}
	
	public void setName(String newName)
	{
		if(newName.length() >= 5)
		{
			this.name = newName;
		}
	}
	
	public void display()
	{
		System.out.println("Club Name: " + this.name + 
		"(" + this.number_of_feet + " feet)");
	}
}