package oop3.abstract_classes_methods;

public class Main {
  public static void main(String[] args) {
    BankAccount account = new SavingsBankAccount(4.45);
    System.out.println(account.getInterest());
  }

}
