package unicesar.edu.co.p2.g2;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nEste programa calcula el sueldo bruto de un numero de trabajadores.\n");
        
        int nEmp;
        
        System.out.print("Ingrese el numero de empleados a los que desea calcular el sueldo bruto: ");
        nEmp = entrada.nextInt();
        
        double cuota = 2.00;
        double cuotaM = 3.00;
        String[] E = new String[nEmp];
        double[] H = new double[nEmp];
        double[] T = new double[nEmp];
        String aux;
        
        //Aquí lleno el vector E con los nombres de los empleados
        System.out.print("\nDigite los nombres de los empleados.\n");
        for(int i = 0; i < nEmp; i++)
        {
            System.out.print("Ingrese el nombre del empleado "+(i+1)+": ");
            aux = entrada.next();
            E[i] = aux;
        }
        
        //Aquí lleno el vector H con las horas que trabajó cada empleado
        System.out.print("\nDigite el numero de horas que trabajó cada empleado.\n");
        for(int i = 0; i < nEmp; i++)
        {
            System.out.print((i+1)+". "+E[i]+": ");
            H[i] = entrada.nextInt();
        }
        
        //Aquí lleno el vector T con la tarifa por horas de cada empleado
        for(int i = 0; i < nEmp; i++)
        {
            if(H[i] < 40)
            {
                T[i] = H[i]*cuota;
            }else{
                T[i] = 40*cuota+((H[i]-40)*cuotaM);
            }
            
        }
        
        
        System.out.print("\nAcontinuacion se mostrara el saldo bruto para cada empleado.");
        System.out.print("\n\nLos empleados que ingreso son: .\n");
        for(int i = 0; i < nEmp; i++)
        {
            //System.out.print((i+1)+". "+E[i]+": "+H[i]+" horas"+" -> $"+T[i]+"\n");
            System.out.printf("%d. %s: %.0f horas -> $%.2f\n",(i+1),E[i],H[i],T[i]);
        }
        System.out.println("");
    }
    
}
