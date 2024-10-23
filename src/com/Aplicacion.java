package com;

import com.clases.Algoritmos;

public class Aplicacion {

    public static void main(String[] args) {
        // Probar el método esPar()
        System.out.println("¿Es 4 par?: " + Algoritmos.esPar(4));
        System.out.println("¿Es 7 par?: " + Algoritmos.esPar(7));

        // Probar el método esPrimo()
        System.out.println("¿Es 7 primo?: " + Algoritmos.esPrimo(7));
        System.out.println("¿Es 9 primo?: " + Algoritmos.esPrimo(9));

        // Probar el método stringEnReversa()
        String texto = "Java";
        System.out.println("Reversa de " + texto + ": " + Algoritmos.stringEnReversa(texto));

        // Probar el método esPalindromo()
        String palabra = "anilina";
        System.out.println("¿Es 'anilina' un palíndromo?: " + Algoritmos.esPalindromo(palabra));
        String palabra2 = "hola";
        System.out.println("¿Es 'hola' un palíndromo?: " + Algoritmos.esPalindromo(palabra2));

        // Probar el método secuenciaFizzBuzz()
        System.out.println("Secuencia FizzBuzz para 15:");
        Algoritmos.secuenciaFizzBuzz(15);
    }
}