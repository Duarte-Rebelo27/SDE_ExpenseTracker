public class Main {
    public static void main(String[] args) {
        ExpenseTrackerFacade expenseTrackerFacade = new ExpenseTrackerFacade();

        expenseTrackerFacade.addCreditCardExpense("Coffee", 2.75);
        expenseTrackerFacade.addCashExpense("Newspaper", 1.99);

        Expense baseExpense = new BasicExpense("Dinner", 50);
        Expense convertedExpense = new CurrencyConverterDecorator(baseExpense, 1.2);
        Expense scannedExpense = new ReceiptScanDecorator(convertedExpense, "http://www.receipts.com/1234");
    }
}
