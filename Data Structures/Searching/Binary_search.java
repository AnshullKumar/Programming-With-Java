
import java.util.Scanner;
public class Binary_search{

	static void display(int[] array){
		System.out.print("\nDisplaying the contents of the array...\n");
		
		for(int row = 0; row < array.length; row++) System.out.print(array[row] + " ");
		
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter the size of the array: ");
        int size_array = sc.nextInt();
        int[] arr = new int [size_array];
        
        System.out.println("\nEnter the elements of the array (in a Sorted manner): ");
        for (int i = 0; i < size_array; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("\nElements inserted into the array...");
        display(arr);

        System.out.print("\nEnter the element to be searched: ");
        int target = sc.nextInt();

   		System.out.print("\nSearching through the array...\n");
 		int low = 0, high = size_array - 1;
 		while(low <= high){
 			int mid = (low + high) / 2;
 			
 			if(target == arr[mid]){
 				System.out.print("\nElement found at index..." + (mid + 1));
 				
 				return ;
 			}
 			else if(target < arr[mid]) high = mid - 1;
 			else low = mid + 1;
 			
 		}
 		System.out.print("\nElement not present in the array... ");
 		display(arr);

        sc.close();
    }
}
