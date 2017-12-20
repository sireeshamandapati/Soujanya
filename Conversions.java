import java.util.Scanner;
abstract class Convert
{    
	Scanner sc = new Scanner(System.in);
	abstract void Conversion();
}
class Meters extends Convert
{
	
	void Conversion()
	{
		double read_meter;
		System.out.println("enter the no. in meters");
		read_meter = sc.nextDouble();
  	    double feet = (read_meter/0.3048);
  	    System.out.println("the number is converted to feet:" + feet);
	}
}
class Feets extends Convert
{
	
	void Conversion()
	{
		double read_feet;
		System.out.println("enter the no. in feets"); 
		read_feet = sc.nextDouble();
		double inches = (read_feet*12);
  	    System.out.println("the number is converted to inches:" +inches);

	}
}
class Inches extends Convert
{
	
	void Conversion()
	{   
		double read_inches;
		System.out.println("enter the no. in inches");
		read_inches = sc.nextDouble();
  	    double meters= (read_inches*0.0245);
        System.out.println("the number is converted to meters:" +meters);
	}
}

public class Conversions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int ch;
		boolean flag= true;
		Meters meter = new Meters();
		Feets  feet  = new Feets();
		Inches inches = new Inches();
		Scanner sc = new Scanner(System.in);
		while(flag)
			{
		System.out.println("CONVERSIONS");
		System.out.println("1.covert meters to feets : enter 1");
		System.out.println("2.covert feets to inches : enter 2");
		System.out.println("3.covert inches to meters : enter 3");
		System.out.println("exit : enter 4");
		ch=sc.nextInt();
		switch(ch)
		{
		          case 1 :
		          {
		        	  meter.Conversion();
		        	//  status = false;
		        	  break;
		        	  
		          }
		          case 2 :
		          {
		        	  
		        	  feet.Conversion();
		        	  break;
		          }
		          case 3 :
		          {
		        	 inches.Conversion();
		        	  break;
		          }
		          default: {
		        	  System.out.println("invalid input"); 
		        	  flag=false;
		        	  
		          }
		}
		}

	}

}
