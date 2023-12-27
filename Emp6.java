public class Emp6 {
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
    public long getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    Emp6(int no,String name,int price)
    {
        this.no=no;
        this.name=name;
        this.price=price;
    }
    public static void main(String[] args) {
       
        Emp6 foo = new Emp6(1,"");
        
    }
}
