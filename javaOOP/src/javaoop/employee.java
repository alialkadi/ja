/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoop;

/**
 *
 * @author alial
 */
public class employee {
   private  int empid;
   private String name;
   private String depart ;
   private double salary;
   private double bounce;
   private boolean residant;
   private static int nobject;
   
   public employee(int id,String nam){
       empid =id;
       name = nam;
       nobject++;
   }
   public employee(int id , String nam , boolean res){
       this(id,nam);
       residant = res;
       nobject++;
   }
   public employee(int id, String nam , String dep, double sa, double bou , boolean res){
       
       this(id,nam,res);
       depart = dep;
       salary =sa;
       bounce = bou;
       nobject++;
       
   }
   public employee(){
        empid = 10;
        name = "########";
        depart = "#########";
        salary=2000;
        bounce = salary* .25 ;
        residant = true;
        nobject++;
   }
   public void print_emp_data(){
       System.out.println("id  " + empid);
       System.out.println("name  " + name);
       System.out.println("idepart  " + depart);
       System.out.println("salary  " + salary);
       System.out.println("bounce  " + bounce);
       System.out.println("residant  " + residant);
       System.out.println("number of objects  " + nobject);
   }
   
   public void set_salary(double sa){
       salary= sa;
   }
   
   public void set_dep(String dep){
       depart =dep;
   }
   
   public void set_empid (int id){
       empid = id ;
   }
   
   public void set_salary(double sa, double bou){
       this.set_salary(sa);
       bounce = bou;
   }
}
