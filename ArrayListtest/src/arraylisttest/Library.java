/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttest;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author SUKHCHAIN
 */
public class Library {
    public static void main(String args[])
    {
      ArrayList<String>bookId =  new ArrayList<String>();
        
        bookId.add("B001");
        bookId.add("B002");
                
         for(String str1 : bookId)
       {
           System.out.println(str1);
       }
         
                
                
                
                
                
       if(bookId.contains("B005"))
       {
           System.out.println("we have  a book");
           bookId.remove("B005");
           
       }else{
           System.out.println("book unavailable");
       }
       
       for(String str1 : bookId)
       {
           System.out.println(str1);
       }
       
       ArrayList<Books>Library =  new ArrayList<Books> (); 
       Books book1 = new Books(1,"java",2);
       Books book2 = new Books(2,"Android",5);
       Books book3 = new Books(3,"Swift",7);
       Books book4 = new Books(4,"ios",4);
       
       
       Library.add(book1);
       Library.add(book2);
       Library.add(book3);
       Library.add(book4);
       
       Library.add(2,new Books(10,"Database",9));
       
       for(Books book : Library)
       {
           book.displayInfo();
       }
       
       System.out.println("Number of blocks in the library :" + Library.size());
       
      if(Library.contains(book4))
       {
          
           Library.remove(book4);
           
       } 
      
      System.out.println("Number of blocks in the library :" + Library.size());
       
      
       
       Collections.sort(Library , new bookTitleComparator());
       for(Books bk : Library)
       {
           bk.displayInfo();
       }
    } 
}
