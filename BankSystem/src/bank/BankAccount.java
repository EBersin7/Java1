package bank;

import javax.swing.JOptionPane;

public class BankAccount
{
    private double balance;
    private String accountNumber;
    private String accountHolderName;
    
    private static int numberOfAccounts = 0;

    public void deposit(double amount)
    {
        if(amount >= 0)
        {
            balance += amount;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error: Illegal deposit amount.");
        }
    }

    public void withdraw(double amount)
    {
        if(balance - amount >= 0)
        {
            balance -= amount;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error: Illegal withdraw amount.");
        }
    
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }
    
    public void setAccountHolderName(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName()
    {
        return accountHolderName;
    }

    public void printReport()
    {
        JOptionPane.showMessageDialog(null,"Account number: " + getAccountNumber()
                + "\nAccount holder name: " + getAccountHolderName() + "\nBalance: $" + getBalance());
    }
    
    public static int getNumberOfAccounts()
    {
        return numberOfAccounts;
    }
    
    BankAccount(String accountNumber, double balance, String accountHolderName)
    {
            setAccountNumber(accountNumber);
            deposit(balance);
            setAccountHolderName(accountHolderName);
            numberOfAccounts++;
    }
    
    BankAccount(String accountNumber, String accountHolderName)
    {
        this(accountNumber, 0.0, accountHolderName);
    }
}