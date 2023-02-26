package acc.coding.clases.java;

public class Matriz {

    public static void ejecutar() {
        // Matriz: es un arreglo de 2 dimensiones
        // reutiliza la sintaxis de arreglos sencillos
        // es similar declarar o crear a un arreglo
        // y se recorre mediante indices por cada dimension
        // por cada dimension se debe de anadir un par de corchetes extras

        int[][] mat = new int[4][3];

        mat[0][0] = 10;
        System.out.println(mat[0][0]);
        mat[3][2] = 100;
        System.out.println(mat[0][0]);

        // Recorrer matriz
        // utilizar for anidado
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Pos[" + i + "," + j + "]:"+mat[i][j]);
            }
        }

        System.out.println("\n\n----------------------IMPRESION MATRIZ----------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j]+", ");
            }
            System.out.println(" ");
        }

        //tamano
        int tamY = mat.length;
        System.out.println("Y:"+tamY);
        int tamX = mat[0].length;
        System.out.println("X:"+tamX);
        
    }
}
