/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author Danny
 */
public class Main {

    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);
            
            System.out.println("Enter first number");
            number1 = input.nextDouble();
            
            System.out.println("Enter second number");
            number2 = input.nextDouble();
            
            switch (operator) {
                case '+' -> {
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                }
                case '-' -> {
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                }
                case '*' -> {
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                }
                
                case '/' -> {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                }
                
                default -> System.out.println("Invalid operator!");
            }
        }
    }
}
