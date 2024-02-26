package ActividadesResueltas;
import  java.util.Scanner;
import java.math.*;
/**Realizar una funcion que calcule y muestre el área o el volumen de un cilindro, segun se especifique. Para
 * distinguir un caso de otro se le pasará como opcion un numero:
 * 1(para el área)
 * 2(para el volumen)
 * Ademas, hay que pasarle a la funcion el radio de la base por la altura.
 * **/

public class ActividadResuelta4_3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("Inserta el radio");
        double radio=sc.nextDouble();
        System.out.print("Inserta la altura");
        double altura=sc.nextDouble();
        System.out.println("Que desea calcular 1(Volumen)/2(Area)");
        int opcion=sc.nextInt();
        areaVolumen(radio,altura,opcion);

    }
    static void areaVolumen( double radio, double altura,int opcion){
        double volumen, area;
        switch (opcion){
            case 1->{
                volumen=Math.PI*Math.pow(radio,2)*altura;
                double volumenRedondeado=Math.round(volumen*100)/100;
                System.out.println("El volumen es de :" +volumenRedondeado);
            }
            case 2->{
                area=2*Math.PI*radio*(altura+radio);
                double areaRedondeada= Math.round(area*100)/100;
                System.out.println("El area es de :"+ areaRedondeada);
            }
            default -> System.err.println("Fallo de calculo");
        }


    }
}
