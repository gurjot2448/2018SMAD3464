/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;

import java.io.PrintStream;

/**
 *
 * @author SUKHCHAIN
 */
public class OverdraftAccount extends Bankaccount1 

{
  int overdraftLimit;  

//default constructor
  OverdraftAccount()
  {
      super();
      this.overdraftLimit =overdraftLimit;
  }
  //parametrized constructor
  OverdraftAccount(String id,String name,int acNo,String ownerName,int balance,int overdraftLimit)
  {
     super(id,name,acNo,ownerName,balance); 
     this.overdraftLimit = overdraftLimit; 
  }
  
  @Override
  public String toString()
    {
        
        String bankdetails = super.toString();
        String bankaccountdetails = super.toString();
        String data = "overdraft limit :" + this.overdraftLimit;
        data =  bankdetails+bankaccountdetails+data;
        
        return data;
    }  
    
  public void withdraw()
  {
   if(overdraftLimit == 1500 && balance == 1000)
   {
       
     System.out.print("withdraw :" +withdraw(overdraftLimit) );
   }
   else
       System.out.print("withdraw not allowed");
  }
}
  
 
