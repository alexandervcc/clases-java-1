package acc.coding.clases.java;

import java.util.Scanner;

public class BuclesFor {
    public static void ejecutar() {
        // BUCLES:
        /*
         * Algo que se va a repetir varias veces
         * En los lenguajes de programacion existen 3 tipos de bucles principales"
         * - for
         * - while
         * - do while
         */

        // FOR
        /*
         * - es un bucle que le das una condicion de inicio y fin
         * - compone de 3 partes:
         * -> variable de inicio -> int i=0
         * -> condicion de repeticion -> i < 5
         * -> tamano del paso -> i++
         */
        // sintaxis del bucle FOR
        // for (<vairable de inicio> ; <condicion de repeticion> ; <tamano del paso> ) {
        // ....codigo a ejecutar
        // }

        System.out.println("----------FOR 0->5----------");
        for (int i = 0; i < 5; i++) {// 0 -> 1 -> 2 -> 3 -> 4 -> 5
            System.out.println("i -> " + i);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\n\n----------FOR con Scanner----------");
        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("i -> " + i);
        }

        System.out.println("\n\n----------FOR con paso de dos----------");
        for (int i = 0; i < x; i = i + 2) {
            System.out.println("i -> " + i);
        }

        System.out.println("\n\n----------FOR con paso de tres----------");
        for (int i = 0; i < x; i = i + 3) {
            System.out.println("i -> " + i);
        }

        System.out.println("\n\n----------FOR descedente----------");
        // variable de inicio debe ser mas grande que la condicion
        // el paso ahora debe decrementar
        for (int i = x; i > 0; i--) {
            System.out.println("i -> " + i);
        }

        System.out.println("\n\n----------FOR descedente con paso 2----------");
        for (int i = x; i > 0; i = i - 2) {
            System.out.println("i -> " + i);
        }

        /*
         * Operadores:
         * - continue: salta el presente ciclo para ejecutar el siguiente
         * - break: rompe el for, lo finaliza de manera apresurada
         */
        System.out.println("\n\n----------FOR continue----------");
        // Va a ir de 0 -> x, y si el numero es multiplo de 3 no lo imprime
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("i -> " + i);
        }

        System.out.println("\n\n----------FOR break----------");
        // Va a ir de 0 -> x, y si encuentra un multiplo de 3 rompe el for
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0) {
                break;
            }
            System.out.println("i -> " + i);
        }
    }
}
