import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GolfClubs
{
	private ArrayList<Club> theClubs;
	
	public GolfClubs()
	{
		this.theClubs = new ArrayList<Club>();
	}
	
	public GolfClubs(String filename)
	{
		this();
		try
		{
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/" + filename));
			while(input.hasNext())
			{
				this.theClubs.add(new Club(input.nextLine()));
			}
			input.close();
		}
		catch(Exception e) { e.printStackTrace();}
	}

	public void addClub(Club b)
	{
		this.theClubs.add(b);
	}
	
	public void addClub(String colonDelimitedData)
	{
		this.theClubs.add(new Club(colonDelimitedData));
	}
	
	public Club getGivenSearchTerm(int term) throws Exception
	{
		for(int i = 0; i < this.theClubs.size(); i++)
		{
			if(this.theClubs.get(i+1).getNumber_of_feet() > term)
			{
				return this.theClubs.get(i);
			}
		}
		throw new Exception("Term not found exception");
	}
}