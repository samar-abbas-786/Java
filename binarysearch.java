import java.util.Scanner;

public class binarysearch {
    public static void binary(int element, int i, int a, int n) {

        int low, mid, high;
        int[] a;
        low = 0;
        high = n - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid == element) {
                System.out.println(mid);
            }
            if (mid < element) {
                low = low + 1;

            } else {
                high = high - 1;
            }

        }
        System.out.println(i);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num. of elements in array a");
        int n=sc.nextInt();
        System.out.println("enter the elements in array");
        int a[i]=sc.nextInt();
        
        element=sc.nextInt();

        binary();

        


    }
}
