class shape {
    public void area(){
        System.out.println("area displays");
    }
}

class Triangle extends shape {
    public void area(int l,int b){
        System.out.println(1/2*l*b);
    }
 
}
class equilateraltriangle extends Triangle{
    public void area(int l,int b){
        System.out.println(1/2*l*b);
    }
    class circle extends shape{
        public void perimeter(int r){
            System.out.println(2*3.14*r);
        }
    }

}

public class inheritence {
    public static void main(String args[]) {

        Triangle t1 = new Triangle();
        t1.color = "red";

    }
}
