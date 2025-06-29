import java.util.*;
public class arrays {
    // public static void Array(int arr[]) {   // function for sorts
    //     for(int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }

    // }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int marks[] = new int[size];
        System.out.println("Enter Rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter Columns : ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        //input for 2D array
        for(int i = 0; i < rows; i++) {  //outer loop for rows
            //columns
            for(int j = 0; j < cols; j++) { // inner loop for columns
                System.out.printf("Enter element [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        //output for 2D array 
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(array[i][j] == x) {
                    System.out.println("x found at locationa (" + i + ", " + j + ")");
                }
                // System.out.print(array[i][j] + " ");
            }
            // System.out.println();
        }

        
        // //input for 1D array
        // for(int i = 0; i < size; i++) {
        //     marks[i] = sc.nextInt();
        // }

        // int x = sc.nextInt();

        // //output for 1D array
        // for(int i = 0; i < marks.length; i++ ) {
        //     if(marks[i] == x) {
        //         System.out.println("x found at index : "+ i);
        //     }
        // }
        
        // Sorts

          // int arr[] = {1,9,11,6,8,28};

        // Bubble Sort
        // for(int i = 0; i < arr.length - 1; i++) {
        //     for(int j = 0; j <arr.length - i - 1; j++) {
        //         if(arr[j] > arr[j + 1]) {

        //             int x = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = x;
        //         }
        //     }
        // }
        // Array(arr);

        // Selection Sort
        // for(int i = 0; i < arr.length - 1; i++) {
        //     int smallest = i;
        //     for(int j = i + 1; j < arr.length; j++) {
        //         if(arr[smallest] > arr[j]) {
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }
        // Array(arr);

         // Insertion Sort
        // for(int i = 1; i < arr.length; i++) {
        //     int current = arr[i];
        //     int j = i - 1;
        //     while(j >= 0 && arr[j] > current) {
        //         arr[j + 1] = arr[j];
        //         j--;
        //     }

        //     //placement
        //     arr[j + 1] = current;
        // } 
        // Array(arr);
    }
}