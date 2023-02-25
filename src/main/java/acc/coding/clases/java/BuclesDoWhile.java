package acc.coding.clases.java;

import java.util.Scanner;

public class BuclesDoWhile {
    
    public static void ejecutar(){
    /*
     * DO WHILE
      - caracteristicas similares del while
      - Al igual que el for es una comando para realizar repeticiones
            - a diferencia del for no tiene un principio y fin de forma explicita
            - damos: una condicion de repeticion
                - mientras la condicion es verdadera se ejecutara
                - cuando sea falsa se dejara de ejecutar

            - DIFERENCIA CON EL WHILE:
                - aunque la condicion sea falsa desde el principio se asegura de ejectuar
                  al menos una vez el codigo

            - una vez la condicion(es) dan una valor de falso el while se rompe
                - deja de ejecutarse las iteraciones, y se ejecuta lo que le sigue
            SINTAXIS:
            condiciones: pueden ser una o mas, y concatenadas con operadores logicos
                : || && !

            do {
                //codigo a ejecutarse en cada repeticion
            }  while ( <condicion1 > && <condicion 2> || <condicion 3> );
     */

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero inicial: ");
        int inicio = in.nextInt();
        System.out.println("Ingrese el numero final: ");
        int fin = in.nextInt();
        
        //UTILIZAR: operadores de comparacion: >, <, >=, <=, ==, !=
        do {
            System.out.println("Valor actual: "+ inicio);
            inicio++;
        } while(  inicio < fin  );
        
        System.out.println("Valor final de variable 'inicio': "+ inicio);
    }
}
