public class Main {
    public static void main(String[] args) {
        ExpenseTrackerFacade expenseTrackerFacade = new ExpenseTrackerFacade();
        ExpenseManager expenseManager = new ExpenseManager();
        BudgetAlertSystem budgetAlertSystem = new BudgetAlertSystem();
        ExpenseBuilder expenseBuilder = new BasicExpenseBuilder();
        ExpenseDirector expenseDirector = new ExpenseDirector(expenseBuilder);

        expenseTrackerFacade.addCreditCardExpense("Coffee", 2.75);
        expenseTrackerFacade.addCashExpense("Newspaper", 1.99);

        Expense baseExpense = new BasicExpense("Dinner", 50);
        Expense convertedExpense = new CurrencyConverterDecorator(baseExpense, 1.2);


        Expense scannedExpense = new ReceiptScanDecorator(convertedExpense, "http://www.receipts.com/1234");
        Expense expense = expenseDirector.constructCashExpense("Coffee", 2.75);

        expenseManager.addObserver(budgetAlertSystem);
        budgetAlertSystem.update(new CashExpense("Newspaper", 12.99));

        expenseManager.addExpense(new CreditCardExpense("Coffee", 2.75));
        expenseManager.addExpense(new CashExpense("Newspaper", 122.99));
    }
}
