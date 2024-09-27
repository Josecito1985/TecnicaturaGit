/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
// Determinar si un alumno aprueba o reprueba un curso, sabiendo que:
//aprobará si su promedio de tres calificaciones es mayor o igual a 70

import java.util.Scanner;

//reprueba caso contrario.

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        
        // Pedir al usuario las tres calificaciones
        System.out.print("Ingrese la primera calificación: ");
        double calificacion1 = entrada.nextDouble();
        
        System.out.print("Ingrese la segunda calificación: ");
        double calificacion2 = entrada.nextDouble();
        
        System.out.print("Ingrese la tercera calificación: ");
        double calificacion3 = entrada.nextDouble();
        
        // Calcular el promedio de las tres calificaciones
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        
        // Determinar si el alumno aprueba o reprueba
        if(promedio >= 7){
            System.out.println("El alumno aprueba con un promedio de " + promedio);
        } 
        else{
            System.out.println("El alumno reprueba con un promedio de " + promedio);
        }
        
    }
    
}
