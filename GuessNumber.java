import java.util.Scanner;


public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fixed_number=45;
		System.out.println("enter the number from 1 to 100:");
		Scanner sc = new Scanner(System.in);
		boolean var = true;
		while(var)
		{
			int entered_number = sc.nextInt();
			if(entered_number<fixed_number)
			{
				System.out.println("enter a Greater number");
				
			}
			else if(entered_number>fixed_number)
			{
				System.out.println("enter a smallest number");
			}
			else if(entered_number==fixed_number)
			{
				System.out.println("your guess is correct");
				var = false;
			}
			else
			{
				System.out.println("your guess is wrong try again");
				
				
			}
			
		}
		
		

	}

}
