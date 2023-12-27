public class p31 {
    public static void main(String[] args) {
       for (int i = 1600; i<=2400; i++) {
        if (i%4==0 &&(i%100!=0||i%400==0)) {
            System.out.println(i);
        }
       }
    }
}
