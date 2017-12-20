
import java.util.Scanner;
public class Convert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number,f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the celsius degree no.:");
		number = sc.nextDouble();
		f=((number*2)+30);
		System.out.println("converted the numberinto celsius to fahrenheit is:"+f);
		
	}

}
