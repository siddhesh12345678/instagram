public class product
 {
    private int no;
    private String name;
    private int price;
 
   
    public int getNo() {
        return no;
    }
     public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
 product(int no,String name,int price)
    {
        this.no=no;
        this.name=name;
        this.price=price;
    }
    public static void main(String[] args) {
       
        product foo = new product(1,"watch",200);
          foo.setPrice(300);
        System.out.println(foo.getNo());
          System.out.println(foo.getName());
           System.out.println(foo.getPrice());

        product f1 = new product(20,"shoes",300);
          f1.setPrice(400);
        
        System.out.println(f1.getNo());
          System.out.println(f1.getName());
           System.out.println(f1.getPrice());
        
       product f2 = new product(30,"tshirt",500);
         f2.setPrice(550);
         System.out.println(f2.getNo());
          System.out.println(f2.getName());
          System.out.println(f2.getPrice());
           
         product f4= new product(30,"tshirt",500);
         f4.setPrice(550);
         System.out.println(f4.getNo());
          System.out.println(f4.getName());
          System.out.println(f4.getPrice());
          
          product f5 = new product(30,"tshirt",500);
         f5.setPrice(550);
         System.out.println(f5.getNo());
          System.out.println(f5.getName());
          System.out.println(f5.getPrice());
           
           
    }
}