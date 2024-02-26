package ActividadesResueltas;
import java.util.Scanner;

/**Diseñar una funcion con el siguiente prototipo:
 * boolean esPrimo(int n)
 * que devolverá true si n es primo y false en caso contrario*/
public class ActividadResuelta4_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserte un numero->");
        int n=sc.nextInt();
        for (int i =1;i<=15;i++){
            if (esPrimo(n)){
                System.out.println(n+" Es Primo");
            }else{
                System.err.println(n+ "No es Primo  ");
            }
        }
    }
    static boolean esPrimo(int n){
        boolean primo=true;
       if (n%==0){
           primo=false;
        }else{
           primo= true;
        }
    }
}
