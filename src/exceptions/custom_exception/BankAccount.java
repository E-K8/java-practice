package exceptions.custom_exception;

public class BankAccount {
  public static void depositMoney(double amount) throws NegativeAmount {

    if (amount < 0) {
      throw new NegativeAmount(ErrorCode.NEGATIVE_DEPOSIT);
    } else if (amount ==0){
      throw new NegativeAmount(ErrorCode.ZERO_DEPOSIT);
    }

    System.out.println("You have deposited " + amount);
  }
}

