class MinimumBalanceException extends Exception{
    MinimumBalanceException(String msg){
        super(msg);
    }
}

class Account{
    String name;
    int acc_no;
    double balance;

    Account(String name,int acc_no,double balance){
        this.name=name;
        this.acc_no=acc_no;
        this.balance=balance;
    }

    void deposit(int amt){
        balance = balance + amt;
        System.out.println("Balance = " + balance);
    }

    void withdraw(int amt) throws MinimumBalanceException{
        if(balance - amt < 500){
            throw new MinimumBalanceException("Minimum balance should be 500");
        }
        balance = balance - amt;
        System.out.println("Balance = " + balance);
    }
}

public class Ass6_pr4 {
    public static void main(String[] args) {
        try{
            Account a = new Account("Somesh",101,2000);

            a.deposit(500);
            a.withdraw(1800);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
