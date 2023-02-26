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
        //Iterar sobre el contenido del arreglo uno por uno
        //Se utiliza una estructura de bucle: for, while, dowhile
        //Mas utilizada for
        //arreglo indices: 0 -> tamano - 1
        // arr -> 10 (0->9)
        System.out.println("\n\n------------------RECORRIDO DEL ARREGLO CON FOR------------------");
        for (int i = 0; i < 10; i++) {
            arr[i] += 1 ;//le sumo 1 a cada posicion del arreglo
            System.out.println("arr[" + i + "]: " + arr[i]);
        }

        //Podemos crear arreglos, sin darle el tamano, pero dando el contenido
        String[] frutas = {"manzana","pera","maracuya","naranjilla","babaco"};
        for (int i = 0; i < 5; i++) {//i: 0 -> 4
            System.out.println("frutas[" + i + "]: " + frutas[i]);
        }

        //Como obtener el tamano de un arreglo
        String[] autos = {"mazda","toyota","chevrolet","kia","bmw","nissan","volkswagen","hyundai","ford"};
        // <nombre-arreglo>.length -> saca el tamano del arreglo
        int tamanoAutos = autos.length;//saco el tamano del arreglo
        System.out.println("\n\n\nTamano arreglo autos: "+tamanoAutos);
        for (int i = 0; i < tamanoAutos; i++) {
            System.out.println("autos[" + i + "]: " + autos[i]);
        } 

        //recorrer arreglo de atras hacia adelante
        for (int i = tamanoAutos-1; i>=0; i--) {
            System.out.println("autos[" + i + "]: " + autos[i]);
        } 
        
    }
}
