# Expense Tracker

## What the project is about
An expense tracker that allows users to add their expenses with additional features like an alert system if the user spends too much.

## Cooperation in the Project
Between the two of us, we have decided to do this expense tracker. We collaborated by creating three design patterns each.
- Duarte made the Builder, Observer and Decorator patterns.
- Ignacio made the Factory, Command and Facade patterns.

# Structural Design Patterns
## Decorator Pattern:
**Purpose**: The decorator pattern is used to dynamically add responsibilities to an object. It's used here to add functionality to your expenses, such as currency conversion and receipt scanning.

**Implementation**: ExpenseDecorator is a Decorator interface. CurrencyConverterDecorator and ReceiptScanDecorator are concrete decorators that add specific functionality to the output.

**Project Usage**: Decorators are applied to outputs to extend their behavior. For example, credit card issuance can be supplemented with currency conversion.
![Decorator class diagram](https://github.com/Duarte-Rebelo27/SDE_ExpenseTracker/assets/112752484/4f5ffc51-884b-4be4-b377-2987e155e5f3)

## Facade Pattern:
**Purpose**: The Facade pattern provides a simplified interface to complex subsystems. This hides the complexity of your expense management system.

**Implementation**: ExpenseTrackerFacade serves as a high-level interface and encapsulates the process of creating and adding expenses to managers.

**Project Usage**: The facade simplifies the customer's code by providing a convenience method (addCreditCardExpense) for adding expenses and shielding the customer from the internal details of expense creation.
![Facade class diagram](https://github.com/Duarte-Rebelo27/SDE_ExpenseTracker/assets/112752484/1cb6b06a-df59-4e70-b107-189231c3b21d)


# Behavioral Design Patterns
## Observer Pattern:
**Purpose**: The Observer pattern defines one-to-many dependencies between objects. It is used here to notify observers (such as budget alert systems) when new expenses are added.

**Implementation**: ExpenseObserver is an observer interface and BudgetAlertSystem is a concrete observer for large expenses.

**Project use**: Mainly used by expense managers. When new expenses are added, observers are notified and certain actions are taken (such as budget alerts).
![Observer class diagram](https://github.com/Duarte-Rebelo27/SDE_ExpenseTracker/assets/112752484/b697b6ed-7d52-4218-a732-aeb521fece9e)

## Command Pattern:
**Purpose**: The command pattern is used to encapsulate an expense operation as an object (ExpenseCommand). Operations such as adding output can be parameterized.

**Implementation**: ExpenseCommand is a command interface with the Execute method. AddExpenseCommand is a specific command for adding expenses. ExpenseCommandInvoker acts as a caller and triggers commands.

**Project Usage**: The command pattern is applied to encapsulate the process of adding output, providing flexibility and the ability to undo and redo operations.
![Command design pattern](https://github.com/Duarte-Rebelo27/SDE_ExpenseTracker/assets/112752484/ee6866a2-5ee1-4552-93b3-14380289e785)

# Creational Design Patterns
## Factory Pattern: 
**Purpose**: The Factory Method Pattern is used to create an instance of Expense without specifying a concrete class, allowing flexibility in object creation.

**Implementation**: ExpenseFactory is a factory interface and CreditCardExpenseFactory is a concrete factory that creates instances of CreditCardExpense. Factories are used within facades to generate output.

**Project usage**: Different factories can be used to create different types of output. In this example, a credit card billing factory is used within the facade.
![Factory class diagram](https://github.com/Duarte-Rebelo27/SDE_ExpenseTracker/assets/112752484/9057fe55-59ae-4f69-a3ae-f42fd84161a1)

## Builder Pattern
**Purpose**: The Builder Pattern is used to build complex objects step by step. In this case, it is used to create the cost instance.

**Implementation**: The ExpenseBuilder interface defines construction steps (setDescription, setAmount), and BasicExpenseBuilder is a concrete builder that implements these steps. The ExpenseDirector class controls the construction process.

**Project Usage**: The builder is used to create expense objects with various properties and provides a fluid interface for setting details such as description and amount.
![Builder class diagram](https://github.com/Duarte-Rebelo27/SDE_ExpenseTracker/assets/112752484/33aacb5d-90ff-4981-8a62-02b05014146a)
