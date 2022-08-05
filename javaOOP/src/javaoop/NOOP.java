/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoop;

/**
 *
 * @author alial
 */
public class NOOP {
    private double length;
    private double width;
    
    
    public NOOP(NOOP obj){
        length = obj.length;
        width = obj.width;
    }
    public NOOP(){
        length =10;
        width = 20;
        System.out.println("to know the width and width call getter methods ");
    }
    
    public NOOP (double ll, double ww){
        length = ll;
        width = ww;
    }
    public void setlength (double l){
       if (l>0){
        length = l;
    }else{
           System.out.println("enter valid number");
       }
    }
    public void setwidth(double w){
         width= w;
    }
    
    public double getlength(){
        return length;
    }
    
    public double getwidth(){
        return width;
    }
    
    public double area(){
         return  width*length;
    }
    
    public NOOP add( NOOP s2){
        NOOP res =new NOOP();
        res.length = this.length  + s2.length;
        res.width = this.width + s2.width;
        return res;
    }
    
    public boolean isequal(NOOP obj){
        if (this.length == obj.length && this.width==obj.width)
            return true;
        else
            return false;
    }
}
