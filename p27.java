//WAP TO  FIND GCD & LCM
public class p27 {
    public static void main(String[] args) {
        int a=12;
        int b=18;
        int gcd=1;
        for (int i = 1; i <=a && i <=b; i++) {
            if (a%i==0 && b%i ==0) {
                gcd=i;
            }
            
            }
            int lcm = a*b/gcd;
            
            System.out.println(lcm); 
        }
       
    }

