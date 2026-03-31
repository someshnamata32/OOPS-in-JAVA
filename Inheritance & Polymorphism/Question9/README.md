9. Design a banking system using Java interface and inheritance. Create an interface
Account with methods displayBalance() and withdraw(). Derive two classes
SavingsAccount and CurrentAccount from Account. Implement additional methods
and properties for each account type.
• Account:
o displayBalance()
o withdraw(double amount)
o displayAccountDetails()
• SavingsAccount
o Data Members: accountNumber (String), balance (double), interestRate
(double)
o Member Functions: displayBalance(), withdraw(double amount),
displayAccountDetails()
• CurrentAccount
o Data Members: accountNumber (String), balance (double), overdraftLimit
(double)
o Member Functions: displayBalance(), withdraw(double amount),
displayAccountDetails()
