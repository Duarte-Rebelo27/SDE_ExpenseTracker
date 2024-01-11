package src;

public class UndoExpenseCommand implements ExpenseCommand{
  private ExpenseManager expenseManager;

  public UndoExpenseCommand(ExpenseManager expenseManager) {
    this.expenseManager = expenseManager;
  }

  @Override
  public void execute() {
    System.out.println("Undoing last expense...");
  }
}
