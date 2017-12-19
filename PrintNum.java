
public class PrintNum {
	
	
public static void main (String[] args){
	
	int i,count=0;
	for(i=1;i<=100;i++){
		count++;
		if(i%3==0 && i%5==0)
		{
			System.out.println("FizzBizz");
		}
		else if(i%5==0)
		{
			System.out.println("Buzz");
		}
		else if(i%3==0)
		{
			System.out.println("Fizz");
		}
		else
		{
			System.out.println(+count);
		}
		
	}
}
	 

}
