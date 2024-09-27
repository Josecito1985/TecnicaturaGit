/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor de a
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        // Pedir al usuario que ingrese el valor de b
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        // Calcular (a + b)^2 usando la fórmula a^2 + b^2 + 2ab
        double aCuadrado = Math.pow(a, 2);
        double bCuadrado = Math.pow(b, 2);
        double dosAb = 2 * a * b;
        double resultado = aCuadrado + bCuadrado + dosAb;

        // Mostrar el resultado
        System.out.println("El resultado de (a + b)^2 es: " + resultado);
    }
}
