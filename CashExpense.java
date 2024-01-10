public class CashExpense {
  private String description;
  private double amount;

  public CashExpense implements Expense {
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
