public class CountTo
{
	public static void main (String[] args) {
		try
		{
			int countFrom = Integer.parseInt(args[0]);
			int countTo = Integer.parseInt(args[1]);
			if (countFrom > countTo)
			{
				System.out.println("\nCounting from " + countFrom + " to " + countTo);
				for(int i = countFrom; i >= countTo; i--)
				{
					System.out.println(i);
				}
				System.exit(1);
			}
			else if (countFrom < countTo);
			{
				System.out.println("\nCounting from " + countFrom + " to " + countTo);
				for (int i = countFrom; i <= countTo; i++)
				{
				System.out.println(i);
				}
				System.exit(1);
			}

		}
		catch(NumberFormatException e)
		{
			System.out.println("\nPlease make sure you entered a number");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("\nPlease enter a number to count from and to count to");
		}
	}
}