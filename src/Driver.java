import java.util.Scanner;


public class Driver
{
	public static void main(String[] args)
	{
		
		GolfClubs theNewTestament = new GolfClubs("data.dat");
		
		try
		{
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter number of feet: ");
			int input  = Integer.parseInt(scan.nextLine());
			scan.close();
			Club answer = theNewTestament.getGivenSearchTerm(input);
			answer.display();
		}
		catch(Exception e)
		{
			System.out.println("No Club Found");
		}	
	}
}
