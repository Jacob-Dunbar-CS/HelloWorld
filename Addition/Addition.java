public class Addition
{
	public static void main(String[] args)
	{
		int [] i = new int[2];
		for (int n = 0; n < i.length; n++) 
		{
			i[n] = n;
		}
		if (args.length < 2)
		{
			System.out.println("\nNo valid arguments");
		}
		try 
		{
			int parseInt1 = Integer.parseInt(args[i[0]]);
			int parseInt2 = Integer.parseInt(args[i[1]]);
			int answer = parseInt1 + parseInt2;
			System.out.println("\nSum of " + parseInt1 + " + " + parseInt2 + " = " + answer);
		}
		catch(NumberFormatException e)
		{
			System.out.println("\nNot a number");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("\nEnter two numbers");
		}
	}
}