package Explicaciones;
import java.util.Scanner;
public class ExplicacionEntradaNombreApellidoEdad {//una clase
    public static void main(String[] args) {//funcion o metodo
//aqui se llama las funciones o metodos que se van a ejecutar
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserte el nombre-> ");
        String nombre=sc.next();
        System.out.print("Inserte el apellido ->");
        String apellido=sc.next();
        System.out.print("Inserte su edad -> ");
        byte edad= sc.nextByte();
        datos(nombre,apellido,edad);
        quitarEdad(nombre,apellido,edad);
    }
     static void  datos (String nombre, String apellido, byte edad){//Mi primera funcion
        edad+=10;
        System.out.println("Hola,"+nombre +" "+ apellido+ ". En 10 años tendras "+edad );
    }
    static  void quitarEdad(String nombre,String apellidos, byte edad){
        edad-=10;
        System.out.println("Hola "+ nombre +" "+apellidos +". Hace 10 años tenias "+edad);

    }
}
