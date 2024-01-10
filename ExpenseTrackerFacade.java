public class ExpenseTrackerFacade {
  private ExpenseManager expenseManager;

  public ExpenseTrackerFacade() {
    this.expenseManager = new ExpenseManager();
  }

  public void addCreditCardExpense(String cardNumber, ExpenseType expenseType, double amount) {
    ExpenseFactory expenseFactory = new CreditCardExpenseFactory();
    Expense expense = expenseFactory.createExpense(description, amount);
    expenseManager.addExpense(expense);
  }

  public void addCashExpense(String description, double amount) {
    ExpenseFactory expenseFactory = new CashExpenseFactory();
    Expense expense = expenseFactory.createExpense(description, amount);
    expenseManager.addExpense(expense);
  }
}
