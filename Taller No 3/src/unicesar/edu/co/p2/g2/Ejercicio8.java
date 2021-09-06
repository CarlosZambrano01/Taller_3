package unicesar.edu.co.p2.g2;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nEste programa recibe el tamaño del lado de un cuadrado e imprimira un cuadrado hueco de asteriscos de ese tamaño.\n");

        int tamaño;

        String OP = "SI";

        do {
            System.out.print("Por favor ingrese el tamaño del cuadrado: ");
            tamaño = entrada.nextInt();
            if (tamaño <= 0 || tamaño > 20) {
                System.out.print("Eror!, el tamaño debe estar entre 1 y 20.\n\n");
            }
        } while ((tamaño <= 0) || (tamaño > 20));

        System.out.println();

        if (tamaño >= 0 && tamaño <= 50) {
            //Linea superior
            for (int i = 0; i < tamaño; i++) {
                System.out.print("*");
            }
            System.out.println();

            //centro de la forma
            for (int i = 0; i < tamaño - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < tamaño - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            //Linea inferior
            for (int i = 0; i < tamaño; i++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

}
