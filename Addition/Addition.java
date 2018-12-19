public class Addition
{
	public static void main(String [] args)
	{
		try 
		{
			int parseInt1 = Integer.parseInt(args[0]);
			int parseInt2 = Integer.parseInt(args[1]);
			int answer = parseInt1 + parseInt2;
			System.out.println("\nSum of " + parseInt1 + " + " + parseInt2 + " = " + answer);
		}
		catch(NumberFormatException e)
		{
			System.out.println("\nPlease input a whole number");	
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("\nEnter two numbers");
		}
	}
}