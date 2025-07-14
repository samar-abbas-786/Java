import java.util.*;

public class insert_delete {
    public static void main(String[] args) {

        int n, i, num, k,m; // k is the index
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        n = sc.nextInt();
        // insertion_array
        int a[] = new int[n];
        int b[] = new int[n+1];

        System.out.println("Enter the elements of array: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are :");
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }

        System.out.println("Enter the number to be inserted");
        num = sc.nextInt();
        System.out.println("Enter the index k");
        k = sc.nextInt();

        for (i = 0; i < n + 1; i++) {
            if (i < k) {
                b[i] = a[i];
            } else if (i == k) {
                b[i] = num;

            } else {
                b[i] = a[i - 1];
            }

        }
        System.out.println("The array with inserted element is ");
        for(i=0;i<n+1;i++){
        System.out.print(b[i] + " ");
        }
    
//     //Deletion array
//   System.out.println("The elements to be deleted from index is :");
//     m=sc.nextInt();
//       for (i = 0; i < n; i++) {
//             if (i < m) {
//                 b[i] = a[i];
//             }
//              else if (i == m) 
//              {
//               continue;
//             } 
//             else {
//                 b[i] = a[i+1];
//             }
//         System.out.println("The array with deleted element is ");
//         for(i=0;i<n;i++){
//         System.out.print(b[i] + " ");
//         }

//         }
     
    }
}
