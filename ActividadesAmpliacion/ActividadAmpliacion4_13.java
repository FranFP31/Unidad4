package ActividadesAmpliacion;

import java.util.Scanner;

/**Crea la funcion muestraPares(int n) que muestre por consola los primeros n numeros pares */

public class ActividadAmpliacion4_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserta hasta que numero quieres sacar los pares->");
        int n= sc.nextInt();
        muestraPares(n);
    }
    static void muestraPares(int n){
        int num=0;
        for (int i=0;i<n;i++){
            num+=2;
            System.out.println(num+" ");
        }
        System.out.println("");
    }
}


