package oop1.access_modifiers;

import oop1.access_modifiers.Banking.Account;

public class Main {
  public static void main(String[] args) {
    Account account = new Account();
    account.balance = 800;
    account.addInterest();
  }
}
