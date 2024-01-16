package src.decoratorPattern;

import src.Expense;
import src.decoratorPattern.ExpenseDecorator;

public class ReceiptScanDecorator implements ExpenseDecorator {
  private Expense expense;
  private String receiptUrl;

  public ReceiptScanDecorator(Expense expense, String receiptUrl) {
    this.expense = expense;
    this.receiptUrl = receiptUrl;
  }

  @Override
  public String getDescription() {
    return expense.getDescription() + "(Receipt Scanned)";
  }

  @Override
  public double getAmount() {
    return expense.getAmount();
  }
}
