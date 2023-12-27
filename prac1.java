import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
 class sal implements Comparable<Emp>{
     int id;
   String name;
   int experience;
   long salaray;

   public sal(int id,String name,int experience,long salaray)
   {
   
    this.id=  id;
   this.name=name;
   this.experience=experience;
   this.salaray= salaray;


   }
  @Override
  public int comparaeTo(Emp e)
  {
    if (this.experience>0) {
          return 1;

    } else if(
        this.experience<e.experience){
        return -1;
    }
  }



  
 }
public String toString()
{
 return "";
}
public class prac1 {

    public static void main(String[] args) 
    {
        List<Emp> s= new ArrayList<Emp>();
         s.add(1,"");
         s.add("sidd");
         s.add('c');
         s.add("sanika");

    }
}