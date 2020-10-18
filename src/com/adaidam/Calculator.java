package com.adaidam;

import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {
        System.out.println("Welcome to the Dream Corps Calculator!");

        Scanner dreamCorpsCalc = new Scanner(System.in);

        System.out.println("Please choose an operator: +, -, *, /, ^, !");
        char operator = dreamCorpsCalc.next().charAt(0);

        System.out.println("Input your first number");
        int num1 = dreamCorpsCalc.nextInt();

        System.out.println("Input your second number");
        int num2 = dreamCorpsCalc.nextInt();

        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println(result);

        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println(result);

        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println(result);

        } else if (operator == '/' && num2 != 0) {
            result = num1 / num2;
            System.out.println(result);

        } else if (operator == '^') {
            result = num1 ^ num2;
            System.out.println(result);

        } else if (operator == '!'){
            int i, fact=1;
            //int num2 = null;
            for (i = 1; i <= num1; i++) {
                fact=fact*i;
                result = fact;
            }
            System.out.println(result);
        }
    }
}

