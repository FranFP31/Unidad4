package ActividadesAmpliacion;

import java.util.Scanner;

/**Implementar la funcion:
 * static double distancia (double x1,double y1, double x2, double y2)
 * que calcula y devuelve la distancia euclidea que separa los puntos (x1, y1) y(x2,y2).
 * La formula para calcular la distancia es:
 * distancia= raiz cuadrada de (x1-x2)al cuadrado +(y1-y2)al cuadrado**/

public class ActividadAmpliacion4_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Inserte el valor de X1");
        double x1= sc.nextDouble();
        System.out.println("Inserte el valor de X2");
        double x2=sc.nextDouble();
        System.out.println("Inserte el valor de Y1");
        double y1= sc.nextDouble();
        System.out.println("Inserte el valor de Y2");
        double y2= sc.nextDouble();
        double resultado = distancia(x1,x2,y1,y2);
        System.out.print("La distancia es : " + resultado);


    }
    static  double distancia(double x1,double x2, double y1, double y2){
        double distancia=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        return distancia;
    }

}
