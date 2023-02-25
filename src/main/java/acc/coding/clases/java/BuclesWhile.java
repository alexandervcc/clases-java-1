package acc.coding.clases.java;

import java.util.Scanner;

public class BuclesWhile {
    public static void ejecutar(){
        Scanner in = new Scanner(System.in);
        /*while
            - Al igual que el for es una comando para realizar repeticiones
            - a diferencia del for no tiene un principio y fin de forma explicita
            - damos: una condicion de repeticion
                - mientras la condicion es verdadera se ejecutara
                - cuando sea falsa se dejara de ejecutar

            - te pregunta por la condicion antes de ejecutarse (diferencia del do-while)

            - una vez la condicion(es) dan una valor de falso el while se rompe
                - deja de ejecutarse las iteraciones, y se ejecuta lo que le sigue
            SINTAXIS:
            condiciones: pueden ser una o mas, y concatenadas con operadores logicos
                : || && !
            while ( <condicion1 > && <condicion 2> || <condicion 3> ){
                //codigo a ejecutarse en cada repeticion
            }
        */
        //while infinito: porque la condicion siempre es verdadera
        /*
        while(true){
            System.out.println("Hola!!");
        }
        */

        //while: similar a un for 0->x, utilizando otro mecanismo/estrategia

        System.out.println("Ingrese el numero inicial: ");
        int inicio = in.nextInt();
        System.out.println("Ingrese el numero final: ");
        int fin = in.nextInt();
        
        //UTILIZAR: operadores de comparacion: >, <, >=, <=, ==, !=
        while(  inicio < fin  ){
            System.out.println("Valor actual: "+ inicio);
            inicio++;
        }

        //Menu infinito, mientras se ingrese palabras diferentas STOP
        //break: rompe la ejecucion del ciclo 
        System.out.println("---------Ingreso infinito de palabras---------");
        while(true){
            System.out.print("Ingrese una palabra: ");
            String palabraIngresada = in.nextLine();
            if(palabraIngresada.equals("STOP")){
                System.out.println("Ha ingresado 'STOP' el while finaliza en este momento.");
                break;//rompe la ejecucion del while
            }
            System.out.println("Mayus: "+palabraIngresada.toUpperCase());
        }
        
        //Ingresar numeros mientras sean impares, cuando un numero impar rompo el while
        System.out.println("---------Verificador de numeros---------");
        int numeroIngresado = 0;
        while(numeroIngresado%2 == 0){//mientras el numero sea par
            System.out.println("Ingrese un numero: ");
            numeroIngresado = in.nextInt();
            String tipo = "impar";
            if(numeroIngresado%2 == 0){
                tipo = "par";
            }
            System.out.println("Usted a ingresado el numero: "+numeroIngresado+" que es "+tipo);
        }
        

        //Sumar numeros ingresados, mientras los numeros sean positivos mayores a cero
        //si ingreso un numero negativo no lo sumo
        //si ingreso el 0 finalizo el programa

        //continue: salta el bucle actual
        System.out.println("---------Sumatoria de numeros---------");
        int sumatoria = 0;
        while(true){
            System.out.println("Ingrese un numero: ");
            int numero = in.nextInt();

            if(numero < 0){//negativo
                System.out.println("Numero: "+numero+" ha sido denegado.");
                continue;   
            }else if(numero == 0){
                System.out.println("Finalizando ciclo while");
                break;
            }else{
                sumatoria += numero;
                System.out.println("Numero: "+numero+" ha sido aceptado.");
            }
            
            System.out.println("Fin de la iteracion actual.");
        }
        System.out.println("Resultado de sumatoria: "+sumatoria);
        

        System.out.println("------------------------------FIN DE PROGRAMA------------------------------");
    }
}
