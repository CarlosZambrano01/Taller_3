package unicesar.edu.co.p2.g2;
import java.util.Scanner;

public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        binarioaDecimal();
        decimalaBinario();
    }
    
    public static void binarioaDecimal(){
        Scanner entrada = new Scanner(System.in);
        
        
        long numero, aux, digito, decimal, num;
        int exponente;
        boolean esBinario;

        //Leer un número por teclado y comprobar que es binario
        do {

            System.out.print("Introduce un numero binario: ");
            numero = entrada.nextLong();
            
            num = numero;
            //comprobamos que sea un número binario es decir, que este formado solo por unos y ceros.
            esBinario = true;
            aux = numero;

            while (aux != 0) {
                digito = aux % 10; //última cifra del número
                if (digito != 0 && digito != 1) //si no es 0 ó 1
                {
                    esBinario = false; //no es un número binario
                }
                aux = aux / 10; //quitamos la última cifra para repetir el proceso 
            }

        } while (!esBinario);  //se vuelve a pedir si no es binario

        //proceso para pasar de binario a decimal
        exponente = 0;
        decimal = 0; //será el equivalente en base decimal
        
        while(numero != 0)
        {
            digito = numero % 10; //se toma la última cifra
            decimal = decimal + digito * (int) Math.pow(2, exponente); //se multiplica por la potencia de 2 correspondiente y se suma al número
            exponente++; //se aumenta el exponente
            numero = numero / 10; //se quita la última cifra para repetir el proceso
        }
        
        System.out.printf("El numero binario %d en decimal es: %d\n\n",num,decimal);
    }
    
    
    public static void decimalaBinario(){
        Scanner entrada = new Scanner(System.in);
        
        int numero, exp, digito, num;
        double binario;
        
        do{ 
            System.out.print("Introduce un numero entero mayor o igual a cero: ");                                                
            numero = entrada.nextInt();
            num = numero;
        }while(numero < 0);
        
        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + digito * Math.pow(10, exp);                                                   
                exp++;
                numero = numero/2;
        }
        System.out.printf("El numero decimal %d en binario es: %.0f\n\n",num,binario);
    }
}
