package ActividadesResueltas;

import java.util.Scanner;

/**Repetir la actividad resuelta 4.4 con una version que calcule el máximo de tres numeros **/

public class ActividadResuelta4_9 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Inserte el valor A ->");
            int a=sc.nextInt();
            System.out.print("Inserte el valor B ->");
            int b=sc.nextInt();
            System.out.print("Inserte el valor de C->");
            int c=sc.nextInt();
            System.out.println("El numero mas grande es "+comparacionmax(a,b,c));
            System.out.println("El numero mas pequeño es "+comparacionmin(a,b,c));
        }
        static int comparacionmax(int a, int b,int c){
            int maximo=Math.max(a,b);
            int auxiliar=Math.max(maximo,c);
            return(auxiliar);
        }
        static  int comparacionmin(int a, int b,int c){
            int minimo=Math.min(a,b);
            int aux=Math.min(minimo,c);
            return (aux);
        }
    }


