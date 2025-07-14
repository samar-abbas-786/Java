import java.util.*;
public class func {

    public static void printMyAge(int age){
        System.out.println(age);

    }
   

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
         int age=sc.nextInt();
         printMyAge(age);
        
    }
    
}
