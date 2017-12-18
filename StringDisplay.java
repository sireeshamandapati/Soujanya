import java.util.Scanner;
public class StringDisplay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String a[] = new String[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name,last name,designation,DOB \n");
		for(i=0;i<a.length;i++)
		{
			a[i] = sc.next();
		
		}
	
	
			System.out.println("First name :"+a[0].toUpperCase());
			System.out.println("Last name :"+a[1].substring(0,4).toUpperCase()+a[1].substring(2));
			System.out.println("Designation :"+a[2].toUpperCase());
			System.out.println("Date of birth :"+a[3].toUpperCase());
		
		

	}

}
