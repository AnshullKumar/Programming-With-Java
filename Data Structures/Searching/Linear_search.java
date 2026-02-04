

import java.util.Scanner;
public class Linear_search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size_array = sc.nextInt();
        int[] arr = new int [size_array];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size_array; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int target = sc.nextInt();
        
        for(int i = 0; i < size_array; i++){
            if(arr[i] == target){
                System.out.println("Element found at index: " + i);
                sc.close();
                return ;
            }else{
                if(i == size_array - 1){
                    System.out.println("Element not found in the array.");
                }
            }
        }
        sc.close();
    }
}
