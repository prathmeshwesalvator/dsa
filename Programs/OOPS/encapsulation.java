package Programs.OOPS;

class ATM {

    private String accountHolder;
    private double balance;

    ATM(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void credit(int amount) {
        if (this.balance >= 0) {
            this.balance += amount;
            System.out.println("Dear " + this.accountHolder + " " + amount + " is added to you account");
        } else {
            double prevBalance = this.balance + amount;
            this.balance = this.balance + amount;
            System.out.println("Dear " + this.accountHolder + " "
                    + "After cutting negative amount , your account balance is " + this.balance
                    + " & your previous balance is " + prevBalance);
        }
    }

    public void debit(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Your account is debitaed by " + amount + " Current balance is " + this.balance);
        } else {
            System.out.println("Insufficient balance , you requied " + (amount - this.balance) + "more to debit");
        }
    }

    public double getBalance() {
        return this.balance;
    }
}


class Encapsulation{

    public static void main(String[] args){

        ATM atm = new ATM("Prathmesh", 20000);
        atm.debit(20000);
        atm.credit(4000);
        System.out.println(atm.getBalance());
    }    

}