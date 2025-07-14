import java.util.*;

public class subarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < 6; i++) {

            for (int j = i; j < 6; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + " ");
                   
                }
                System.out.print("\n");
               
                }

            }
        }

    }


