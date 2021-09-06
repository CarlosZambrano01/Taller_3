/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicesar.edu.co.p2.g2;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.print("\nEste programa calcular y mostrar el valor total de venta de todos los productos vendidos.\n");
        calculos();

    }

    public static void calculos() {

        float monto_total = 0;
        int numero_producto;
        int cantidad_vendida;

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nEste almacen vende cinco productos con los siguientes precios:\n\n");
        System.out.println("Producto 1: $2.98");
        System.out.println("Producto 2: $4.50");
        System.out.println("Producto 3: $9.98");
        System.out.println("Producto 4: $4.49");
        System.out.println("Producto 5: $6.87\n");

        System.out.print("\nPor favor introduzca el numero del primer producto o digite (-1) para terminar: ");
        numero_producto = entrada.nextInt();
        

        while (-1 != numero_producto) {

            switch (numero_producto) {
                case 1:
                    System.out.print("\nIntroduzca la cantidad vendida de este producto: ");
                    cantidad_vendida = entrada.nextInt();
                    System.out.printf("El precio de esta venta fue: %.2f", cantidad_vendida * 2.98);
                    monto_total += cantidad_vendida * 2.98;
                    break;

                case 2:
                    System.out.print("\nIntroduzca la cantidad vendida de este producto: ");
                    cantidad_vendida = entrada.nextInt();
                    System.out.printf("\nEl precio de esta venta fue: %.2f", cantidad_vendida * 4.50);
                    monto_total += cantidad_vendida * 4.50;
                    break;

                case 3:
                    System.out.print("\nIntroduzca la cantidad vendida de este producto: ");
                    cantidad_vendida = entrada.nextInt();
                    System.out.printf("\nEl precio de esta venta fue: %.2f", cantidad_vendida * 9.98);
                    monto_total += cantidad_vendida * 9.98;
                    break;

                case 4:
                    System.out.print("\nIntroduzca la cantidad vendida de este producto: ");
                    cantidad_vendida = entrada.nextInt();
                    System.out.printf("\nEl precio de esta venta fue: %.2f", cantidad_vendida * 4.49);
                    monto_total += cantidad_vendida * 4.49;
                    break;

                case 5:
                    System.out.print("\nIntroduzca la cantidad vendida de este producto: ");
                    cantidad_vendida = entrada.nextInt();
                    System.out.printf("\nEl precio de esta venta fue: %.2f", cantidad_vendida * 6.87);
                    monto_total += cantidad_vendida * 6.87;
                    break;

                default:
                    System.out.print("\nINTRODUZCA NUMERO DE PRODUCTO VALIDO!");
                    break;
            }

            System.out.print("\n\nPor favor introduzca el numero del siguiente producto o digite (-1) para terminar: ");
            numero_producto = entrada.nextInt();

        }
        
        System.out.printf("\nLas ventas totales fueron: %.2f",monto_total);
        System.out.println("\n");

    }

}
