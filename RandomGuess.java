import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

	public static void main(String[] args) {

		Random rand = new Random();
		int guess_number = rand.nextInt(100);
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Guess the nunber between 1 to 100");
			int number = sc.nextInt();
			if (number == guess_number) {
				System.out.println("your guess is correct");
				System.out.println("the number was " + guess_number);
				flag = false;
			} else if (number < guess_number) {
				System.out
						.println("your guess is smaller enter greater number:");
			} else if (number > guess_number) {

				System.out
						.println("your guess is greater enter smaller number:");
			} 
			
		}
	}
}
