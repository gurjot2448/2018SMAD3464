/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class helloworld {
    public static void main(String args[])
    {
        System.out.print("Hello World");
        //System.in
        //System.err
        int number = 10;
        float fnumber = 10.2f;
        double dnumber = 10.23455;
        short n1;
        long n2;
        
        number *= 10;
        System.out.println("number :" + number);
        
        number = 20;
        System.out.println("number : " + (number +10));
        System.out.println(10 + number +"number :");
        /*
       //number = number/0
       */
         char ch = 'a';//97
         System.out.println("ch :" + ch);
         System.out.println("ch :" + (char)(ch +1));//98-b
         
         ch++; //ch = ch+1
         System.out.println("ch:" +ch);//ch = b
         
         ch++;//ch = ch+1
         System.out.println("ch :" + ch);
         
         ch ='a';
         char anotherCh = ch++;
         System.out.println("ch :" + ch);
         System.out.println("anotherch :" + anotherCh );
         
         String name ="gk";
         System.out.println("name :" +name);
         
         boolean flag = false;
         System.out.println("flag :" +flag);
         
         if(!flag)
         { System.out.println("name :" +name);
         }
         else{
             System.out.println("name is missing");
         }
         
         char vowel = 'a';
         switch(vowel)
         {case  'a':
             System.out.println("given character is vowel");
             break;
         case  'e':
         System.out.println("given character is vowel");
         break;
         case  'i':
         System.out.println("given character is vowel");
         break;
         case  'o':
         System.out.println("given character is vowel");
         break;
         case  'u':
         System.out.println("given character is vowel");
         break;
         default:
             System.out.println("given character is not vowel");
             break;
         
            // String(province) = "ON";
            // switch(10-20)
             //{
             //}
             char vowel ='e';
              switch (vowel)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("given character is vowel");
                    break;
                default:
                    System.out.println("given character is not vowel");
                    break;
                
            }
             }
                     
         }
       
        
    
    }
    

