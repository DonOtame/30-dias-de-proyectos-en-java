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
        Scanner scanner = new Scanner(System.in);

        int KM;
        int CM;
        int Y;
        int op;
        double RES;

        System.out.println("Ingrese la operacion");
        System.out.println("1.- Centimetos a pulgadas");
        System.out.println("2.- Yardas a metros");
        System.out.println("3.- Kilometros a millas");
        System.out.println("\n");
        op = scanner.nextInt();

        switch (op) {
            case 1 -> {
                System.out.println("Centimetros a pulgadas");
                System.out.println("Ingrese los centimetros");
                CM = scanner.nextInt();
                RES = CM * 2.3;
                System.out.println("El resultado es: " + RES + " pulgadas");
            }
            case 2 -> {
                System.out.println("Yardas a Metros");
                System.out.println("Ingrese el numero de Yardas");
                Y = scanner.nextInt();
                RES = Y * 0.914401829;
                System.out.println("El resultado es: " + RES + " metros");
            }
            case 3 -> {
                System.out.println("Kilometros a Millas");
                System.out.println("Ingrese el numero de Kilometros");
                KM = scanner.nextInt();
                RES = KM * 0.621;
                System.out.println("El resultado es: " + RES + " millas");
            }

        }
    }
}
