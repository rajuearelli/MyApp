package com.rj.javaCourse;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String args[]){
        System.out.println("Enter Numbers to Perform arithmetic Operations");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();

        System.out.println("Enter Second Number");
        int b=sc.nextInt();

        System.out.println("add Opration "+ (a+b));
        System.out.println("Multiplication Opration "+ (a*b));
        System.out.println("Division Opration "+ (a/b));
        System.out.println("Modulas Opration "+ (a%b));
    }
}
