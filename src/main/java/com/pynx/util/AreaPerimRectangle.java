package com.pynx.util;

import java.util.Scanner;

/*
Program to compute the
area and perimeter of a rectangle
give the length and width
as user input
 */
public class AreaPerimRectangle {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        //get the length
        System.out.print("Enter the length:");
        double length = s.nextDouble();

        //get the width
        System.out.print("Enter the width:");
        double width = s.nextDouble();


        // compute and display perimeter and area
        AreaPerimRectangle util = new AreaPerimRectangle();
        System.out.println("Perimeter:"+util.computePerimeter(
                length,width
        ));
        System.out.println("Area:"+util.computeArea(
                length,width
        ));
    }
    public double computePerimeter(double length,
                                   double width){
        return 2*length*width;
    }
    public double computeArea(double length,
                                   double width){
        return length*width;
    }

}
