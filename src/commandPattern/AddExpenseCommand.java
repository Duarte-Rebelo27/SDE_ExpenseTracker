package src.commandPattern;

import src.expenses.Expense;
import src.observerPattern.ExpenseManager;

public class AddExpenseCommand {
  private ExpenseManager expenseManager;
  private Expense expense;

  public AddExpenseCommand(ExpenseManager expenseManager, Expense expense) {
    this.expenseManager = expenseManager;
    this.expense = expense;
  }

  public void execute() {
    expenseManager.addExpense(expense);
  }
}
