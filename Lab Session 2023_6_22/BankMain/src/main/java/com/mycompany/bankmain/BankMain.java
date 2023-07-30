
package com.mycompany.bankmain;

public class BankMain 
{

    public static void main(String[] args) 
    {
       SavingsAccount s1 = new SavingsAccount(1234,20000000);
       CheackingAccount c1=new CheackingAccount(4567,1000000);
     
       
        System.out.println("Interest for saving Account "+s1.calculateInterest());
        System.out.println("Interet for cheacking Account "+c1.calculateInterest());
       
    }
}
