import java.util.*;
public class delete {
    public static void main(String[] args) {
        int n, i,k; // k is the index
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        n = sc.nextInt();
        // Deletion array
        int a[] = new int[n];
        int b[] = new int[n-1];
       

        System.out.println("Enter the elements of array: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are :");
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
         System.out.println("Enter the index from elements should be delete");
        k=sc.nextInt();
        for(i=0;i<a.length;i++){
            if(i<k){
                b[i]=a[i];
            }
            else if(i==k)
            continue;

            else{
                b[i-1]=a[i];
            }
        }
        
        System.out.println("The array with deleted element is :");
        for(i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }

        
    }
    
}
