package acc.coding.clases.java;

import java.util.Scanner;

public class Funciones {
    public void ejecutar() {
        /*
         * FUNCIONES
         * - bloques de codigo para evitar la redundancia
         * - te permita reutilizar lineas de codigo
         * - debes hacer a nivel de la clase
         * - el codigo se vuelve mas facil de leer, manejar y aplicar cambios
         * - tienen un nombre por el cual se las llama, es flexible y lo entrega el usuario
         * - el nombre de las funciones no se pueden repetir
         * - utiliza el tipado
         *      - para darle argumentos
         *      - para definir el valor de retorno
         * - argumentos: parametros que ingresan a la funcion
         *      - argumentos deben ir con tipado
         *      - una funcion puede tener 0 o mas argumentos
         * - valor de retorno: valor que devuelve la funcion luego de ejecutarse
         *      - el resultado es de un tipo
         *      - debes definir que tipo devuelve la funcion
         *      - la funcion devolvera solo un valor o ninguno
         *      - valores de retorno es que son flexible: variables, arreglos, objetos(String)
         *      - si la funcion devuelve un valor, DEBES utilizar la palabra return
         *          - return: le dices que variable o valor debes de devolver
         *      - si la funcion no devuelve nada, no debes de usar un tipo de dato: int, double, String, etc
         *          - utilizar palabra reservada void
         *          - no necesitas utilizar return
         *          - no deves de capturar el resultado en una variable
         */

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        int n1 = in.nextInt();
        System.out.println("Ingrese el numero 2: ");
        int n2 = in.nextInt();
        //para capturar el resultado de una funcion que devuelve valores
        //debemos de utilizar una variable

        //Funcion que retorna datos
        int resultado = sumarDosNumeros(n1, n2);//llamo a la funcion
        System.out.println("Resultado: "+resultado);
        
        //Funcion que no retorna nada
        imprimirHolaMundo();
        imprimirHolaMundo();
        imprimirHolaMundo();
        imprimirHolaMundo();
        imprimirHolaMundo();

        System.out.println("-------------CALCULO DEL PROMEDIO DE UN ARREGLO-------------");
        double[] arr1 = {2.5,1025,65,25,77,52.55,9.48,2.44,.55,1.99};
        double[] arr2 = {2.5,15,2.5,6.88};
        double[] arr3 = {2,9.6,78.5,1,2.5,6.66,4.69,8,5.25,1,6,9,8,2,11,15,26,36.5,45,785.2,15,.25,45.2};
        double p1 = calcularPromedio(arr1);
        double p2 = calcularPromedio(arr2);
        double p3 = calcularPromedio(arr3);
        
        System.out.println("Prom1: "+p1);
        System.out.println("Prom2: "+p2);
        System.out.println("Prom3: "+p3);
        

    }

    //public <tipo-dato> <nombre-funcion>( parametros: <tipo-dato> <nombre-parametro>, <tipo-dato> <nombre-parametro> ) {
        //codigo a ejecutarse
    //}

    public int sumarDosNumeros(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }

    public void imprimirHolaMundo(){
        System.out.println("Hola mundo!!");
    }

    public double calcularPromedio(double[] arreglo){
        double sumatoria = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumatoria += arreglo[i];
        }
        double promedio = sumatoria / arreglo.length;
        return promedio;
    }
}
