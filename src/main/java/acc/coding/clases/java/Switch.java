package acc.coding.clases.java;

public class Switch {

    public static void ejecutar() {
        /*
         * SWITCH
         * - estructura para tomar desicion de acuerdo a un valor que es evaluado
         * - se parece mucho a un if-else, pero es mas compacto
         * - utiliza 'case' para realizar la toma de desicion
         * - utilzar 'default' para capturar si ningun case es seleccionado
         */

        // Imprime el dia segun el numero (1-7) -> (L-D)
        int dia = -110;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            // capturar casos que no tienen case
            default:
                System.out.println("Numero de dia: " + dia + " es invalido.");
                break;
        }
    }
}
