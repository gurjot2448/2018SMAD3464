/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;

/**
 *
 * @author SUKHCHAIN
 */
public class Bankaccount1  extends Bank1
{
    int acNo;
    String ownerName;
    int balance;
    
    //default constructor
    Bankaccount1()
    {
        super();
        this.acNo = acNo;
        this.ownerName = ownerName;
        this.balance = balance;
       
    }
    
    //parametrised constructor
    Bankaccount1(String id,String name,int acNo,String ownerName,int balance)
    {
        super(id,name);
        this.acNo = acNo;
        this.ownerName =ownerName;
        this.balance = balance;
        
    }
    void setAcNo()
   {
       System.out.println("enter acNo :");
       id = in.nextLine();
   }
   
    int getAcNo()
    {
        return acNo;
    }
    void setOwnerName()
   {
       System.out.println("enter owner name :");
       ownerName = in.nextLine();
   }
   
    String getOwnerName()
    {
        return ownerName;
    }
      void setBalance()
   {
       System.out.println("enter balance :");
       //balance = in.nextLine();
       balance = Integer.parseInt(in.nextLine());
   }
   
    int getBalance()
    {
        return balance;
                
        
    }
    
    /**
     *
     * @param amount
     * @return
     */
    public int deposit(int amount)
    {
     balance = balance + amount;
     return balance;
    }
    public int withdraw(int withdrawamount)
    {
        balance =balance-withdrawamount;
        return balance;
    }
    @Override
    public String toString()
    {
        String bankdetails = super.toString();
        String data = "account number :" + this.acNo + "\n" + "owner name :" + 
        this.ownerName + "\n" + "balance :" + this.balance;
        data = bankdetails+data;
        
        return data;
    }  

    void setData()
    {
        setId();
        setName();
     
    } 
    
    
}
