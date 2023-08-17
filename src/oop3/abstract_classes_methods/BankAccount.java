package oop3.abstract_classes_methods;

public abstract class BankAccount {

  public BankAccount(double balance){
    this.balance = balance;
  }

  private double balance;

  private void depositSalary() {
    balance += 5000;
  }

  abstract int getInterest();
}
