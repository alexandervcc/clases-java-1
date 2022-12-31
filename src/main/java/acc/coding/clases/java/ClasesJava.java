package acc.coding.clases.java;

//Clase principal desde donde se ejecuta el codigo.
// -> clase principal tiene un metodo(funcion) especial llamado 'main'
//Clases: palabra reservada 'class'
public class ClasesJava {

    int xd = 0;//declarar una variable y asignar 0

    public static void main(String[] args) {
        //Comentarios
        // utilizar //escribes comentarios
        // utilizar /* .... */

        //Impresion de datos:
        // -> Sentencia/comando especila:  System.out.println();
        System.out.println(1);//imprimir en pantall
        System.out.println(10.25);
        System.out.println("Hola como estas?");

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

        //OPERADORES ARIMETICOS
        // - operaciones matematicas: +,-,*,/,%
        //SINTAXIS: <valor1> <operacion> <valor2>;
        int num1 = 10;
        int num2 = 20;
        int sum1 = num1 + num2;
        int sum2 = num2 + num1;
        int sum3 = 999 + 25;
        int sum4 = num1 + 10000;
        int res = sum1 - 100000;
        int mul = sum2 * 33;
        int div = 25/2;

        System.out.println("res: "+res);
        System.out.println("mul: "+mul);
        System.out.println("div: "+div);
        
        System.out.println("sum: " + sum1);
        System.out.println("sum: " + sum2);
        System.out.println("sum: " + sum3);
        System.out.println("sum: " + sum4);

        //REUTILIZACION DE VARIABLES
        // - declarar una variable una sola vez
        int var10 = 10;
        //int var10 = 10;
        // - reasignar el valor de la variable (variable ya debe existir)
        // <nombre-variable> = <nuevo-valor>;
        System.out.println("var10: "+var10);
        var10 = -999;//cambiar el valor 10 -> -999
        System.out.println("var10: "+var10);
        
    }
}

/*
    REGLASE DE SINTAXIS 
    - linea es una sentencia -> orden o un comando
    - lineas de codigo deben finalizar con ;
    - se utiliza {} para anidar contenido
    - Java es de tipado estatico: toda variable debe tener su tipo variable
 */
