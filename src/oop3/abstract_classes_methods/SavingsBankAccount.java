package oop3.abstract_classes_methods;

public class SavingsBankAccount extends BankAccount{
  public SavingsBankAccount(double balance) {
    super(balance);
  }

  @Override
  int getInterest() {
    return 5;
  }
}
