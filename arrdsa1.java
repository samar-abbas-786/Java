import java.util.*;

public class arrdsa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt(); // n is the size of array
        int array[] = new int[n];

        // input the array
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        // printing the array
        System.out.print("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        // reverse the array
        System.out.print("Reverse of the array is: ");
        for (int i = 0; i < n; i++) {
            if (i < (n - 1 - i)) {
                array[i] = array[n - 1 - i];
                System.out.print(array[i] + " ");
            } else {

                System.out.print(array[n - i] + " ");
            }
        }
    }

}
