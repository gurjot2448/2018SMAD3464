/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author SUKHCHAIN
 */
public class Day4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Person ishav = new Person();
        System.out.println(ishav.toString());
        
        Person alay = new Person("Alay","USA","123456",'M',23);
        System.out.println(alay.toString());
        
        Person alay2 = new Person(alay);
        System.out.println(alay2.toString());
    
        Employee emp1 = new Employee();
        emp1.name = "Mandeep";
        emp1.address = "IND";
        emp1.phoneNo = "2222";
        emp1.age = 25;
        emp1.gender = 'F';
        emp1.empId = "F101";
        emp1.dept = 20;
        emp1.joiningDate = "01 june 2013";
        
        System.out.println(emp1.toString());
        
        Employee emp2 = new Employee("Shivam","Gujarat","988676",23,'M',"P123"ss,30,"13 May2017");
        System.out.println(emp2.toString());
    }
    
}
