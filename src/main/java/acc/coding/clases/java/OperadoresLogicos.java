/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acc.coding.clases.java;

/**
 *
 * @author alexa
 */
public class OperadoresLogicos {

    public static void operadoresLogicos() {
        //OPERADORES LOGICOS
        /*
        - comparaciones que devuelve un resultado booleano(V,F)
        - primitivas
        - procesos de toma de desicion
        - SOLO podemos comparar mismos tipos de datos
        -SINTAXIS: 
        
        ( <valor1> <comparador> <valor2>  ){ 
            <hacer si la comparacion es verdadera> 
        }
        
        - ejemplo: edad es mayor 18: edad vs 18
            - V: 'es mayor de edad'
            - F: 'es menor de edad'
        - siempre devuelven un boolean 
        
        - cuales son los COMPARADORES LOGICOS?
            - si es igual:          ==
            - no son iguales:       !=
            - es mayor que:         >
            - es menor que:         <
            - es mayor o igual:     >=
            - es menor o igual:     <=
        
        - OPERADORES LOGICOS:
            - te permiten concatenar condiciones
            - && : y
            - || : o
            - !  : negacion
            -Ejemplo: (es mayor 18) && (es hombre)
                -c1:    25 && M -> V && V -> V
                -c2:    14 && M -> F && V -> F
         */
        int edad = 24;
        if (edad > 18) {
            System.out.println("Es mayor a 18");
        }
        if (edad == 24) {
            System.out.println("Edad igual a 24");
        }
        if (edad < 65) {
            System.out.println("Edad menor a 65");
        }
        if (edad != 100) {
            System.out.println("Edad es diferente de 100");
        }
        if (edad <= 24) {
            System.out.println("Edad es menor o igual a 24");
        }

        boolean resultado = edad > 18;
        resultado = edad <= 24;
        resultado = edad != 100;
        resultado = edad < 65;
        resultado = edad == 24;

        String nocs = "0";//text
        int noci = 0;//numero
        //Se puede comparar solo el mismo tipo de datos
        if (noci == 5) {

        }
        //No se compara los Strings de esta forma
        if (nocs == "0") {
        }
        //Strings siempre usar <variable>.equals(<valor2>)
        if (nocs.equals("0")) {
        }

    }
}
