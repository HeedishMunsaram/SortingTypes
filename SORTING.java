import java.util.Scanner;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author Andish
 *
 */
public class SORTING {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		String answer = " ";
		do {
		
		int size = 0;
		int a = 0;
		int b = 0;
		int temp = 0;
		int choice;
		
		System.out.println("1 : Selection sort ");
		System.out.println("2 : bubble sort ");
		System.out.println("3 : insertion sort ");
		System.out.println("4 : quick sort ");
		
		System.out.println("Enter your choice: ");
		choice = key.nextInt();
		
		System.out.println("Enter array size: ");
		size = key.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter array elements: ");
		for(a = 0; a<size; a++) {
			arr[a] = key.nextInt(); 
		}
		
		if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
			System.out.println("Please choice a correct sorting method. ");
		}
		
		if (choice == 1) {
			for (a = 0; a < size; a++) {
				arr[a] = key.nextInt();
			}
			
			System.out.println("Sorting array using selection sorting techniques ");
			boolean swap;
			do {
				swap = false;
				for (a = 1; a < size; a++) {
					temp = arr[a];
					b = a-1;
					while(temp < arr[b]) {
						temp = arr[b];
						arr[b] = arr[a];
						arr[a] = temp;
						swap = true;
					}
				}
			}
			
			while(swap);
			System.out.println("Now the array after sorting is: ");
			for (a = 0; a < size; a++) {
				System.out.println(arr[a] + " ");
			}
		}
		
		else if (choice == 2) {
			for (a = 0; a < size; a++) {
				arr[a] = key.nextInt();
			}
			
			System.out.println("Sorting array using bubble sorting techniques ");
			boolean swap;
			do {
				swap = false;
				for (a = 1; a < size; a++) {
					temp = arr[a];
					b = a-1;
					while(temp < arr[b]) {
						temp = arr[b];
						arr[b] = arr[a];
						arr[a] = temp;
						swap = true;
					}
				}
			}
			
			while(swap);
			System.out.println("Now the array after bubble sorting is: ");
			for (a = 0; a < size; a++) {
				System.out.println(arr[a] + " ");
			}
		}
		
		else if (choice == 3) {
			for (a = 0; a < size; a++) {
				arr[a] = key.nextInt();
			}
			
			System.out.println("Sorting array using insertion sorting techniques ");
			for (a = 0; a < size; a++) {
				for (b = a+1; b < size; b++) {
					if (arr[a] > arr[b]) {
						temp = arr[a];
						arr[a] = arr[b];
						arr[b] = temp;
					}
				}
			}
			
			System.out.println("Now the array after insertion sorting is: ");
			for ( a = 0; a < size; a++) {
				System.out.println(arr[a] + " ");
			}

		}
		
		else if (choice == 4) {
			
			System.out.println("Now the array after quick sorting is: ");
			//QUICK SORT
			SORTING qs = new SORTING();
			qs.quickSort(arr, 0, arr.length-1);
			qs.printArray(arr);
		}
		
		//ask the user if he or she wants to try again
		System.out.println("Do you want to try again? (Y/N): ");
		answer = key.next();
		
		}
		
		while (answer.equals("Y"));
		System.out.println("Program Exit ");
	}
	
	int partition(int arr[], int low, int high) {
		int pivot = arr[(low+high)/2]; 
		
		while(low <= high) {    
			
			while(arr[low] < pivot) {
				low++;
			}
			
			while (arr[high] > pivot) {
				high--;
			}
			
			if ( low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
	
	
	void quickSort(int[] arr, int low, int high) { 
		
		
		int pi = partition(arr, low, high);
		
		if(low < pi-1) {
			quickSort(arr, low, pi-1);
		}
		if(pi < high) {
			quickSort(arr, pi, high); 
		}
	}
	
	void printArray(int[] arr) {   
		for(int i:arr) {
			System.out.println(i + " ");
		}
	}

}
