// WAP TO CHECK IF THE NUMBER IS A PERFECT SQUARE OR NOT
public class p28 {
    public static void main(String[] args) {
        int i=23;
        boolean isperfectsquare=false;

         for (int j = 1; j*j <=i; j++) 
         {
            if (j*j==i) {
                isperfectsquare=true;
            }
            
            if (isperfectsquare) {
                System.out.println("number is a perfect square");
            } else {
                System.out.println("number is not a perfect sqauare");
                
            }
        }
    }
}
