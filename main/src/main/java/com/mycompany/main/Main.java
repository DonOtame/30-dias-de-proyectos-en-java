package com.mycompany.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] secret = getValidSecretArray();
        char[] guessedLetters = new char[secret.length];
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }

        int errors = 0;
        Scanner scanner = new Scanner(System.in);

        while (errors < 8 && !isWordGuessed(guessedLetters)) {
            System.out.println("\nPalabra: " + new String(guessedLetters));
            System.out.print("Ingrese un carácter (A-Z): ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                char guessedChar = input.charAt(0);

                if (isCharInSecret(guessedChar, secret)) {
                    System.out.println("¡Correcto! La letra está en la palabra.");
                    updateGuessedLetters(guessedChar, secret, guessedLetters);
                } else {
                    errors++;
                    System.out.println("Incorrecto. Intentos fallidos: " + errors + "/8");
                    drawHangman(errors);
                }
            } else {
                System.out.println("Entrada no válida. Ingrese un solo carácter.");
            }
        }

        if (isWordGuessed(guessedLetters)) {
            System.out.println("\n¡Felicidades! Has adivinado la palabra: " + new String(secret));
        } else {
            System.out.println("\nSe alcanzó el límite de errores. La palabra era: " + new String(secret));
        }
    }

    public static char[] getValidSecretArray() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Ingrese una palabra (máximo 20 caracteres, solo letras): ");
            input = scanner.nextLine().trim().toUpperCase();

            if (input.matches("[A-Z]{1,20}")) {
                return input.toCharArray();
            }
            System.out.println("Entrada no válida. Intente nuevamente.");
        }
    }

    public static boolean isCharInSecret(char c, char[] secret) {
        for (char ch : secret) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }

    public static void updateGuessedLetters(char guessedChar, char[] secret, char[] guessedLetters) {
        for (int i = 0; i < secret.length; i++) {
            if (secret[i] == guessedChar) {
                guessedLetters[i] = guessedChar;
            }
        }
    }

    public static boolean isWordGuessed(char[] guessedLetters) {
        for (char ch : guessedLetters) {
            if (ch == '_') {
                return false;
            }
        }
        return true;
    }

    public static void drawHangman(int errors) {
        switch (errors) {
            case 0 -> {
                System.out.println("\n  -----");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("-----|-----");
            }
            case 1 -> {
                System.out.println("\n  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("-----|-----");
            }
            case 2 -> {
                System.out.println("\n  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("-----|-----");
            }
            case 3 -> {
                System.out.println("\n  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |\\  |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("-----|-----");
            }
            case 4 -> {
                System.out.println("\n  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |\\  |");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("-----|-----");
            }
            case 5 -> {
                System.out.println("\n  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |\\  |");
                System.out.println("  |   |");
                System.out.println(" /    |");
                System.out.println("-----|-----");
            }
            case 6 -> {
                System.out.println("\n  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |\\  |");
                System.out.println("  |   |");
                System.out.println(" / \\  |");
                System.out.println("-----|-----");
            }
            case 7 -> {
                System.out.println("\n  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println("  |   |");
                System.out.println(" / \\  |");
                System.out.println("-----|-----");
            }
            case 8 -> {
                System.out.println("\n  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println("  |   |");
                System.out.println(" / \\  |");
                System.out.println("-----|-----");
            }
        }
    }

}
