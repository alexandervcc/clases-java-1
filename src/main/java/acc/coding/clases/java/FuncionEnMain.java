package acc.coding.clases.java;

public class FuncionEnMain {
    public static void main(String[] args) {
        double[] arr2 = {2.5,15,2.5,6.88};
        
        double p2 = calcularPromedio(arr2);
        System.out.println("Prom2: "+p2);
    }

    //Cuando creas la funciones alado del metodo main, para poder ejecutarlas anade a la funcion
    // la palabra reservada 'static'
    public static double calcularPromedio(double[] arreglo){
        double sumatoria = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumatoria += arreglo[i];
        }
        double promedio = sumatoria / arreglo.length;
        return promedio;
    }
}
