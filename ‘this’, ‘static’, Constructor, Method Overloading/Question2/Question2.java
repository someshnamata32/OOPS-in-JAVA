class Ass4_pr2 {
    String accountHolderName;
    int acNum;
    double acBalance;

    Ass4_pr2(String n,int a,double b){
        accountHolderName=n;
        acNum=a;
        acBalance=b;
    }

    void deposit(double amt){
        if(amt>0)
            acBalance+=amt;
    }

    void withdraw(double amt){
        if(amt>0 && amt<=acBalance)
            acBalance-=amt;
        else
            System.out.println("Insufficient balance, withdrawal not possible");
    }

    void display(){
        System.out.println("Account Holder : "+accountHolderName);
        System.out.println("Account Number : "+acNum);
        System.out.println("Balance        : "+acBalance);
    }

    public static void main(String[] args){
        Ass4_pr2 b=new Ass4_pr2("somesh",12345,5000);
        b.deposit(1000);
        b.withdraw(7000);
        b.display();
    }
}
