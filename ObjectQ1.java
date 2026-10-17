// Create a clas Employee with Following Properties and Method 
// . salary(property , int )
//  get Salary(Method , Returning int)
//  Name (property (String))
//  getName()
//  SetName()


class Employee1{
    int salary;
    String Name ;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return Name;
    }
    public void setName(String n){
         Name = n;
    }
}

// Create a class cellPhone with Method to Print "Ringing" , "Vibrating ";


class cellPhone{
    public void callFr(){
        System.out.println("Calling Rahul.....");
    }
    public void ring(){
        System.out.println("Ringing...........");
    }
    public void vibrate(){
        System.out.println("Vibrating............");
    }
}

public class P1 {
    static void main() {
   Employee1 abhi = new Employee1();
     abhi.setName("Abhinav jha ");
        System.out.println( abhi.getName());
        abhi.salary = 30000;
        System.out.println(abhi.getSalary());

        // problem 2
        cellPhone Vivo = new cellPhone();
        Vivo.callFr();
        Vivo.vibrate();
        Vivo.ring();

    }
}