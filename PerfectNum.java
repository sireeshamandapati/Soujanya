
import java.util.Scanner;
public class PerfectNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		for(int i=1;i<=number/2;i++)
		{
			if(number%i == 0)
			{
				count=count+i;
				
			}
		}
		if(count==number)
		{
			System.out.println("it is perfect number");
		}
		else
		{
			System.out.println("it is not a perfect number");
		}

	}

}
