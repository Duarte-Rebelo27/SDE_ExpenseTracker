public class BasicExpense implements Expense {
  private String description;
  private double amount;

  public BasicExpense(String description, double amount) {
    this.description = description;
    this.amount = amount;
  }

  @Override
  public String getDescription() {
    return description;
  }

  public double getAmount() {
    return amount;
  }
}
