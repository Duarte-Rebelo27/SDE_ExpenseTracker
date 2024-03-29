package src.facadePattern;

import src.expenses.Expense;
import src.factoryPattern.CashExpenseFactory;
import src.factoryPattern.CreditCardExpenseFactory;
import src.factoryPattern.ExpenseFactory;
import src.observerPattern.ExpenseManager;

public class ExpenseTrackerFacade {
  private ExpenseManager expenseManager;

  public ExpenseTrackerFacade() {
    this.expenseManager = new ExpenseManager();
  }

  public void addCreditCardExpense(String description, double amount) {
    ExpenseFactory expenseFactory = new CreditCardExpenseFactory();
    Expense expense = expenseFactory.createExpense(description, amount);
    expenseManager.addExpense(expense);
  }

  public Expense addCashExpense(String description, double amount) {
    ExpenseFactory expenseFactory = new CashExpenseFactory();
    Expense expense = expenseFactory.createExpense(description, amount);
    expenseManager.addExpense(expense);
    return expense;
  }
}
