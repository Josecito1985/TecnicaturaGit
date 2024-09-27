/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número total de horas
        System.out.print("Ingrese el número total de horas: ");
        int totalHoras = scanner.nextInt();

        // Calcular el número de semanas, días y horas
        int semanas = totalHoras / (7 * 24);
        int horasRestantes = totalHoras % (7 * 24);
        int dias = horasRestantes / 24;
        int horas = horasRestantes % 24;

        // Mostrar el resultado
        System.out.println(totalHoras + " horas equivalen a:");
        System.out.println(semanas + " semanas");
        System.out.println(dias + " días");
        System.out.println(horas + " horas");
    }
}
