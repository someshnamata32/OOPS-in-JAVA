import java.util.Scanner;

class InsufficientFundsException extends Exception{
    InsufficientFundsException(String msg){
        super(msg);
    }
}

class InvalidAmountException extends Exception{
    InvalidAmountException(String msg){
        super(msg);
    }
}

class InvalidPinException extends Exception{
    InvalidPinException(String msg){
        super(msg);
    }
}

class WithdrawalLimitExceededException extends Exception{
    WithdrawalLimitExceededException(String msg){
        super(msg);
    }
}

class Account{
    String name;
    double balance;
    int pin;

    Account(String name,double balance,int pin){
        this.name=name;
        this.balance=balance;
        this.pin=pin;
    }

    void checkPin(int p) throws InvalidPinException{
        if(p!=pin){
            throw new InvalidPinException("Wrong PIN");
        }
    }

    void checkBalance(){
        System.out.println("Balance = " + balance);
    }

    void withdraw(double amt) throws Exception{
        if(amt<=0){
            throw new InvalidAmountException("Invalid amount");
        }
        if(amt>balance){
            throw new InsufficientFundsException("Not enough balance");
        }
        if(amt>20000){
            throw new WithdrawalLimitExceededException("Limit exceeded");
        }

        balance = balance - amt;
        System.out.println("Balance after withdraw = " + balance);
    }
}

public class Ass6_pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            Account a = new Account("Somesh",50000,1234);

            System.out.print("Enter PIN: ");
            int p = sc.nextInt();
            a.checkPin(p);

            a.checkBalance();

            System.out.print("Enter withdraw amount: ");
            double amt = sc.nextDouble();

            a.withdraw(amt);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
