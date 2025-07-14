import java.util.Scanner;

public class lbsearch {

    public static void main(String args[]) {
        int n, i, item;
        int[] a;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to enter");
        n=sc.nextInt();
        a=new int[n];

        System.out.println("Enter Elements");

        for(i=0; i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter item to find");
        item=sc.nextInt();

        for(i=0; i<a.length; i++){
            if(item==a[i]){
                System.out.println(i);
                break;
            }
        }

    }
}