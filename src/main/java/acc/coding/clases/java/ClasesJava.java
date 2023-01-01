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
        int div = 25 / 2;

        System.out.println("res: " + res);
        System.out.println("mul: " + mul);
        System.out.println("div: " + div);

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
        - char  -> 2 bytes
        
         */
        byte byte1 = 127;
        short short1 = 31333;
        int int1 = 56154531;
        long long1 = 565165156;

        float float1 = 5155445.2f;
        double double1 = 8898768465.5;

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

        //OPERACIONES UNARIAS
        /*
            - operacion aritmetica con un solo valor
            - no requieres de dos valores para generar la operacion
         */
        int unario = 100;
        System.out.println("Unario 1:" + unario);
        //incremento: ++ => incrementar en 1
        unario++;
        unario++;
        unario++;
        unario++;
        unario++;
        System.out.println("Unario 2:" + unario);

        //decremento
        unario--;
        System.out.println("Unario 3:" + unario);

        //OPERADORES DE ASIGNACION ARITMETICA
        /*
        - son operaciones aritmeticas (+,-,*,/,%)
        - SINTAXIS: <variable-con-valor> <simbolo-operacion>= <valor-de-operacion>
         */
        int op1 = 10;
        System.out.println("Asignacion Aritmetica 1:" + op1);
        op1 = op1 + 100;
        System.out.println("Asignacion Aritmetica 1:" + op1);

        int op2 = 10;
        System.out.println("Asignacion Aritmetica 2:" + op2);
        //asignacion aritmetica
        op2 += 100;
        System.out.println("Asignacion Aritmetica 2:" + op2);

        op2 -= 25;//op2 = op2 - 25;
        System.out.println("Asignacion Aritmetica - :" + op2);
        op2 /= 5;//op2 = op2 / 5;
        System.out.println("Asignacion Aritmetica / :" + op2);
        op2 *= 3;//op2 = op2 * 3;
        System.out.println("Asignacion Aritmetica * :" + op2);

        //OPERADORES LOGICOS
        /*
        - comparaciones que devuelve un resultado booleano(V,F)
        - primitivas
        - procesos de toma de desicion
        -SINTAXIS: 
        
        ( <valor1> <comparador> <valor2>  ){ 
            <hacer si la comparacion es verdadera> 
        }
        
        - ejemplo: edad es mayor 18: edad vs 18
            - V: 'es mayor de edad'
            - F: 'es menor de edad'
        - siempre devuelven un boolean 
        
        - cuales son los COMPARADORES LOGICOS?
            - si es igual:          ==
            - no son iguales:       !=
            - es mayor que:         >
            - es menor que:         <
            - es mayor o igual:     >=
            - es menor o igual:     <=
        
        - OPERADORES LOGICOS:
            - te permiten concatenar condiciones
            - && : y
            - || : o
            - !  : negacion
            -Ejemplo: (es mayor 18) && (es hombre)
                -c1:    25 && M -> V && V -> V
                -c2:    14 && M -> F && V -> F
         */
        int edad = 24;
        if (edad > 18) {
            System.out.println("Es mayor a 18");
        }
        if (edad == 24) {
            System.out.println("Edad igual a 24");
        }
        if (edad < 65) {
            System.out.println("Edad menor a 65");
        }
        if (edad != 100) {
            System.out.println("Edad es diferente de 100");
        }
        if (edad <= 24) {
            System.out.println("Edad es menor o igual a 24");
        }
        
        boolean resultado = edad > 18;
        resultado = edad <= 24;
        resultado = edad != 100;
        resultado = edad < 65;
        resultado = edad == 24;
        
    }
}

/*
    REGLASE DE SINTAXIS 
    - linea es una sentencia -> orden o un comando
    - lineas de codigo deben finalizar con ;
    - se utiliza {} para anidar contenido
    - Java es de tipado estatico: toda variable debe tener su tipo variable
 */
