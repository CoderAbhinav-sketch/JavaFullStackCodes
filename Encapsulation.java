// Encapsulation -->
// > Both data & Behaviour should be together (encapsulated)with in object
// > we should not provide the unrestricted acsses of data 
// > Private Keyword --> Do not acceses outside the class


class bankAccount{
     private double balance ; //     Properties

    public void deposit(int amount){
        balance+= amount ;
    }
    public void withdraw (int amount){
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
}


public class Encapsul {
    static void main() {
       bankAccount ba = new bankAccount();
       ba.deposit(600);
       ba.withdraw(200);
        System.out.println(ba.getBalance());
    }
}