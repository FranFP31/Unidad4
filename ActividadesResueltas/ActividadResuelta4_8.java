package ActividadesResueltas;

import java.util.Scanner;

/**Diseñar la funcion calculadora(), a la que se le pasan don números reales(operandos)
 * y que operacion se desea realizar con ellos. Las operaciones disponibles son:
 * 1:sumar
 * 2:restar
 * 3:multiplicar
 * 4:dividir
 * La funcion devolvera el resultado de la operacion mediante un numero real.**/

public class ActividadResuelta4_8 {
    public static void main(String[] args) {
        double a,b;
        int operacion;
        Scanner sc=new Scanner(System.in);
        System.out.println("Inserta el primer numero");
        a=sc.nextDouble();
        System.out.println("Inserte el segundo numero");
        b=sc.nextDouble();
        for ( operacion = 1; operacion <= 4; operacion++) {
            double result = calculadora( a,b, operacion);
            System.out.println(result);
        }
    }

        static double calculadora ( double a,double b,int operacion) {
            double result;
           result= switch (operacion) {
                case 1 ->
                        a + b;
                case 2 ->
                        a - b;
                case 3 ->
                        a * b;
                case 4 ->
                        a / b;
                default -> {
                    System.err.println("Operacion no valida");
                    yield 0;//si no hay resultado en el switch el resultado es 0

                }
            };
            return (result);
        }
}
