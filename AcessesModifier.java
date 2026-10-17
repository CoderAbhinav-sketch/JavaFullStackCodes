
/*
. Acesses Modifier 
. There are 4 Type of Acesses Modifier in Java
   1. Public 
   2. privete
   3. protected
   4. Default

   . getter & Setter 
 */
class myEmp{
   private int id ;
   private  String name;

   public String getName(){
       return name;
   }
   public void setName(String n ){
       name = n;
   }
   public int getId(){
       return id;
   }
   public void setId(int i){
       id = i;
   }
}




public class Accesses {
    static void main() {
myEmp e = new myEmp();
e.setName("Abhina jha ");
        System.out.println(e.getName());
        e.setId(76);
        System.out.println(e.getId());


        // Acesse modifier is liye lagaya jata hai ki ham kisi method ke uppar
        // Validation laga sake
        // Taaki hamare data koi aur aake acese na kar sake
        //Aur koi hamare data ko cahanee na kar sake
    }
}