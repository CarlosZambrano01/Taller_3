package unicesar.edu.co.p2.g2;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nEste programa calcula los cargos por estacionamiento de un cliente.\n");

        String nombre;
        int placa;
        int nHoras;
        double costos;
        double valor3H = 2.00;

        System.out.print("\nIngrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese los ultimos tres numeros de la placa de su vehiculo: ");
        placa = entrada.nextInt();

        do {
            
            System.out.print("Ingrese el numero de horas que duro su vehiculo en el parqueadero: ");
            nHoras = entrada.nextInt();
            if(nHoras > 24)
            {
                System.out.println("\nEl numero de horas excede lo permitido\n");
            }else{
                if(nHoras <= 3)
                {
                    costos = (2.00);
                    System.out.printf("\nEl cargo por estacionamiento de %d horas es: $%.2f\n",nHoras,costos);
                }else if(nHoras >3 && nHoras < 24){
                    costos = valor3H + ((nHoras-3)*0.50);
                    System.out.printf("\nEl cargo por estacionamiento de %d horas es: $%.2f\n",nHoras,costos);
                }else if(nHoras == 24){
                    costos = 10.00;
                    System.out.printf("\nEl cargo por estacionamiento de %d horas es: $%.2f\n",nHoras,costos);
                }
            }
        } while (nHoras > 24);

    }

}
