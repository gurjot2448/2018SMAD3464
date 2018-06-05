/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;
/*
 * 
 * @author SUKHCHAIN
 */
public class Activity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Bank1 bank = new Bank1();
        System.out.println(bank.toString());
        
        Bank1 bank1 = new Bank1("cse","ICIC");
        System.out.println(bank1.toString());  
        
        Bankaccount1 bankaccount = new Bankaccount1();
        System.out.println(bankaccount.toString());
       
        
        Bankaccount1 bankaccount1 = new Bankaccount1("ece","TD",225,"waheguru",100);
        System.out.println(bankaccount1.toString());
        
        int amount = 1000;
        int withdrawamount = 2000; 
        bankaccount1.deposit(amount);
        bankaccount1.withdraw(withdrawamount);
        
        
        
        OverdraftAccount overdraft = new OverdraftAccount();
        System.out.println(overdraft.toString());
        
        
        
        OverdraftAccount overdraft1= new OverdraftAccount("msc","ICIC",123,"waheguru",1000,1500);
        System.out.println(overdraft1.toString()); 
        overdraft1.withdraw();
    }
    
}
