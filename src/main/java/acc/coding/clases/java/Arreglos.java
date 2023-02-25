package acc.coding.clases.java;

public class Arreglos {

    public static void ejecutar() {
        /*
         * ARREGLOS
         * - utilizar varios cajones juntos para almacenar varios valores, de forma
         * consecutiva
         * - debes definir el tamano de un arreglo
         * - el tamano que le das no es modificable
         * - para acceder al arreglo utilizamos indices
         * - indice: posicion donde se almacena un elemento en el arreglo
         * - un arreglo asi mismo como las variables solo pueden almacenar un tipo de
         * dato
         * - los elementos del arreglo, es leible y modificable
         * - usualmente se manipula los arreglos a traves de bucles (for es el mas
         * utilizado)
         * - Arreglos son mutidimensionales
         */

        // Ejemplo de una matriz (arreglo de 2 dimensiones)
        int[][] matriz = new int[10][10];

        // Declarcion
        // <tipo-dato>[] <nombre-variable> = new <tipo-dato>[ <tamano-arreglo> ];
        // indices: 0 -> (tamano-1)
        
        double[] arr2 = new double[20];
        boolean[] arr3 = new boolean[3];
        String[] arr4 = new String[7];
        
        int[] arr = new int[10]; // 0 -> 9
        
        System.out.println("Posicion 0: " + arr[0]);
        System.out.println("Posicion 5: " + arr[5]);
        System.out.println("Posicion 9: " + arr[9]);

        // Errores: cuando tratamos de acceder a indices fuera de lo permitido en el
        // arreglo
        // System.out.println("Posicion 10: "+arr[10]);
        // System.out.println("Posicion -1: "+arr[-1]);

        // actualizacion de datos
        arr[0] = -5;
        arr[5] = 7;
        arr[9] = 99;

        System.out.println("Posicion 0: " + arr[0]);
        System.out.println("Posicion 5: " + arr[5]);
        System.out.println("Posicion 9: " + arr[9]);

        //el arreglo almacena solo elemntos del mismo tipo de datos
        //arr[0] = 2.5;
        //arr[0] = "xd";


        //Recorrer con for
        
    }
}
