/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author SUKHCHAIN
 */
public class Day7 {

    private static String str5;
    private static String str6;
    private static String str7;
    private static String str8;
    private static String str9;
    private static String str10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str1 ="Test string";
        String str2 = new String("java");
        
        
        System.out.println(str1);
        System.out.println(str2);
        
        String str3 = str1 + str2;
        System.out.println(str3);
        
        str3 = str2.concat(str1);
        System.out.println(str3);
        
        str3 = str2;
        System.out.println(str3);
        System.out.println(str2);
        
       // if(str2.equals(str3)){
       if(str2.equalsIgnoreCase(str3)){
            System.out.println("Equals");
        }else{
            System.out.println("not equals");
        
        }
           
       str2 = "test5";
       str3 = "test8";
       System.out.println("String 2 :" + str2);
       System.out.println("String 3 :" + str3);
               
       int cmp = str2.compareTo(str3);
       System.out.println("cmp :" + cmp);
       
       System.out.println("String 2 :" + str2.toUpperCase());
       
       System.out.println(" length of String 2 :" + str2.length());
       
       int a1[] = new int[3];
       
       int len = a1.length;
       
       str2 = "ABCDEFGHIJKLMNOPQRSTUVWX";
       
       for(int i = 0;i<str2.length();i+=2)
           
//i<=str2.length()-1
       {
           System.out.print((char)(str2.charAt(i)+1) + " " );
       }
       
       str2 = "Hello there!";
       System.out.println(str2.replace('l' , 'm'));
       
       
       
       str2 = "Hello java";
       System.out.println(str2.endsWith(str3));
       
       str3 = str2.substring(4);
       str3 = str2.substring(0,5);
    
       
       System.out.println("string :"+ str3);
       System.out.println("string 2 :"+ str2);
       
       int p = str2.indexOf('l');
       str2 = "Hallo java";
       //p = str2.indexOf('a',4);
        p = str2.indexOf("java");
       System.out.println("P :" + p);
       
       p= str2.lastIndexOf('a');
       System.out.println("p :" + p);
       
       str2 = "This is a test string";
       
       int wordCount = 1;
       for(int i = str2.length()-1;i>=0; i--)
       {
           System.out.print(str2.charAt(i));
           
         
           if(Character.isWhitespace(str2.charAt(i)))
           {
               wordCount++;
           }
       }
         System.out.println("\n word count :" + wordCount);      
       
       StringBuffer str4 = new StringBuffer("it feels like winter in summer");
       
       System.out.println("str4 :" + str4); 
       
       str4.append("TEST");
       
       System.out.println("str4 :" + str4);
       
       str4.setCharAt(3, '@');
       System.out.println("str4 :" + str4);
       
       str4.insert(5,"@#$");
       System.out.println("str4 :" + str4);
       
       str4.reverse();
       System.out.println("str4 :" + str4);
     

       str2  = "This is a test string";
       
       str5 = str2.substring(0, 5);
       
       System.out.println("String 3 :" + str5);

       str6 = str2.substring(5, 8);       
       
       System.out.println("String 3 :" + str6);
       
       
       str7 = str2.substring(8, 10);
       System.out.println("String 3 :" + str7);
       
       str8 = str2.substring(9, 15);
       System.out.println("String 3 :" + str8);
       
       str9 = str2.substring(15, 21);
       System.out.println("String 3 :" + str9);
       
        /*System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
       
        */

        
        str10 = str8.concat(str9);
        System.out.print(str9);
        
        str10 = str7.concat(str8);
        System.out.print(str8);
        
        str10 = str6.concat(str7);
        System.out.print(str7);
        
        str10 = str5.concat(str6);
        System.out.print(str6);
        
        str10 = str6.concat(str5);
        System.out.print(str5);
        
       /* str3 = str2;
        System.out.println(str3);
        System.out.println(str2);*/
    }
    
    
}
