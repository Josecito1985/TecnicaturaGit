/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;


public class Clase3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pedir al usuario que ingrese la calificación de participación
        System.out.print("Ingrese la calificación de participación (10%): ");
        double participacion = entrada.nextDouble();

        // Pedir al usuario que ingrese la calificación del primer examen parcial
        System.out.print("Ingrese la calificación del primer examen parcial (25%): ");
        double primerParcial = entrada.nextDouble();

        // Pedir al usuario que ingrese la calificación del segundo examen parcial
        System.out.print("Ingrese la calificación del segundo examen parcial (25%): ");
        double segundoParcial = entrada.nextDouble();

        // Pedir al usuario que ingrese la calificación del examen final
        System.out.print("Ingrese la calificación del examen final (40%): ");
        double examenFinal = entrada.nextDouble();

        // Calcular la calificación final usando las ponderaciones
        double calificacionFinal = (participacion * 0.10) + 
                                   (primerParcial * 0.25) + 
                                   (segundoParcial * 0.25) + 
                                   (examenFinal * 0.40);

        // Mostrar la calificación final
        System.out.println("La calificación final es: " + calificacionFinal);

    }
}
