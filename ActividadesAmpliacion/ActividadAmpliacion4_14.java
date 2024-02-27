package ActividadesAmpliacion;

import java.util.Scanner;

/**Escribe una funcion a la que se pase como parámetros de entrada una cantidad de dias, horas y minutos.
 * La funcion calculará y devolverá el número de segundos que existen entre los datos de entrada*/

public class ActividadAmpliacion4_14 {
    public static void main(String[] args) {
        segundos();

    }
    static void segundos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Inserte los dias");
        int dias= sc.nextInt();
        System.out.println("Inserte las horas ");
        int horas = sc.nextInt();
        System.out.println("Inserta los minutos");
        int min= sc.nextInt();
        int minSeg=min*60;
        int horaSeg=horas*3600;
        int diasSeg=dias*25200;
        int segTotal=minSeg+horaSeg+diasSeg;
        System.out.println("Los segundos total son:" +segTotal);

    }

}
