//version 1.1 update 2023-03-14
import java.util.Arrays;
import java.util.Scanner;

// Bubble sort algorithm. This algorithm moves the largest number in the array to the end of the array during each iteration, and so on.
// The average time complexity is O(n^2), and the best case scenario is O(n) (e.g., 5 1 2 3 4). The worst case scenario is reverse order,
// e.g., 5 4 3 2 1, with a time complexity of O(n^2).

public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before bubble sort: " + Arrays.toString(arr));

        int count = 0;
        boolean flag = true; // Flag to check if any swaps were made
        for (int i = 0; i < arr.length - 1 && flag; i++) {
            flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    flag = true; // Swap made, flag set to true
                    System.out.println("Because " + arr[j] + " < " + arr[j + 1] + ", the elements at position " + (j + 1) + " and " + (j + 2) + " were swapped.");
                    System.out.println("Current array: " + Arrays.toString(arr));
                } else {
                    System.out.println("Because " + arr[j] + " < or = " + arr[j + 1] + ", the elements at position " + (j + 1) + " and " + (j + 2) + " were not swapped.");
                    System.out.println("Current array: " + Arrays.toString(arr));
                }
            }
            System.out.printf("Result after round %d of sorting: %s\n", i + 1, Arrays.toString(arr));
        }
        System.out.println("Array after bubble sort: " + Arrays.toString(arr));
        System.out.println("Total swaps made: " + count);
    }
}

