import java.util.Scanner;

class Sorting {
	public void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < (a.length - 1 - i); j++) {
				if (a[j] > a[j + 1]) {                      //sorting
					int temp = a[j];                      
					a[j] = a[j + 1];
					a[j + 1] = temp;               
				}
			}
		}
		System.out.printf("Sorted Array elements are :");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(" %d ", a[i]);              //printing the sorted elements
		}

	}
}

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Sorting s = new Sorting();
		int array_size;
		Scanner sc = new Scanner(System.in);
		System.out.println("give the array size");
		array_size = sc.nextInt();
		int[] a = new int[array_size];
		System.out.println("Enter array elements");  //enter elements into array
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		System.out.printf("Array elements are :");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(" %d ", a[i]);        //printing array elements
		}
		s.bubbleSort(a);
	}

}
