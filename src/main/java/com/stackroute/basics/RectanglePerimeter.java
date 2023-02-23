package com.stackroute.basics;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
//...
        new RectanglePerimeter().getValues();
    
    }

    //get user input from console
    public void getValues() {

    	Scanner sc=new Scanner(System.in);
    	
  double length=sc.nextDouble();
  double breadth=sc.nextDouble();
     	
  double result= perimeterCalculator(length, breadth);
    System.out.println(result);
    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        return (double)( 2*(length+ breadth));
    }
}
