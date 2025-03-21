package com.pynx.util;

import java.util.Scanner;

/*
Program to compute a product
of two numbers given two
numbers from user input
of type int
 */
public class ProductTwoNumbers {

    public static void main(String[] args){
        //ask user input for 1st number
        System.out.print("Enter 1st number: ");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();

        // ask for 2nd number
        System.out.print("Enter 2nd number: ");
        int num2 = s.nextInt();

        // get the product
        int result = new ProductTwoNumbers().getProduct(
                num1,num2
        );

        // print the result
        System.out.print(num1 +"*"+num2+" = "
            +result);

        s.close();

    }
    public int getProduct(int num1,int num2){
        return num1*num2;
    }
}
