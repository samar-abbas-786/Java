import java.util.*;

public class arr1 {
    public static void main(String[] args) {
        int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    int arr[]=new int[n];
   for(i=0;i<n;i++){
     arr[i]=sc.nextInt();
   }

    for( i = 0;i<n;i++)
    {
        System.out.println(arr[i]);
    }
    }
}
