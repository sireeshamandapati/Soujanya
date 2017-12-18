import java.util.Scanner;
public class Multiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitOperator bit = new BitOperator();
		bit.Process();
	}

}

class BitOperator{
	int n1,n2;
	int mul=0;
	Scanner sc = new Scanner(System.in);
	void Process()
	{
		
		System.out.println("enter first number");
		 n1 = sc.nextInt();
		 System.out.println("enter second number");
		 n2 = sc.nextInt();
		 for(int i=0;i<n2;i++)
		 {
			 mul = add(mul,n1);
		 }
		 System.out.println("Multiply"+mul);
	}
	int add(int a,int b)
	{
		int carry;
		while(b!=0)
		{
			carry = (a&b)<<1;
			a=a^b;
			b=carry;
		}
		return a;
	}
}