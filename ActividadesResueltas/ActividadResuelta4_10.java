package ActividadesResueltas;

import java.util.Scanner;

/**Diseñar una funcion que calcuel a elevado a n, donde a es real y n es entero no negativo.
 * Realizar una version iterativa y otra recursiva **/

public class ActividadResuelta4_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserte la base");
        double a =sc.nextInt();
        System.out.print("Inserte el exponente");
        int n=sc.nextInt();
        exponencial(n,a);
    }
    static void exponencial(int n,double a){
        if (n>=0){
            double result=Math.pow(a,n);
            System.out.println(result);
        }else{
            System.err.println("No se puede realizar");
        }
    }

}
