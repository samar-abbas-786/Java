import java.util.*;

public class samar1 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of array : ");
        for ( i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for ( i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    
                   
                }
            }
        }
        System.out.println("Duplicate array is found");
        System.out.println("\n");

    }
}
