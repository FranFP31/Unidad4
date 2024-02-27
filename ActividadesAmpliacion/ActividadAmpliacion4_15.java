package ActividadesAmpliacion;

import java.util.Scanner;

/**Diseña una funcion a la que se le pasan las horas y minutos de dos instantes de tiempo, con el siguiente prototivo
 * static int direferenciaMin(int hora1, int minuto1,int hor2, int minuto2)
 * La funcion devolvera la cantidad de minutos que existen de diferencia entre los dos instantes utilizados**/
public class ActividadAmpliacion4_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Escriba la primera hora");
        int hora1= sc.nextInt();
        System.out.print("Escriba la primera cantidad de minutos");
        int minuto1= sc.nextInt();
        System.out.print("Inserte la segunda hora");
        int hora2= sc.nextInt();
        System.out.print("Inserte la segunda cantidad de minutos");
        int min2= sc.nextInt();
        direferenciaMin(hora1,minuto1,hora2,min2);
    }
    static void direferenciaMin(int hora1, int minuto1,int hora2, int min2){
        int hora1Min=hora1*60+minuto1;
        int hora2Min=hora2*60+min2;
        int max=Math.max(hora1Min,hora2Min);
        int min=Math.min(hora1Min,hora2Min);
        int resultado=max-min;

        System.out.println("La diferencia de "+hora1+":"+minuto1+" y "+hora2+":"+min2 +" es de "+resultado+" Minutos");
    }
}
