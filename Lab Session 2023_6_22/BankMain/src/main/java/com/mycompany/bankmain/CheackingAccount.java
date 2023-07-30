package com.mycompany.bankmain;

public class CheackingAccount extends BankAccount
{
   public CheackingAccount(int accountNumber,double balance)
    {
       super(accountNumber,balance);
        
    }
    @Override 
    
    public double calculateInterest()
    {
        return getBalance()* 0.02;
    }
}
