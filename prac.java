/**
 * prac
 */
public class prac {

    public static void main(String[] args) {
        {
           
            try {
                System.out.println(3/0);
            }
            // } catch (Exception e) {
            //     // TODO: handle exception
            //     System.out.println("handled");
            // }
            finally{
                System.out.println("finally");
                 System.out.println("program starts");
            }
        }
    }
}

 