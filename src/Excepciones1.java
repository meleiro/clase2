import java.util.InputMismatchException;
import java.util.Scanner;


public class Excepciones1 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Saludar\n2.Salir");

        System.out.println("Elige una opción");

            int num = 5;

        try {
            int opcion = entrada.nextInt();

            int resultado = 5 / opcion;
            num = 2 / 0;

            switch (opcion) {
                case 1 -> {
                    System.out.println("Hola");
                    System.out.println("Hola");
                }

                case 2 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción incorrecta");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes de escribir un número");
        } catch (ArithmeticException e) {
            System.out.println("División por 0");
        } finally {
            System.out.println("FIN");
        }


        entrada.close();
    }

}
