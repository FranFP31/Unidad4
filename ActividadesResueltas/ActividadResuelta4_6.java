package ActividadesResueltas;
import java.util.Scanner;

/**Diseñar una funcion con el siguiente prototipo:
 * boolean esPrimo(int n)
 * que devolverá true si n es primo y false en caso contrario*/
public class ActividadResuelta4_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num= sc.nextInt();
        System.out.println("El numero "+num+ " es "+esPrimo(num));


        /**
        for (int i = 1; i <= 15; i++) {
            if (esPrimo(i)) {
                System.out.println(i + "Es primo");
            } else {
                System.err.println(i + "No es primo");
            }
        }
         **/
    }

    static String esPrimo(int num) {
        int i = 2;
        String text="Es Primo ";
        boolean primo = true;
        if (num < 2) {
            primo = false;
             text="No es primo";
        }
        while (i < num && primo == true) {
            if (num % i == 0) {
                primo = false;
                text="No es primo";
            }
            i++;
        }
        return (text);
    }
}
