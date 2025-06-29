
import java.util.*;


public class Conditionalstatements {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 1 For Addition");
        System.out.println("Enter 2 For Subtraction");
        System.out.println("Enter 3 For Multiplication");
        System.out.println("Enter 4 For Division");
        System.out.println("Enter 5 For Modulus");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();

        if(ch == 1) {
            int Add = a + b;
            System.out.println("Addition: " + Add);
        }
        else if(ch == 2) {
            int Sub = a - b;
            System.out.println("Subtraction: " + Sub);
        }
        else if(ch == 3) {
            int Mul = a* b;
            System.out.println("Multiplication: " + Mul);
        }
        else if(ch == 4) {
            if(b == 0) {
                System.out.println("Division by zero is not allowed");
            }
            else {
                float Div = a / b;
                System.out.println("Division: " + Div);
            }
        }
            else if(ch == 5) {
                float Mod = a % b;
                System.out.println("Modulus: " + Mod);
            }
            else {
                System.out.println("Invalid choice");
            }

            System.out.println("Enter the Number of The Month : ");
            int n = sc.nextInt();
            switch(n) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Invalid month");

            }

            // Marks Input and Output
                System.out.println("Enter 1 to Input Marks of Students or 0 to Stop : ");
                ch = sc.nextInt();
                
                if(ch == 1) {
                    System.out.print("Enter The Students Marks (out of 100) : ");

                    int marks = sc.nextInt();

                    if(marks >= 90) {
                        System.out.println("This is Good");
                    } else if(marks >= 60 && marks <= 89) {
                        System.out.println("This is Also Good");
                    } else if(marks >=0 && marks <= 59) {
                        System.out.println("This is Good as Well");
                    } else {
                        System.out.println("Invalid Marks Entered. Please Enter The Marks Between 0 to 100");
                    } 
                    } else if(ch == 0) {
                        System.out.println("Exited The Program");
                    } else {
                        System.out.println("Invalid Choice. Please Enter 1 or 0");
                    }
            
    }
}