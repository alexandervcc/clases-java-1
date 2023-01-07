/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acc.coding.clases.java;

/**
 *
 * @author alexa
 */
public class Strings {

    public static void claseStrings() {
        //STRINGS
        /*
        - Tipo de dato que no es primitivo
        - Tipo de datos Objecto
        - Como objecto tiene funciones
            - Llamar operaciones/acciones a realizarse sobre el String
        - Contiene cadenas texto : "hola 123 ?"
        - Se contiene con comillas dobles "
        
        - Sintaxis funcion en un string:
            <nombre-variable-string>.<nombre de funcion>()
        
        - FUNCIONES:
            - algunas devuelven un valor, puedes almacenar
            - algunas reciben parametros
                <nombre-funcion>( a, b, c );
         */
        String ejemploFunciones = "hola COMO estas 123???";
        System.out.println("\n\n\n-------------------------------STRINGS-----------------------------");
        System.out.println("STRING: " + ejemploFunciones);

        //length(): devuelve la longitud del string
        //no recibe parametros
        // length() si devuelve un valor
        System.out.println("1. length(): " + ejemploFunciones.length());
        int longitudString = ejemploFunciones.length();
        System.out.println("2. length(): " + longitudString);

        //manipular el case
        //no modifican la variable original, sino devuelven un nuevo valor
        //toUpperCase(): convierte a mayusculas
        //toLowerCase(): convierte a minusculas
        System.out.println("Upper: " + ejemploFunciones.toUpperCase());
        System.out.println("Lower: " + ejemploFunciones.toLowerCase());
        String upper = ejemploFunciones.toUpperCase();
        System.out.println("Upper 2: " + upper);
        System.out.println("original: " + ejemploFunciones);

        //indexOf(<strin-parametro>): devuelve el indice/posicion de una letra, la primera que se encuentre
        //encuentra la primera occurrencia: si hays varias veces la letra a buscar
        //devuelve la primera vez que se encuentra, de izquierda a derecha
        System.out.println("\n\nLetra (e): " + ejemploFunciones.indexOf("e"));
        int posicioinLetrae = ejemploFunciones.indexOf("e");
        System.out.println("Letra (e): " + posicioinLetrae);
        System.out.println("Letra (2): " + ejemploFunciones.indexOf("2"));
        System.out.println("Letra (O): " + ejemploFunciones.indexOf("O"));

        //isBlank(): V/F, si el string esta vacio "", solo espacios en blanco
        System.out.println("Vacio: " + ejemploFunciones.isBlank());
        String stringVacio = "";
        System.out.println("Vacio: " + stringVacio.isBlank());
        boolean estaVacio = stringVacio.isBlank();
        System.out.println("Vacio: " + estaVacio);

        //CONCATENACION DE STRINGS
        /*
        - unir 2 o mas cadenas de texto
        - simbolo +, concatenar cuandos quieras
        - funcion concat()
         */
        String nombre = "Cosme";
        String apellido = "Fulanito";
        System.out.println("\nnombre: " + nombre);
        System.out.println("apellido: " + apellido);
        String nombreCompleto = nombre + apellido;
        System.out.println("nombre completo: " + nombreCompleto);
        String nombreCompleto2 = nombre + "   " + apellido + nombre + "  Cuenca";
        System.out.println("nombre completo 2: " + nombreCompleto2);

        //concat(<string a concatenar>): sobre una variable string, llamar a la funcion y pasarle
        //<variable1>.concat(<variable2>);
        // como parametro el segundo string a concatenar
        System.out.println("concat(): " + nombre.concat(apellido));
        String unionNombres = nombre.concat(apellido);
        System.out.println("concat(): " + unionNombres);

        //+ numeros y strings
        System.out.println(10 + 20);//30        -> suma aritmetica
        System.out.println("10" + "20");//1020  -> concatenacion
        System.out.println("10" + 20);//1020    -> concatenacion

        int numero = 100;
        System.out.print("Hola como estas: " + numero);//concatenacion

        //caracteres especiales
        //- caracteres que no puedes poner de un string de forma directa
        //escapar el caracteres permitira leerlo -> 
        //   \<caracter-especial>
        String caracteres = "Caracteres especiales: " + "  \"    \\  ";
        System.out.println(caracteres);

        //SEQUENCIAS DE ESCAPE:\
        /*String con funcinalidades especificas:
            - \n: imprime nueva linea
            - \r: 
            - \t: tabulador                     
         */
        System.out.println("linea1 \n linea2 \n1\n2\n3");
        System.out.println("r \r r");
        System.out.println("a\tb");
    }
}
