package acc.coding.clases.java;

public class Condicionales {
    public static void ejecutar() {
        System.out.println(
                "------------------------------------------CONDICIONES IF/ELSE------------------------------------------\n");
        // CONDICIONES: IF-ELSE
        /*
         * - EVALUAR CONDICIONES, Y TOMAR DESICIONES EN FUNCION DEL RESULTADO
         * - estructura de control
         * - tomar desiciones en el codigo
         * - se hace una pregunta, y tomar un camino de acuerdo a la solucion de la
         * pregunta
         * - operadores logicos: >,<,==,!=,
         * - evaluar un operador logico, y tomar una desicion en base al resultado del
         * operador logico
         * - se evalua si la condicion es verdadero o falso (boolean)
         */

        // SINTAXIS
        /*
         * 1.Solo condicion verdadera
         * if(<condicion>){
         * <ejecucion de si es verdadero>
         * }
         * 
         * 2.Condicion verdadera y falsa
         * if( <condicion> ){
         * <ejecucion de si es verdadero>
         * } else {
         * <ejecucion de si es falso>
         * }
         */
        // Ejemplos:
        // 1.
        System.out.println("CASO 1: solo usar IF");
        int edad = 18;
        if (edad >= 18) {// V->ejecuta
            System.out.println("1. Es mayor de edad");
        }

        if (edad < 18) {// F->no se ejecuta
            System.out.println("2. Es menor de edad");
        }

        // 2.
        System.out.println("\nCASO 2: usar IF-ELSE");
        int edad2 = 18;
        if (edad2 >= 18) {
            // V
            System.out.println("2. Es mayor de edad");
        } else {
            // F
            System.out.println("2. Es menor de edad");
        }

        // Varias operaciones logicas
        System.out.println("\nCASO 3: varias condiciones");
        /*
         * - puedes utilizar cuantas cobimaciones(preguntas) quieras
         * sintaxis:
         * if( <condicion 1> <operador-logico> <condicion 2> ... <condicion n> ){
         * //si el resultado de las combinaciones es V, se ejecuta
         * }
         */
        // Ejemplo
        /*
         * c1: (es mayor de 18) y (es menor de 65) -> [18 - 65 ]
         * c2: (es mayor de 18) o (es menor de 65) -> [ infinito ]
         * c3: (es mayor de 18) y (es menor de 65) o (es hombre) -> [ 18 -65 ] M
         */
        int edad3 = 18;
        if (edad3 >= 18 && edad3 <= 65) {
            // V
            System.out.println("3. Esta en la edad de trabajar.");
        }
        if (edad3 >= 18 || edad3 <= 65) {
            // V
            System.out.println("3. Esta en la edad de trabajar.");
        }
        int edad4 = 15;
        if (edad4 <= 18 && edad4 >= 65) {
            System.out.println("3. Edad 15 menor a 18 y mayor a 65");
        }
        int edad5 = 18;
        if (edad5 <= 18 && edad5 >= 65) {
            System.out.println("3. Edad 18 menor a 18 y mayor a 65");
        }
        if (edad5 <= 18 || edad5 >= 65) {
            System.out.println("3. Edad 18 menor a 18 o mayor a 65 ");
        }

        // paso adicional a estos, puedes anadir un else
        if (edad5 <= 18 && edad5 >= 65) {
            System.out.println("3. Edad 18 menor a 18 y mayor a 65");
        } else {
            System.out.println("3. Edad 18 es imposible ser menor a 18 y mayor a 65 al mismo tiempo");
        }

        System.out.println("\nCASO 4: IF-ELSE consecutivos");
        /*
         * - puedes concatenar varios if-else, y tener mas de 2 posibles
         * - se utiliza 'else if ' como palabra reversada
         * - se puede utilizar cuantos queramos
         * - Si cae en una condicion el resto ya no se evalua
         * SINTAXIS:
         * if( <condicion 1 > ){
         * <ejecucion de si es verdadero>
         * }else if( <condicion 2> ){
         * <ejecucion de si es verdadero>
         * }else if( <condicion 3> ){
         * <ejecucion de si es verdadero>
         * }else if( <condicion 4> ){
         * <ejecucion de si es verdadero>
         * } else {
         * <ejecicion de si es falso>
         * }
         */
        int edad6 = 175;
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

        System.out.println("\n\nCASO 5: IF-ELSE anidados");
        /*
         * - cuando pones un IF dentro de otro if
         * SINTAXIS:
        if( <condicion 1 > ){
            if( <condicion 2 > ){
                if( <condicion 1 > ){
          
                }
            }else{
                if( <condicion 1 > ){
          
                }else if( <condicion 3> ){
                    <ejecucion de si es verdadero>
                }else if( <condicion 4> ){
                    <ejecucion de si es verdadero>
                } else {
                    <ejecicion de si es falso>
                }
            }
        }else{
            if( <condicion 3 > ){
          
            }else{
          
            }
        }
         */
        int edad10 = -5;
        char genero = 'M';

        if (edad10 >= 0 && edad10 < 18) {
            if (genero == 'F') {
                System.out.println("Menor de edad, ninia");
            } else {
                System.out.println("Menor de edad, ninio");
            }
        } else if (edad10 >= 18 && edad10 < 65) {
            if (genero == 'F') {
                System.out.println("Mayor de edad, mujer");
            } else {
                System.out.println("Mayor de edad, hombre");
            }
        } else if (edad10 >= 65 && edad10 <= 125) {
            if (genero == 'M') {
                System.out.println("Ancian@, hombre");
            } else {
                System.out.println("Ancian@, mujer");
            }
        } else {
            System.out.print("Edad Invalida");
        }
    }
}
