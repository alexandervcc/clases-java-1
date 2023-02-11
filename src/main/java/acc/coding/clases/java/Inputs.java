package acc.coding.clases.java;

import java.util.Scanner;

public class Inputs {
    public static void ejecutar() {
        // Output
        System.out.print("hola como estas?\n\n");
        // Input: valor que tu le das al programa, para que trabaje con este
        // necesitar utilizar una variable tipo Scanner

        Scanner inputs = new Scanner(System.in);

        // ingresar valores al programa, mientras este se ejecutando
        // el valor de la variable lo ingresaremos mientras el codiugo se ejecuta
        /*
            Diferentes tipos de datos, y el scanner acepta varios de ellos:
                - nextInt(): int
                - nextDouble(): double
                - next(): string
                - nextFloat(): float
                - nextByte(): byte
         */

        //REcibir inputs de dos formas
        //1. tener la variable previamente declarada y luego llamar al scanner
        int i = 10;
        //i = inputs.nextInt();

        System.out.println("Input: " + i);
        int potenciaCuadrada = i * i;
        System.out.println("PotenciaCuadrada: " + potenciaCuadrada);

        System.out.println("\n\nIngrese una edad: ");
        //2. Declarar la variable y llamar al scanner al mismo tiempo
        int edad6 = inputs.nextInt();

        if (edad6 < 0) {
            System.out.println("Edad imposible");
        } else if (edad6 >= 0 && edad6 < 10) {
            System.out.println("Es una nin@");
        } else if (edad6 >= 10 && edad6 < 18) {
            System.out.println("Es un adolecente");
        } else if (edad6 >= 18 && edad6 < 65) {
            System.out.println("Es un adulto");
        } else if (edad6 >= 65 && edad6 <= 125) {
            System.out.println("Es una persona mayor de edad");
        } else {
            System.out.print("Opcion invalida. Nadie vive mas de 125");
        }
    }
}
