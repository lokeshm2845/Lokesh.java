
import java.util.*;

public class functions {
    public static boolean isPrime(int a) {
        if(a <= 1){
            return false;
        }
        for(int i = 2; i <= a/2; i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }

    // public static boolean isEven(int b) {
    //     return b % 2 == 0;
    // }

    // public static void Table(int c) {
    //     for(int i = 1; i <= 10; i++) {
    //         System.out.println(c+" x "+i+" = "+(c*i));
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        boolean isPrime = true;               
        for(int i =2; i <=n/2; i++) {
            if(n % i ==0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime(n)) {
            System.out.println("The Number is Prime");
        } else if (n == 0 || n == 1) {
            System.out.println("The Number is Neither Prime Nor Composite");
        } else {
            System.out.println("The Number is Not Prime");
        }
        
        // Even/Odd Checker
        // if(isEven(n)) {
        //     System.out.println("The Number is Even");
        // } else {
        //     System.out.println("The Number is Odd");
        // }

        // Table (Multiplication)
            // Table(n);


         // System.out.print("Enter a Number: ");
            // int n = sc.nextInt();
            // System.out.println("Even Numbers up to "+ n + " : ");
            // for(int i = 2; i <= n; i=i+2) {
            //     System.out.println(i+" ");
            // }
    }
}
