/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acc.coding.clases.java;

/**
 *
 * @author alexa
 */
public class MathClass {

    public static void claseMathLibrary() {
        System.out.print("--------------------------------MATH--------------------------------\n\n");
        /*
         * Operaciones arimeticas que estan dentro de una libreria
         * - no hay un soporte nativo para cierttas operaciones
         * - Utiliizar la libreria Math: contiene operaciones matematicas mas complejas
         * -
         */
        // Obtener la maximo/minimo entre dos valores
        // SINTAXIS: Math.max(<valor1>,<valor2>);
        // SINTAXIS: Math.min(<valor1>,<valor2>);

        int maxValue = Math.max(5, -25);
        System.out.println("Max value: " + maxValue);
        int minValue = Math.min(55, 456);
        System.out.println("Min value: " + minValue);

        // raiz cuadrada: Math.sqrt(<valor>);
        double rc = Math.sqrt(64);
        System.out.println("Raiz Cuadrada: " + rc);

        // valor absoluto: Math.abs(<valor>)
        int valorAbsoluto = Math.abs(-85);
        System.out.println("Valor absoluto: " + valorAbsoluto);

        // numero aleatorio: Math.random() -> 0.0 - 1.0
        double valorAleatorio = Math.random();
        System.out.println("Valor aleatorio: " + valorAleatorio);

        double valorAleatorio2 = valorAleatorio * 100;
        System.out.println("Valor aleatorio: " + valorAleatorio2);

        // convierto double -> int: quitarle las comas decimales
        int valorAleatorioSinDecimales = (int) valorAleatorio2;
        System.out.println("Valor aleatorio Sin decimales: " + valorAleatorioSinDecimales);

        // Pow: elevado a, eleva el primero numero a la potencia del segundo
        double num1 = Math.pow(10, 2); // 100
        double num2 = Math.pow(2, 3); // 8

        System.out.println("10^2 = " + num1);
        System.out.println(" 2^3 = " + num2);
    }
}
