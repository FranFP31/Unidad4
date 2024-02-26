package Explicaciones;

public class Explicacion {//una clase
    public static void main(String[] args) {//funcion o metodo
//aqui se llama las funciones o metodos que se van a ejecutar
        tresSaludos(0);//se llama la funcion para que se ejecute
        tresSaludos(1);//se llama la funcion para que se ejecute
        tresSaludos(2);//se llama la funcion para que se ejecute
        tresSaludos(3);//se llama la funcion para que se ejecute
        tresSaludos(4);//se llama la funcion para que se ejecute

    }
    public static void  tresSaludos(int veces){//Mi primera funcion
        System.out.println("Te vamos a saludar"+veces+" veces ");
        for (int i=0;i<veces;i++){
            System.out.println("Hola");
        }
    }
}
