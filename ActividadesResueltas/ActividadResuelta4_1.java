package ActividadesResueltas;
import java.util.Scanner;
/**Diseñar la funcion eco() a la que se le pasa como parametro un numero n, y muestra por
 * pantalla n veces el mensaje "ECO..."**/
public class ActividadResuelta4_1 {
    /**Las soculciones iran acompañadas de una funcion main que sirva de prueba
     * El prototipo de la funcion es : void eco(int n).**/
    public static void main(String[] args) {
        System.out.print("Inserta el numero de veces que quieras que te salude -> ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        echo(n);
    }
    static void echo(int n) {
        for (int i=1;i<=n;i++){
            System.out.println("Hola , has sido saludado "+ i +" veces");
        }
    }
}
