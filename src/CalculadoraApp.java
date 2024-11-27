import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");
            //Mostramos el menu
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que está dentro de las opciones posibles
                if (operacion >= 1 && operacion <= 4) {
                    //Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {//Salir
                    System.out.println("Adios, nos vemos en la proxima...");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                // Imprimimos salto de linea
                System.out.println();
            }//fin try
            catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }//fin while
    }// fin main
    private static void mostrarMenu(){
        System.out.println("""
                    1.Suma.
                    2.Resta.
                    3.Multiplicacion.
                    4.Division.
                    5.Salir.
                    """);
        System.out.println("La operacion a realizar es: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> {//Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado suma: " + resultado);
            }
            case 2 -> {//Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado resta: " + resultado);
            }
            case 3 -> {//Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado multiplicacion = " + resultado);
            }
            case 4 -> {//Division
                resultado = operando1 / operando2;
                System.out.println("Resultado division = " + resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);
        }
    }
}// fin clase