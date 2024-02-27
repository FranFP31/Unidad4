package ActividadesResueltas;
/**Diseñar una funcion que recibe como parametros dos numeros enteros y devuelve el maximo de ambos**/

import java.util.Scanner;

/**Seudocodigo
 * 1.funcion comparacion:
 * declaro el int maximo
 * abro if comparando a y b
 * si a es mas grande maximo toma el valor de a
 * si b es mas grande maximo toma el valor de b
 * y return maximo; para que acabe de funcionar la funcion
 * 2.abro el psvm
 * declaro el Scanner
 * pido el valor a
 * pido el valor b
 * llamo a la funcion comparacion
 * hago un sout para el resultado de la funcion comparacion **/

public class ActividadResuelta4_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserte el valor A ->");
        int a=sc.nextInt();
        System.out.print("Inserte el valor B ->");
        int b=sc.nextInt();
        System.out.println("El numero mas grande es "+comparacionmax(a,b));
        System.out.println("El numero mas pequeño es "+comparacionmin(a,b));
    }
    static int comparacionmax(int a, int b){
         int maximo=Math.max(a,b);
        return(maximo);
    }
    static  int comparacionmin(int a, int b){
        int minimo=Math.min(a,b);
        return (minimo);
    }
}
