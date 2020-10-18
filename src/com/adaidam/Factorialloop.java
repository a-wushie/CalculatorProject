package com.adaidam;
import java.util.Scanner;

public class Factorialloop {


    public static void main(String[] args) {


        Scanner dreamCorpsCalc = new Scanner(System.in);
        char operator = dreamCorpsCalc.next().charAt(0);
        int num1 = dreamCorpsCalc.nextInt();
        int result = 0;

        if (operator == '!') {
            int i,fact=1;
            for (i = 1; i <= num1; i++) {
                fact=fact*i;
                result = fact;
            }
            System.out.println(result);
        }
    }
}