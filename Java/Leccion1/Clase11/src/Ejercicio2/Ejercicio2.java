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

        // Pedir al usuario el monto de la compra
        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        // Definir el descuento
        double descuento = 0.20;

        // Calcular la cantidad a pagar
        double cantidadAPagar;

        if (montoCompra > 100) {
            cantidadAPagar = montoCompra * (1 - descuento);
        } 
        else {
            cantidadAPagar = montoCompra;
        }

        // Mostrar la cantidad a pagar
        System.out.println("La cantidad a pagar es: $" + cantidadAPagar);

    }
}
