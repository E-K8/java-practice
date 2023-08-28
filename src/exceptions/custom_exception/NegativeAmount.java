package exceptions.custom_exception;

public class NegativeAmount extends Exception {

  private ErrorCode errorCode;
  public NegativeAmount(ErrorCode errorCode) {
    super();
    this.errorCode = errorCode;
  }

  @Override
  public String toString() {
    return "Error occurred: "+ this.errorCode;
  }
}

enum ErrorCode {
  NEGATIVE_DEPOSIT(1002) {
    @Override
    public String toString() {
      return ("Negative amount not accepted. Error code: " + NEGATIVE_DEPOSIT.errorNumber);
    }
  },
  ZERO_DEPOSIT(1003) {
    @Override
    public String toString() {
      return ("Zero amount not accepted. Error code: " + ZERO_DEPOSIT.errorNumber);
    }
  };

 private int errorNumber;

  ErrorCode(int errorNumber) {
    this.errorNumber = errorNumber;
  }
}