package oop3.abstract_classes_methods;

public class CheckingBankAccount extends BankAccount {
  public CheckingBankAccount(double balance) {
    super(balance);
  }

  @Override
  int getInterest() {
    return 7;
  }
}
