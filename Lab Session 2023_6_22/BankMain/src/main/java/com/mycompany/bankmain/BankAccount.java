
package com.mycompany.bankmain;

public abstract class BankAccount 
{
    private int accountNumber;
    private double balance;
    
    public BankAccount(int accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
     
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    public void setBalance(double balance)
    {
        this.balance=balance;
        
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public abstract double calculateInterest();
}
