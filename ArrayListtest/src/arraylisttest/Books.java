/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttest;

import java.util.Comparator;
/**
 *
 * @author SUKHCHAIN
 */
public class Books {
     int bookId;
    String bookTitle;
    int bookRating;
    
    Books()
    {
        this.bookId =0;
        this.bookTitle = "Unknown";
        this.bookRating = 0;
        
    }
    
    Books(int bookId, String bookTitle, int bookRating)
    {
        this.bookId =bookId;
        this.bookTitle = bookTitle;
        this.bookRating = bookRating;  
    }
    
    void setBookId(int id)
    {
        this.bookId = id;
        
    }
    
   int getBookId()
   {
       return this.bookId;
   }
    
   void setBookTitle(String title)
    {
        this.bookTitle = title;
        
    }
    
   String getBookTitle()
   {
       return this.bookTitle;
   }

    void setBookRating(int rate)
    {
        this.bookRating= rate;
        
    }
    
   int getBookRating()
   {
       return this.bookRating;
   }

   void displayInfo()
   {
       System.out.println("BookId :" + this.bookId + "\n Book Title :" +
               this.bookTitle + "\n Book Rating :" + this.bookRating);
   }
   
   
}

class bookTitleComparator implements Comparator<Books>
   {
       @Override
       public int compare (Books o1,Books o2)
       {
           return o1.bookTitle.compareToIgnoreCase(o2.bookTitle);
       }
       
       
   }
