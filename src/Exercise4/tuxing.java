package Exercise4;
import java.util.Scanner;

public class tuxing 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = input.nextInt();
		for(int j = 1;j <= num;j++)
		{ 
			int times = (2 * j) - 1;
			int time = 0;
			
			while(time != (num - j))
			{
				System.out.print(" ");
				time++;
			}
			while (times != 0)
			{
				System.out.print("*");
				times--;
			}
				System.out.print("\n");
		}
	}
}
