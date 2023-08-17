package oop3.abstract_classes_methods;

public class Main {
  public static void main(String[] args) {
    BankAccount account = new SavingsBankAccount();
    System.out.println(account.getInterest());
  }

}
