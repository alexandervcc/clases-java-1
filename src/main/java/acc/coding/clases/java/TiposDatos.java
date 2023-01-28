/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acc.coding.clases.java;

/**
 *
 * @author alexa
 */
public class TiposDatos {

    public static void ejecutarTiposDatos() {
        //VARIABLES
        /* 
        - contenedor para almacenar informacion
        - sintaxis para ser usadas
            <tipo-dato> <nombre-variable> = <valor> ;
        - empezar con las mas sencillas: primitivas / Objectos(Programacion orientada objetos)
        - PRIMITIVA: tipo de dato mas sencillo que existen:
            - int: numeros enteros
            - float: numeros con decimales
            - char: caracteres
            - boolean: V/F
            - String(objeto): cadenas de caracteres
        - CUIDADO: no podemos tener 2 variables con el mismo nombre
         */
        //    <tipo-dato> <nombre-variable> = <valor> ;
        int var1 = -25;
        int var2 = 10000;
        int var3 = 10;
        int var4 = 25;
        float f1 = 2.2f;
        float f2 = 516f;
        boolean v = true;
        boolean f = false;
        String str1 = "Hola como estas?";
        char c1 = 'a';
        char c2 = 'b';

        //REUTILIZACION DE VARIABLES
        // - declarar una variable una sola vez
        int var10 = 10;
        //int var10 = 10;
        // - reasignar el valor de la variable (variable ya debe existir)
        // <nombre-variable> = <nuevo-valor>;
        System.out.println("var10: " + var10);
        var10 = -999;//cambiar el valor 10 -> -999
        System.out.println("var10: " + var10);

        //BYTE
        /*
        - unidades de medida para numero booleanos
        - booleano: representacion de 1 o 0
            -> 5 =  101
            -> 15 = 1111
            -> 1025 = 1000000001
        - utiliza booleanos de forma agrupada
        - 1byte = 8 booleanos
        - 1 byte = | _,_,_,_,_,_,_,_ | 
        - rango 1 byte = 00000000 -> 11111111 (0 - 255)
        - 2 bytes -> |00000000|00000000|
        - 3 bytes -> |00000000|00000000|00000000|
      
         */
        //PRIMITIVAS COMPLETAS
        /*
        - su primera letra es minuscula -> primitiva
        - son los datos mas pequenos
        - LISTA: byte, short, int, long, float, double, boolean, char
        - La razon de tener varias es por el que ocupa los datos en memoria:
        
        Representan numeros enteros
        - byte  -> 1 byte (-128 <-> +127)
        - short -> 2 bytes (-32700 <-> +32700)
        - int   -> 4 bytes
        - long  -> 8 bytes

        Representan numeros con comas decimales        
        - float -> 4 bytes
        - double-> 8 bytes
        
        Representaciones especiales
        - boolean -> 1bit = 0 | 1
        - char  -> 2 bytes: contiene una sola letra o simbolo en comilla ssimples
        
         */
        byte byte1 = 127;
        short short1 = 31333;
        int int1 = 56154531;
        long long1 = 565165156;

        float float1 = 5155445.2f;
        double double1 = 8898768465.5;
        
        char letra1 = 's';
        char letra2 = '2';
        char letra3 = '/';
        
        boolean bool1 = true;
        boolean bool2 = false;
        

        //CASTING
        /*
            - trata de asignar un tipo de dato a otro tipo de dato
            - existe una jerarquia en el casteo de datos
            - casteo: convertir un dato en otro tipo de dato
            - JERARQUIA:
            byte -> short -> char -> int -> long -> float -> double
         */
        double divisionInts = 25 / 2;
        double divisionDoubleInt = 25 / 2.0;
        double divisionDoubles = 25.0 / 2.0;

        System.out.println("Resultado division Ints: " + divisionInts);
        System.out.println("Resultado division DoubleInt: " + divisionDoubleInt);
        System.out.println("Resultado division Doubles: " + divisionDoubles);

    }
}
