/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;

import java.util.Scanner;

/**
 *
 * @author SUKHCHAIN
 */
public class Bank1  
{
     String id;
   String name;
   Scanner in = new Scanner(System.in);
   
   //default constructor
   Bank1()
   {
       this.id = id;
       this.name = name;
   }
   
   
   //parameterized constructor
   
   Bank1(String id,String name)
   {
       this.id = id;
       this.name = name;
       
   }
   
   void setId()
   {
       System.out.println("enter id :");
       id = in.nextLine();
   }
   
    String getId()
    {
        return id;
    }
    void setName()
   {
       System.out.println("enter name :");
       name = in.nextLine();
   }
   
    String getName()
    {
        return name;
    }
    
     @Override
    public String toString()
    {
        String data;
        data = "id :" + id + "\n" + "name :" + name + "\n";
        return data;
        
    }
    
    void setData()
    {
        setId();
        setName();
    } 
}
