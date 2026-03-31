4. Write a class called Account with the following properties and methods:
Properties: String name, int acc_no,double balance
Methods: void deposit(int amt)
 void withdraw(int amt),
 void transfer (Account acc1, Account acc2, int amt)
Assume that an account needs to have a minimum balance of 500. If an attempt is
made to withdraw or transfer, which results in balance below 500, throw a user
defined exception called MinimumBalanceException.
