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
public class Employee extends person_1

{
  String empId;
  int dept;
  String joiningDate;
  Employee()
   {        
            super();
            this.empId ="temp";
            this.dept = 0;
            this.joiningDate = "not started yet";
    }
  Employee(String name,String address,String phoneNo,int age,char gender,String empId,int dept,String joiningDate)
  {
      super(name,address,phoneNo,gender,age);    
      this.empId = empId;
      this.dept = dept;
      this.joiningDate = joiningDate;
  }
  //method overriding
  @Override
  public String toString()
  {
      String personalDetails = super.toString();
      String data = "Employee id :" + this.empId + "\n" +"Department :" + this.dept + "\n" + " joining date :" + this.joiningDate ;
     data = personalDetails+data;
      return data;
  }
  
}
    

