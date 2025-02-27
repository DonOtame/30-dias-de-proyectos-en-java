/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Danny
 */
public class Main {

    public static void main(String[] args) {

        int magicNumber = ThreadLocalRandom.current().nextInt(1, 100);
        int userNumber;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Intenta adivinar el número que he pensado. Ingresa tu propuesta: ");
            userNumber = scanner.nextInt();
            if (magicNumber > userNumber) {
                System.out.println("El número que he pensado es mayor que el introducido");
            } else if (magicNumber < userNumber) {
                System.out.println("El número que he pensado es menor que el introducido");
            }
        } while (magicNumber != userNumber);

        System.out.println("Has acertado, el número que pensé fue: " + magicNumber);

    }
}
