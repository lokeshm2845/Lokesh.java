public class Patterns {
    public static void main(String[] args) {
        // Pattern Code

        // ButterFly Pattern
            int n = 5;

            //upper half

            for(int i = 1; i <= n; i++) {
                //first part

                for(int j =1; j <= i; j++) {
                    System.out.print("*");
                }

                //spaces

                int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
                // second part

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            //lower half

            for(int i = n; i >= 1; i--) {
                //first part

                for(int j =1; j <= i; j++) {
                    System.out.print("*");
                }

                //spaces

                int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // second part

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Solid Rhombus

        for(int i =1; i <= n; i++) {
            //spaces

            for(int j =1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //stars

            for(int j = 1; j <= n; j++) {
                System.err.print("*");
            }
            System.out.println();
        }

        // Number Pyramid

        for(int i = 1; i <= n; i++) {
            //spaces

            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //numbers
            
            for(int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        // Palindromic Pyramid

        for(int i = 1; i <= n; i++) {
            //spaces

            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //first part

            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            //second part

            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Hollow ButterFly Pattern
           int x = 5;
            int i,j;

               //upper half

               for(i = 1; i <= x; i++) {
                   //first part

                   for(j =1; j <= i; j++) {
                    if(j == 1 || j == i) {
                        System.out.print("*");
                   } else {
                        System.out.print(" ");
                     }
                }
   
                   //spaces

                   int spaces = 2 * (x - i);
               for(j = 1; j <= spaces; j++) {
                   System.out.print(" ");
               }
               
               // second part

               for(j = 1; j <= i; j++) {
                     if(j == 1 || j == i) {
                          System.out.print("*");
                     } else {
                          System.out.print(" ");
                     }
               }
               System.out.println();
           }
   
               //lower half

               for(i = x; i >= 1; i--) {
                   //first part

                   for(j =1; j <= i; j++) {
                    if(j == 1 || j == i) {
                        System.out.print("*"); 
                    } else {
                        System.out.print(" ");
                    } 
                }
   
                   //spaces

                   int spaces = 2 * (x - i);
               for(j = 1; j <= spaces; j++) {
                   System.out.print(" ");
               }
               
               // second part

               for(j = 1; j <= i; j++) {
                        if(j == 1 || j == i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
               }
               System.out.println();
           }

            // Hollow Rhombus    
              for(i = 1; i <= n; i++) {
                //spaces

                for(j = 1; j <= n - i; j++) {
                 System.out.print(" ");
                }
    
                //stars

                for(j = 1; j <= n; j++) {
                 if(i == 1 || i == n || j == 1 || j == n) {
                      System.out.print("*");
                 } else {
                      System.out.print(" ");
                 }
                }
                System.out.println();
            }

            // Pascal Triangle
            for(i = 0; i < n; i++) {
                //spaces

                for(j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }

                //numbers

                int num = 1;
                for(j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    num = num * (i - j) / (j + 1);
                }
                System.out.println();
            }

            // Number Half Pyramid
            for(i = 1; i <= n; i++) {
                //spaces

                for(j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                //numbers

                for(j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }

            // Inverted Number Half Pyramid
            for(i = 1; i <= n; i++) {
                for(j = n; j >= i; j--) {
                    System.out.print(i);
                }
                System.out.println();
            }
    }
}
