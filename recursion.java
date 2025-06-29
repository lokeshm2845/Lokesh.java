
import java.util.HashSet;

public class recursion {


    // public static void reverseStr(String str, int index) {
    //     if(index == 0) {
    //         System.out.println(str.charAt(index));
    //         return;
    //     }
    //     System.out.print(str.charAt(index));
    //     reverseStr(str, index - 1);
    // }

    // public static int first = -1;
    // public static int last = -1;

    // public static void FindOccurance(String str, int index, char element) {
    //     if(index == str.length()) {
    //         System.out.println("First Occurance of " + element + " is at index : " + first);
    //         System.out.println("Last Occurance of " + element + " is at index : " + last);
    //         return;
    //     }
    //     char currChar = str.charAt(index);
    //     if(currChar == element) {
    //         if(first == -1) {
    //             first = index;
    //         }
    //         last = index;
    //     }
    //     FindOccurance(str, index + 1, element);
    // }

    // public static boolean isSorted(int arr[], int index) {
    //     if(index == arr.length - 1) {
    //         return true;
    //     } 
    //     if(arr[index] >= arr[index + 1]) {
    //         return false;
    //     }
    //      return isSorted(arr, index + 1);
    // }

    // public static void moveAllx(String str, int index, int count, String newStr) {
    //     if(index == str.length()) {
    //         for(int i = 0; i < count; i++) {
    //             newStr += 'x';
    //         }
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char currentChar = str.charAt(index);
    //     if(currentChar == 'x') {
    //         count ++;
    //         moveAllx(str, index + 1, count, newStr);
    //     } else {
    //         newStr += currentChar;
    //         moveAllx(str, index + 1, count, newStr);
    //     }
    // }

    //  public static boolean[] map = new boolean[26];

    //     public static void removedup(String str, int index, String newStr) {
    //         if(index == str.length()) {
    //              System.out.println(newStr);
    //             return;
    //         }
    //         char currentChar1 = str.charAt(index);
    //         if(map[currentChar1 - 'a'] == true) {
    //             removedup(str, index + 1, newStr);
    //         } else {
    //             newStr += currentChar1;
    //             map[currentChar1 - 'a'] = true;
    //             removedup(str, index + 1, newStr);
    //         }
    //     }

    // public static void subsequences(String str, int index, String newStr) {
    //     if(index == str.length()) {
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char currChar2 = str.charAt(index);

    //     // to be included
    //     subsequences(str, index + 1, newStr + currChar2);

    //     // to be excluded
    //     subsequences(str, index + 1, newStr);
    // }

    public static void subsequences(String str, int index, String newStr, HashSet<String> set) {
        if(index == str.length()) {
            if(set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar2 = str.charAt(index); 

        // to be included
        subsequences(str, index + 1, newStr + currChar2, set);

        // to be excluded
        subsequences(str, index + 1, newStr, set);
    }

    // public static void Number(int n) {
    //     if(n == 0) {
    //         return;
    //     }
    //     System.out.println("Number is: " + n);
    //     Number(n - 1);
    // }

    // public static void Sum_series(int i, int n, int sum) {
    //     if(i == n) {

    //     sum += i;
    //     System.out.println(sum);
    //     return;
    // }   
    //     sum += i;
    //     Sum_series(i + 1, n, sum);
    //     // System.out.println(i);
    //     // System.out.println(n);
    //     // System.out.println(sum);
    // }

    // public static int cal_factorial(int n) {
    //     if(n == 0 || n == 1) {
    //         return 1;
    //     }
    //     int fact = cal_factorial(n - 1);
    //     int fact_n = n * fact;
    //     return fact_n;
    // }

    // public static void Fibo_series(int a, int b, int n) {
    //     if(n == 0) {
    //         return;
    //     }
    //     int c = a + b;
    //     System.out.print(c);
    //     Fibo_series(b, c, n - 1);
    // }


    // FOR STACK HEIGHT USING (x_power_n)
    // public static int cal_power(int x, int n) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     if(x == 0) {
    //         return 0;
    //     }
    //     int xpownm1 = cal_power(x, n - 1); // x_power_(n - 1)
    //     int xpown= x * xpownm1; // x_power_n
    //     return xpown;
    // }

    // FOR STACK HEIGHT USING (log(n))
    // public static int cal_power(int x, int n) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     if(x == 0) {
    //         return 0;
    //     }
    //     // if n is even
    //     if(n % 2 == 0) {
    //         return cal_power(x, n/2) * cal_power(x, n/2);
    //     } else { // if n is odd
    //         return x * cal_power(x, n/2) * cal_power(x, n/2);
    //     }
    // }

    public static void main(String[] args) {

        // String str = "abcd";
        // reverseStr(str, str.length() - 1);

        // String str1 = "abaacdaefaah";
        // FindOccurance(str1, 0, 'a');

        // int arr[] = {1, 2, 3, 3, 5};
        // System.out.println(isSorted(arr, 0));

        // String str2 = "axbcxxd";
        // moveAllx(str2, 0, 0, "");

        // String str3 = "aabbccddefghh";
        // removedup(str3, 0, "");

        // String str4 = "abc";
        // subsequences(str4, 0, "",);

        String str4 = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str4, 0, "", set);

        // int n = 5;
        // Number(n); 

        // System.out.print("Sum of Series is : ");
        // Sum_series( 1, 5, 0);

        // System.out.print("Enter a Number to Calculate Factorial : ");
        // int n = sc.nextInt();
        // int factorial = cal_factorial(n);
        // System.out.println("Factorial of " + n + " is : " + factorial);

        // int a = 0, b = 1;
        // System.out.print("Enter the Number for Fibonacci Series : ");
        // int n = sc.nextInt();
        // System.out.print("Fibonacci Series is : ");
        // System.out.print(a);
        // System.out.print(b);
        // Fibo_series(a, b, n - 2);


        // For STACK HEIGHT USING (x_power_n) & // FOR STACK HEIGHT USING (log(n))
        // System.out.print("Enter The Base : ");
        // int x = sc.nextInt();
        // System.out.print("Enter The Power : ");
        // int n = sc.nextInt();
        // int result = cal_power(x, n);
        // System.out.println("Result is : " + result);

    }
}
