
package regresion.linear.simple;

import java.util.Scanner;

public class RegresionLinearSimple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        double b0,b1,num;
        Observ observaciones[];
        Proceso a = new Proceso();
        
       System.out.println("Introduzca la cantidad de observaciones");
       n = teclado.nextInt();
       observaciones = new Observ[n];
       
       for(int i=0;i<n;i++){
           double x,y;
           System.out.println("Introduzca el valor de X de la observacion "+(i+1));
           x = teclado.nextDouble();
           System.out.println("Introduzca el valor de Y de la observacion "+(i+1));
           y = teclado.nextDouble();
           observaciones[i] = new Observ(x,y);
       }
       b0 = a.calcularb0(n,observaciones);
       b1 = a.calcularb1(n,observaciones);
       
       do{
       System.out.println("\nModelo de regresion linear (SLR)");
       System.out.println("Y = "+b0+" + "+b1+"X");
       System.out.println("Introduzca numero(X) para predecir Y (Presione 0 para salir)");
       num = teclado.nextDouble();
       System.out.println("El resultado es: "+a.predecir(num, b0, b1));
       } while(num !=0);
       
    }
    
}
