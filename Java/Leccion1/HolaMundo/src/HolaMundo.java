
import java.util.Scanner;


public class HolaMundo {

    public static void main(String arg[]) {
        /*System.out.println("Hola Mundo en Java");

        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println("miVariableCadena");
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);

        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var a = 8;
        var b = 4;
        System.out.println(a + b);
        System.out.println(usuario + a + b);
        System.out.println(usuario + (a + b));
        
        //Caracteres Especiales
        var nombre = "Natalia";
        System.out.println(nombre);
        System.out.println("Nueva linea: \n" + nombre);//Diagonal inversa y letran
        System.out.println("Tabulador: \t" + nombre); //Tabulador un espacio para centrar
        System.out.println("\t.:MENU:.");
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comillas Simples: \'"+nombre+"\'");
        System.out.println("Comillas dobles: \""+nombre+"\"");
        
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);*/
        
        /*
        byte numEnteroByte = (byte)127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte:"+ Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte:"+ Byte.MAX_VALUE);
        
        short numEnteroShort = 10;
        System.out.println("numEnteroByte = " + numEnteroShort);
        System.out.println("Valor minimo del Short:"+ Short.MIN_VALUE);
        System.out.println("Valor maximo del Short:"+ Short.MAX_VALUE);
        
        int numEnteroInt = 127;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Int:"+ Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int:"+ Integer.MAX_VALUE);
        
        long numEnteroLong = 127;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long:"+ Long.MIN_VALUE);
        System.out.println("Valor maximo del long:"+ Long.MAX_VALUE);
        
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo del float:"+ Float.MIN_VALUE);
        System.out.println("Valor maximo del float:"+ Float.MAX_VALUE);
        
        double numDouble = 10;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo del double:"+ Double.MIN_VALUE);
        System.out.println("Valor maximo del double:"+ Double.MAX_VALUE); */
        
        //Clase 5 Inferencia de tipos var y tipos primitivos
        /*var numEntero= 20; //Las literales sin puntos automaticamente son del tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F;//Automaticamente con el punto decimal se transforma en double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble); */
        
        //Clase 5 Tipos primitivos tipo char
        /*char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        char varCaracter = '\u0024'; //indicamos a Java la asignacion con codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; // Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //Un caracter especial
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        */
        
        /* var varCaracter1 = '\u0024'; //indicamos a Java la asignacion con codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36; // Valor entero y le asigna un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; //Un caracter especial
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar); */
        
        // Tipos primitivos tipos booleanos
        /*boolean varBool = false;
        System.out.println("varBool = " + varBool);
        
        if(varBool){
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
        
        //Algoritmo: Es mayor de edad
        var edad = 18; // Literal tener presente la diferencia de tipo
        //var adulto = edad >= 18; // Esta es una expresion booleana
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        } */
        //Conversion de tipos primitivos
        /*var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);*/
        
        //Pedir un valor
        /*var entrada = new Scanner(System.in);
        /*System.out.println("Digite su edad: ");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad);*/
        
        //Conversion de tipos primitivos en Java parte 2
        /*var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(12);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(7);
        System.out.println("fraseChar = " + fraseChar);*/
        
        //EJERCICIO 7.1 - CLASE 7 - Operadores aritmeticos
        /*
        int num1= 5;
        int num2= 6;
        //operacion suma
        var suma = num1 + num2;
        System.out.println("resultado suma = " + suma);
        //operacion resta
        var resta = num2 - num1;
        System.out.println("resultado resta = " + resta);
        //operacion division
        var division = num2 / num1;
        System.out.println("resultado división = " + division);
        //operacion multiplicacion
        var multiplicacion = num1 * num2;
        System.out.println("resultado multiplicacion = " + multiplicacion);
        //operacion modulo o residual
        var modulo = num2 % num1;
        System.out.println("resultado del modulo = " + modulo);
        
        //Clase 7 - Ejercicio 7.2 Operadores de Asignacion
        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3" + varNum3);
        
        varNum1 +=1;
        System.out.println("varNum1 = " + varNum1);
        
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        
        varNum1 *=5;
        System.out.println("varnum1 = " + varNum1);
        
        varNum3 /=4;
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);
        
        //EJERCICIO 8.1 de clase 8 Operadores Unarios
        //Operadores Unarios: cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);//el resultado sera un numero negativo
        
        //operador de negacion
        var varC = true; // esta literal por default en Java es tipo boleana
        var varD = !varC; //invertimos el valor
        
        //Operadores Unarios de Incremento: preincremento
        var varE = 9; //se va a modificar su valor
        var varF = ++varE; //Simbolo antes de la variable
                //primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE);//se incrementa en la unidad
        System.out.println("varF = "+ varF);//va a sumar uno
        
       //Postincremento (el simbolo va despues dela variable)
        var varG=3;
        var varH=varG++;//primero el valor de la variable luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);//la variable ya esta con decremento
        System.out.println("varJ = " + varJ);
        
        //postdecremento
        var varK=8;
        var varL= varK--;//primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK); //Aqui va a decrementar en 1
        System.out.println("varL = " + varL);
        
         //EJERCICIO 8.2, 8.3 y 8.4 de Clase 8 
        // operador de Igualdad, relacionales y condicionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum==bNum);
        System.out.println("cNum = " + cNum);
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA= "hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        
        var fVar= cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        //ahora vemos relacionales
        var gVar = aNum != bNum; // >< >= <= == !=
        System.out.println("gVar = " + gVar );
        
        if (aNum % 2 == 0 ){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
        
        var age = 15;
        var adulto = 18;
        if(age >= adulto){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("es menor de edad");
        }
        
         //Un ejemplo de un operador and dentro de un condicional
        var valorA = 7;
        var valorMinimo= 0;//rango del 0 al 10
        var valorMaximo= 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        if(respuesta){
            System.out.println("esta dentro del rango establecido");
        }else{
            System.out.println("esta fuera del rango establecido");
        }
        
         //un ejemplo con operador OR dentro de una estructura condicional
        var vacaciones = false;
        var diaLibre = true;
        if(vacaciones || diaLibre){
            System.out.println("papa puede asistir al juego de su hijo");
        }else{
            System.out.println("papa no puede asistir al juego de su hijo");
        }
        
        //Operador Ternario, sirve para simplificar la estructura condicional IF
        //se recomienda utilizar cuando la complejidad condicional no sea compleja
        var resultadoT = (5>8) ? "verdadero" : "falso"; // esta estructura se evalua de la siguiente manera
        //Si dada una condicion entre () entonces sera ? primer argumento sino con : sera segundo argumento
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 4;
        resultadoT =(numeroT % 2 == 0) ? "es par" : "es impar";
        System.out.println("resultadoT = " + resultadoT); */
        
        //Clase 8.6 Prioridad de los operadores
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 9
        System.out.println("z = " + z); // 16
        
        var solucionAritmetica = 4 + 5 * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4+5) * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);
      
                
    }
}
