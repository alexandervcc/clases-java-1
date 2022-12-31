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
        
    }
}

/*
    REGLASE DE SINTAXIS 
    - linea es una sentencia -> orden o un comando
    - lineas de codigo deben finalizar con ;
    - se utiliza {} para anidar contenido
    - Java es de tipado estatico: toda variable debe tener su tipo variable
 */
