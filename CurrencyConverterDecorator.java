public class CurrencyConverterDecorator implements ExpenseDecorator {
  private Expense expense;
  private double conversionRate;

  public CurrencyConverterDecorator(Expense expense, double conversionRate) {
    this.expense = expense;
    this.conversionRate = conversionRate;
  }

  @Override
  public String getDescription() {
    return expense.getDescription() + "(Converted)";
  }

  @Override
  public double getAmount() {
    return expense.getAmount() * conversionRate;
  }
}
