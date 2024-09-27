/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
         // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        // Pedir al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Variable para almacenar el resultado
        double resultado;

        // Comparar los dos números y realizar la operación correspondiente
        if (numero1 == numero2) {
            resultado = numero1 * numero2;
            System.out.println("Los números son iguales. El resultado de la multiplicación es: " + resultado);
        } 
        else if (numero1 > numero2) {
            resultado = numero1 - numero2;
            System.out.println("El primer número es mayor que el segundo. El resultado de la resta es: " + resultado);
        } 
        else {
            resultado = numero1 + numero2;
            System.out.println("El primer número es menor que el segundo. El resultado de la suma es: " + resultado);
        }

    }
}
