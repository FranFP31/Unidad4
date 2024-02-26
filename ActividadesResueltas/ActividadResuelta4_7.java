package ActividadesResueltas;
/**Escribir una funcion a la que se le pase un numero entero
 * y devuelva el numero de divisiores primos que tiene**/

import java.util.Scanner;

/**Seudocodigo
 * 1:declaro el Scanner
 * 2.Almaceno el numero en la var num
 * 3. creo la funcion descomPrimo
 * descomPrimo:
 * **/

public class ActividadResuelta4_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        do {
            System.out.print("Inserte un numero");
            num=sc.nextInt();
        } while (num<1);
        System.out.println(num +" tiene "+numDivisores(num)+" divisores Primos");
    }
    static boolean esPrimo(int num) {
        int i = 2;
        boolean primo = true;
        if (num < 2) {
            primo = false;

        }
        while (i < num && primo == true) {
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }
        return (primo);
    }
    static int numDivisores(int num){
        int contador=1;
        for (int i=2;i<=num;i++){
            if (esPrimo(i)&& num % i ==0){
                contador++;
            }
        }
        return contador;
    }

}
