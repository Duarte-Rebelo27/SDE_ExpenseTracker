package src.expenses;

public class CreditCardExpense implements Expense {
  private String description;
  private double amount;

  public CreditCardExpense(String description, double amount) {
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
