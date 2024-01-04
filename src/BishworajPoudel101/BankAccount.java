package BishworajPoudel101;

public class BankAccount {
    public static void main(String[] args) {
        BankAc b1 = new BankAc();
        b1.name = "Shashi";

        b1.deposit(1000);
        b1.deposit(3000);
        b1.withdraw(3000);

        b1.displayBalance();
    }
}

class BankAc{
    String name;
   private double balance;

   BankAc(){
      this.balance = 0;
   }

   void deposit(double amount){
       this.balance +=amount;
   }

   void withdraw(double amount){
       if(this.balance>=amount){
           this.balance -=amount;
       }else{
           System.out.println("Insufficient Amount");
       }
   }

    void displayBalance(){
        System.out.println(this.name+  " has $"+this.balance);
    }



}
