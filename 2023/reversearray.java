import java.util.*;
public class reversearray {

    public static void reverseArray(int arr[],int start,int end ){
        while(start<=end){
            int temp= arr[start];
             arr[start]=arr[end];
             arr[end]= temp;
             start++;
             end--;
        }
    }
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
           System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        printArray(arr,6);
        reverseArray(arr,0,5);
        System.out.println("\n");
        System.out.println("Reverse array is:");
                printArray(arr,6);
    }
    
}
