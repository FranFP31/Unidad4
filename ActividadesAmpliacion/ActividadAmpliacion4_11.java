package ActividadesAmpliacion;

import java.util.Scanner;

/**Diseña una funcion que calcule y muestre la superfice y el volumen de una esfera **/

public class ActividadAmpliacion4_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserta el radio");
        double radio= sc.nextDouble();
        byte opcion;
        System.out.println("Que quieres calcular 1. Superficie/ 2.Volumen");
        opcion=sc.nextByte();
        calculo(radio,opcion);

    }
    static void calculo(double radio,int opcion){
        switch (opcion){
            case 1-> {
                double superficie=4*Math.PI*Math.pow(radio, 2);
                System.out.println("La superficie de la esfera es "+superficie);
            }
            case 2->{
                double volumen=(4*Math.PI/3)*Math.pow(radio,3);
                System.out.println("El volumen es de "+volumen);
            }
        }
    }
}
