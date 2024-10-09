/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CicloWhile;

/**
 *
 * @author Jose
 */
public class EjercicioWhile01 {
    public static void main(String[] args) {
        var conteo = 0;
        while(conteo <7){
            System.out.println("conteo = " + conteo);
            conteo++;
        }
        
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 7);
        
        
        for(var contando = 0 ; contando < 7 ; contando++ ){
            System.out.println("contando = " + contando);
        }
    }
}
