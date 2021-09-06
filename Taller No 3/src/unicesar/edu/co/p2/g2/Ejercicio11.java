package unicesar.edu.co.p2.g2;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nEste programa recibe un numero entero e imprime el mismo numero pero con sus digitos invertidos.\n");
        
        int num;
        System.out.print("Ingrese una cantidad numerica entera: ");
        num = entrada.nextInt();
        
        invertir(num);
    }
    
    
    public static void invertir(int num){
        int invertido, div;
        int numero;
        
        invertido = 0;
        numero = num;
        
        while(num > 0)
        {
            div = num % 10;
            invertido = invertido * 10 + div;
            num/=10;
        }
        
        System.out.printf("El numero %d invertido es: %d\n\n",numero,invertido);
    }
    
}
