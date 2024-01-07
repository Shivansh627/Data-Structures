import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare and initialize the array
        int[] array = new int[n];

        // Get elements from the user
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Display the array
        System.out.println("The array is:");
        displayArray(array);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to display elements of an array
    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // Move to the next line after printing the array
    }
}
