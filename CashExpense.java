public class CashExpense implements Expense {
  private String description;
  private double amount;

  public CashExpense(String description, double amount) {
    this.description = description;
    this.amount = amount;
  }

  public String getDescription() {
    return description;
  }

  public double getAmount() {
    return amount;
  }
}
