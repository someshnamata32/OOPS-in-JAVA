5. You are building a simple ATM withdrawal system. Create an account class with
properties like name, balance and pin. Implement the following features:
a. The user can check the balance.
b. The user can withdraw an amount. If the user tries to withdraw more than their
balance, throw a custom exception InsufficientFundsException. If the
withdrawal amount is negative or zero, throw a custom
InvalidAmountException.
c. Before making any transaction (balance check or withdraw) the pin has be
entered. If the user enters an invalid PIN, throw a custom exception
InvalidPinException.
d. If the user tries to withdraw more than the maximum allowed limit, throw a
custom exception WithdrawalLimitExceededException.
