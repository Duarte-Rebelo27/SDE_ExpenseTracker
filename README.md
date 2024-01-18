# Expense Tracker

## Decorator Pattern:
Purpose: The decorator pattern is used to dynamically add responsibilities to an object. It's used here to add functionality to your expenses, such as currency conversion and receipt scanning.

Implementation: ExpenseDecorator is a Decorator interface. CurrencyConverterDecorator and ReceiptScanDecorator are concrete decorators that add specific functionality to the output.

Project Usage: Decorators are applied to outputs to extend their behavior. For example, credit card issuance can be supplemented with currency conversion.

## Observer Pattern:
Purpose: The Observer pattern defines one-to-many dependencies between objects. It is used here to notify observers (such as budget alert systems) when new expenses are added.

Implementation: ExpenseObserver is an observer interface and BudgetAlertSystem is a concrete observer for large expenses.

Project use: Mainly used by expense managers. When new expenses are added, observers are notified and certain actions are taken (such as budget alerts).

## Factory Method Pattern: 
Purpose: The Factory Method Pattern is used to create an instance of Expense without specifying a concrete class, allowing flexibility in object creation.

Implementation: ExpenseFactory is a factory interface and CreditCardExpenseFactory is a concrete factory that creates instances of CreditCardExpense. Factories are used within facades to generate output.

Project usage: Different factories can be used to create different types of output. In this example, a credit card billing factory is used within the facade.