// class Pen {
//     String color;
//     String type; // ballpoint or gel

//     public void write() {
//         System.out.println("something is written");
//     }

//     public void printColor() {
//         System.out.println(this.color);
//     }
// }
 

        // Pen pen1 = new Pen();
        // pen1.color="Blue";
        // pen1.type="gel";
        // pen1.write();

        // Pen pen2= new Pen();
        // pen2.color="black";
        // pen2.type="ballpoint";

        // pen1.printColor();
        // pen2.printColor();
        //


class Student {
    String name;
    int age;
    double cgpa;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.cgpa);

    }


    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
        this.cgpa=s2.cgpa;
    }

    Student(){

    }
}

public class oops1 {
    public static void main(String args[]) {

        Student std1 = new Student();
        std1.name="aman";
        std1.age=24;
        std1.cgpa=8.9;
        // std1.printInfo();

        Student s2 = new Student(std1);
        s2.printInfo();

        // Student std1 = new Student();
        // std1.name="samar";
        // std1.age=20;

        // Student std2=new Student();
        // std2.name="athar";
        // std2.age=21;

        // std1.printInfo();
        // std2.printInfo();
    // Student(){
    // System.out.println("Constructor Called"); ===> Non-parametrized constructor
    // }

    // Student(String name, int age,double cgpa) {
    //     this.name = name; // ===>parametrized constructor
    //     this.age = age;
    //     this.cgpa=cgpa;
    // }
       
    }
}
