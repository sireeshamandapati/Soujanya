
import java.util.Scanner;
public class CollatzSequence {

	public static void main(String[] args) {
	
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		number = sc.nextInt();
		sc.close();
		while(number>1)
		{
			if(number%2==0)    // if number is even then
			{
				number = number/2;
			}
			else
			{
				// number is odd then
				number = (3*number)+1;
				
			}
			System.out.printf(" %d ", number);
		}
		

	}

}
