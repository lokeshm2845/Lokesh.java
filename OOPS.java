

class Student { // class to represent a student
    String name;
    int age;

    // public void printInfo() { // function to print student info
    //     System.out.println("Name : " + this.name); 
    //     System.out.println("Age : " + this.age);
    // }
    // Student (String name, int age) { // parameterized constructor
    //     this.name = name;
    //     this.age = age;
    // }

    // Student(Student s2) { // copy constructor
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }
    // Student() { // default constructor
    //     this.name = "Abhishek"; // default name
    //     this.age = 24; // default age

    // }

// Polymorphism


    // Function Overloading
    // Compile Time Polymorphism

    // public void PrintInfo(String name) {
    //     System.out.println("Name : " + name);
    // }

    // public void PrintInfo(int age) {
    //     System.out.println("Age : " + age);
    // }

    // public void PrintInfo(String name, int age) {
    //     System.out.println("Name : " + name + ", Age : " + age);
    // }

}
// Inheritance
    // Single Lvl inheritance
    class Shape { 
        public void area() {
            System.out.println("Display Area of Shape");
        }
    }

    class Triangle extends Shape {
        public void area(float length, float height) {
            System.out.println((0.5)*length*height);
        }
    }
    
    // Multi-level inheritance
    class EquilateralTriangle extends Triangle {
        public void area(float l, float h) {
            System.out.println((0.5)*l*h);
        }
    }

    // hierarchical inheritance
    class Circle extends Shape {
        public void area(int r) {
            System.out.println((3.14)*r*r);
        }
    }

// Encapsulation

// Abstraction



public class OOPS {
    public static void main(String[] args) {
        // Student s1 = new Student(); // class object

         // Student s2 = new Student(s1); 
        // s2.printInfo();

        // Student s3 = new Student(); // default constructor
        // s3.printInfo();
       
       // Polymorphism

        // s1.PrintInfo("Shirish");
        // s1.PrintInfo(25);
        // s1.PrintInfo("Anna", 57);

        // Inheritance
        // Single Lvl inheritance
        Shape s1 = new Shape();
        s1.area();
        Triangle t1 = new Triangle();
        t1.area(2, 2); // area of triangle
        Circle c1 = new Circle();
        c1.area(5);
        EquilateralTriangle e1 = new EquilateralTriangle();
        e1.area(2,5);
    }
}
