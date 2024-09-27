/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leccion2;

import java.util.Scanner;

public class Leccion2 {
    public static void main(String[] args) {
        /*var condicion = true;
        if(condicion){
            System.out.println("condicion verdadera"); // condicional simple
        }
        else{
            System.out.println("Condicion Falsa"); // Condicional doble 
        } */
        
        // 10 Ejercicio con la estrucututa if else
        //var numero = 4;
        //var numeroTexto = "Numero desconocido";
        //if(numero == 1){
         //   numeroTexto = "Numero uno";
        //}
        //else if(numero == 2){
        //    numeroTexto = "Numero dos";
        //}
        //else if(numero == 3){
        //    numeroTexto = "Numero tres";
        //}
        //else if(numero == 4){
        //   numeroTexto = "Numero cuatro";
        //}
        //else{
        //    numeroTexto = "Numero no encontrado";
        //}
        //System.out.println("numeroTexto = " + numeroTexto);
        
        // 10.4 Sentencia de Control Switch
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero del 1 al 4");
        var numero = Integer.parseInt(entrada.nextLine());
       
        var numeroTexto = "Valor desconocido";
        switch(numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
    
}
