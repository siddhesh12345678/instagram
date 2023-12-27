//wap to find the sum of all the  factors of the number  to be entered 
// import java.util.Scanner;


public class java5 {
          
       
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
       int n=6;
        int sum=0;
        System.out.println("enter the input");
        for (int i = 1; i < n; i++) {
            if (n%i==0) {
               sum= sum+1;
            }
         }
          // perfect number if the addition of all the numbers = number entered
            if (sum==n) {
                System.out.println("perfect");
                
            } else {
                System.out.println("it is a perfect number");   
            }
    
          
        }
    }

