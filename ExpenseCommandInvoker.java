public class ExpenseCommandInvoker {
  private ExpenseCommand command;

  public void setCommand(ExpenseCommand command) {
    this.command = command;
  }

  public void executeCommand() {
    command.execute();
  }
}
