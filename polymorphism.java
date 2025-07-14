class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);        // FUNCTION-OVERLOAD ===>>to include different functions of same name in single classes
    }                                                   

    public void printInfo(String name, int age) {
        System.out.println(name + "" + age);
    }
}

public class polymorphism {

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "SAMAR";
        s1.age = 20;

        s1.printInfo(s1.name, s1.age);

    }

}
