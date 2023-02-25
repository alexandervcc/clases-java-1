package acc.coding.clases.java;

/*
    REGLASE DE SINTAXIS 
    - linea es una sentencia -> orden o un comando
    - lineas de codigo deben finalizar con ;
    - se utiliza {} para anidar contenido
    - Java es de tipado estatico: toda variable debe tener su tipo variable
 */



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
        //imprimir en pantall
        /* System.out.println(1);
        System.out.println(10.25);
        System.out.println("Hola como estas?");
 */
        

        //Ejercicios con strings:
        //Strings.claseStrings();

        //Ejercicios con Math
        //MathClass.claseMathLibrary();
        
        //Ejervicios Condicionales
        //Condicionales.ejecutar();

        //Inputs
        //Inputs.ejecutar();

        //Bucle FOR
        //BuclesFor.ejecutar();

        //Bucle while
        BuclesWhile.ejecutar();
        //Bucle do while
    }
}
