// wap to find first 10 numbers from the fibonacci series 
public class java2 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;
        System.out.println(a+""+b+"");
        for (int i = 1; i <=n-2; i++) {
            int c= a+b;
            System.out.println(c+"");
            a=b;
            b=c;
        }
    }
}
