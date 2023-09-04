import java.util.Scanner;

public class StringComparason
{
	public static void main(String[] args)
	{
		String s1 = "" , s2 = "";
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is the first string?");
		s1 = keyboard.nextLine();
		System.out.println("What is the second string?");
		s2 = keyboard.nextLine();

		if (s1.equals(s2))
		{
			System.out.println("The strings match");
		}
		else
		{
			System.out.println("The strings do not match");
		}
    }
}		
