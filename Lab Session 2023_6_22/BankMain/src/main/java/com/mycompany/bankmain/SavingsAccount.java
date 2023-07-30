package com.mycompany.bankmain;

public class SavingsAccount extends BankAccount
{
    public SavingsAccount(int accountNumber,double balance)
    {
        super(accountNumber,balance);
        
    }
    @Override 
    
    public double calculateInterest()
    {
        return getBalance()* 0.12;
    }
    
}
