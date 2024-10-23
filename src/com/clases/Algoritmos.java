package com.clases;

public class Algoritmos {

    // Método estático que verifica si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método estático que verifica si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método estático que invierte un string
    public static String stringEnReversa(String cadena) {
        String reversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reversa += cadena.charAt(i);
        }
        return reversa;
    }

    // Método estático que verifica si un string es un palíndromo
    public static boolean esPalindromo(String cadena) {
        String reversa = stringEnReversa(cadena);
        return cadena.equals(reversa);
    }

    // Método estático que genera la secuencia FizzBuzz
    public static void secuenciaFizzBuzz(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();  // Para saltar a la siguiente línea después de la secuencia
    }
}
