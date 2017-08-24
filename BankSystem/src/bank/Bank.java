/*
 * Edward Bersin : tuf18309@temple.edu
 * Last Modified April 27th 2015
 * This program is designed to create an array of bank account objects and then perform
 * the operations selected by the user on the array. Operations include adding a new account,
 * making a deposit, making a withdrawal, printing a report of all accounts, and a search
 * function to locate specific accounts.
 */

package bank;

import javax.swing.JOptionPane;

public class Bank
{
    private static BankAccount[] accountArray;
    
    public static void main(String[] args)
    {
        String number = JOptionPane.showInputDialog(null, "Please enter the number of accounts to be created: ");
        int numberOfAccounts = Integer.parseInt(number);
        accountArray = new BankAccount[numberOfAccounts];
        String response = "";
        
        do
        {
            response = JOptionPane.showInputDialog(null, "Please enter the initials of the operation you wish to perform: "
                    + "\nAdd New Account - ANA \nDeposit - D \nWithdrawal - W \nPrint Report - PR"
                    + "\nSearch Accounts - SA \nExit - E");
            if(response.equalsIgnoreCase("ANA"))
            {
                addNewAccount();
            }
            else if(response.equalsIgnoreCase("D"))
            {
                deposit();
            }
            else if(response.equalsIgnoreCase("W"))
            {
                withdraw();
            }
            else if(response.equalsIgnoreCase("PR"))
            {
                sortAccounts();
            }
            else if(response.equalsIgnoreCase("SA"))
            {
                searchAccounts();
            }
            else
            {
                break;
            }
        }while(!(response.equalsIgnoreCase("E")));
    }

    public static void addNewAccount()
    {
        String accountNumber, accountHolderName;
        double balance;
        
        if(BankAccount.getNumberOfAccounts() < accountArray.length)
        {
            accountNumber = JOptionPane.showInputDialog(null, "Please enter the account number: ");
            accountHolderName = JOptionPane.showInputDialog(null, "Please enter the account holder's name: ");
            String amount = JOptionPane.showInputDialog(null, "Please enter the account's balance: ");
            balance = Double.parseDouble(amount);
            
            if((!(accountNumber.isEmpty()))&&(!(accountHolderName.isEmpty())))
            {
                if(balance > 0)
                {
                    BankAccount newAccount = new BankAccount(accountNumber, balance, accountHolderName);
                    accountArray[BankAccount.getNumberOfAccounts()-1] = newAccount;
                }
                else
                {
                    BankAccount newAccount = new BankAccount(accountNumber, accountHolderName);
                    accountArray[BankAccount.getNumberOfAccounts()-1] = newAccount;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error: Insufficient information to create account.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error: Too many accounts.");
        }
    }
    
    public static void deposit()
    {
        String response = JOptionPane.showInputDialog(null, "Please enter the account number to which "
                + "you wish to make a deposit: ");
        
        boolean found = false;
        
        for(int i = 0; i < BankAccount.getNumberOfAccounts(); i++)
        {
            if(accountArray[i].getAccountNumber().equalsIgnoreCase(response))
            {
                String deposit = JOptionPane.showInputDialog(null, "Please enter the amount you wish to deposit: ");
                double amount = Double.parseDouble(deposit);
                accountArray[i].deposit(amount);
                found = true;
            }
        }
        
        if(found == false)
        {
            JOptionPane.showMessageDialog(null, "The chosen account was not found.");
        }
    }
    
    public static void withdraw()
    {
        String response = JOptionPane.showInputDialog(null, "Please enter the account number from which "
                + "you wish to make a withdrawl: ");
        
        boolean found = false;
        
        for(int i = 0; i < BankAccount.getNumberOfAccounts(); i++)
        {
            if(accountArray[i].getAccountNumber().equalsIgnoreCase(response))
            {
                String withdraw = JOptionPane.showInputDialog(null, "Please enter the amount you wish to withdraw: ");
                double amount = Double.parseDouble(withdraw);
                accountArray[i].withdraw(amount);
                found = true;
            }
        }
        
        if(found == false)
        {
            JOptionPane.showMessageDialog(null, "The chosen account was not found.");
        }
    }
    
    public static void sortAccounts()
    {
        double totalBalance = 0, averageBalance = 0;
        
        for(int i = 0; i < BankAccount.getNumberOfAccounts(); i++)
        {
            for (int j = i+1; j < BankAccount.getNumberOfAccounts(); j++)
            {
                if(accountArray[j].getBalance() > accountArray[i].getBalance())
                {
                    BankAccount temp;
                    temp = accountArray[i];
                    accountArray[i] = accountArray[j];
                    accountArray[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < BankAccount.getNumberOfAccounts(); i++)
        {
            totalBalance += accountArray[i].getBalance();
        }
        
        averageBalance = totalBalance/BankAccount.getNumberOfAccounts();
        
        JOptionPane.showMessageDialog(null, "The total number of accounts is: " + BankAccount.getNumberOfAccounts()
        + "\nThe total balance across all accounts is: $" + totalBalance + "\nThe average balance across all accounts is: $"
        + averageBalance);
        
        for(int i = 0; i < BankAccount.getNumberOfAccounts(); i++)
        {
            accountArray[i].printReport();
        }
    
    }
    
    public static void searchAccounts()
    {
        String name = JOptionPane.showInputDialog(null, "Please enter the name of the account holder you wish to look up: ");
        
        boolean found = false;
        
        for (int i = 0; i < BankAccount.getNumberOfAccounts(); i++)
        {
            if (accountArray[i].getAccountHolderName().contains(name))
            {
                accountArray[i].printReport();
                found = true;
            }
        }
        
        if(found == false)
        {
            JOptionPane.showMessageDialog(null, "The chosen account was not found.");
        }
        
    }
}
