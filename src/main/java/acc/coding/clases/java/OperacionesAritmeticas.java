/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acc.coding.clases.java;

/**
 *
 * @author alexa
 */
public class OperacionesAritmeticas {

    public static void operacionesArimeticas() {
//OPERADORES ARIMETICOS
        // - operaciones matematicas: +,-,*,/,%
        //SINTAXIS: <valor1> <operacion> <valor2>;
        int num1 = 10;
        int num2 = 20;
        int sum1 = num1 + num2;
        int sum2 = num2 + num1;
        int sum3 = 999 + 25;
        int sum4 = num1 + 10000;
        int res = sum1 - 100000;
        int mul = sum2 * 33;
        int div = 25 / 2;

        System.out.println("res: " + res);
        System.out.println("mul: " + mul);
        System.out.println("div: " + div);

        System.out.println("sum: " + sum1);
        System.out.println("sum: " + sum2);
        System.out.println("sum: " + sum3);
        System.out.println("sum: " + sum4);

        //OPERACIONES UNARIAS
        /*
            - operacion aritmetica con un solo valor
            - no requieres de dos valores para generar la operacion
         */
        int unario = 100;
        System.out.println("Unario 1:" + unario);
        //incremento: ++ => incrementar en 1
        unario++;
        unario++;
        unario++;
        unario++;
        unario++;
        System.out.println("Unario 2:" + unario);

        //decremento
        unario--;
        System.out.println("Unario 3:" + unario);

        //OPERADORES DE ASIGNACION ARITMETICA
        /*
        - son operaciones aritmeticas (+,-,*,/,%)
        - SINTAXIS: <variable-con-valor> <simbolo-operacion>= <valor-de-operacion>
         */
        int op1 = 10;
        System.out.println("Asignacion Aritmetica 1:" + op1);
        op1 = op1 + 100;
        System.out.println("Asignacion Aritmetica 1:" + op1);

        int op2 = 10;
        System.out.println("Asignacion Aritmetica 2:" + op2);
        //asignacion aritmetica
        op2 += 100;
        System.out.println("Asignacion Aritmetica 2:" + op2);

        op2 -= 25;//op2 = op2 - 25;
        System.out.println("Asignacion Aritmetica - :" + op2);
        op2 /= 5;//op2 = op2 / 5;
        System.out.println("Asignacion Aritmetica / :" + op2);
        op2 *= 3;//op2 = op2 * 3;
        System.out.println("Asignacion Aritmetica * :" + op2);

    }
}
