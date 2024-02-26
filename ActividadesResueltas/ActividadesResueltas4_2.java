package ActividadesResueltas;
/**Escrbir una funcion a la que se le pason dos enteros y muestre los numeros comprendidos entre si **/
import java.util.Scanner;
public class ActividadesResueltas4_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserte un numero->");
        int a=sc.nextInt();
        System.out.print("Inserte otro entero->");
        int b=sc.nextInt();
        comprendidos(a,b);
    }
    static void comprendidos(int a, int b){
        int mayor =a>b?a:b;
        int menor =a<b?a:b;
        for (int i=menor;i<=mayor;i++){
            System.out.print(i);
            if (i!=mayor){
                System.out.print(",");
            }
        }

    }
}
