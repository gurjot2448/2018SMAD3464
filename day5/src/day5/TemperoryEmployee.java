/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author SUKHCHAIN
 */
public class TemperoryEmployee extends Employee
{
  String designation;
float hourlyRate;  
    

TemperoryEmployee()
{
super();
this.designation ="Unassigned";
this.hourlyRate = 0.0f;
}
TemperoryEmployee(String name,String address,String phoneNo,int age,
char gender,String empId,int dept,String joiningDate,String designation,float hourlyRate)

/*{Super(name,address,phoneNo,age,gender,empId,dept,joiningDate)*/
{     
this.designation = designation;
this.hourlyRate = hourlyRate;
}

//method overridding
public String toString()
{
return(super.toString()+
"\nDesignation :" + this.designation + 
"\nhourlyRate :" + this.hourlyRate);
}
}