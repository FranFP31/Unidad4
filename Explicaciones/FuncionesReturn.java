package Explicaciones;

import java.util.Scanner;

public class FuncionesReturn {
    public static void main(String[] args) {
        String nombreUsuario=llamadaNombre(3);
        System.out.println("Tu nombre es "+ nombreUsuario);
    }
    static String llamadaNombre(int contador){
        String nombre="";
        System.out.println("Introduce el nombre");
        Scanner sc=new Scanner(System.in);
        nombre=sc.nextLine();
        return nombre ;
    }
}
