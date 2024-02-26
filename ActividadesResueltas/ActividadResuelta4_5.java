package ActividadesResueltas;
/**Crear una funcion que, mediante un booleano, indique si el carácter que se pasa como pparametro responde a una vocal**/

import java.util.Scanner;

/**seudocodigo
 * 1:creo la funcion buleana en la que eme compare si la variable con una cadena de if si n= a,e,i,o,u
 * si es una de las letras anteriores el resultado es true
 * si no coincide el resultado es false con err para que salga en rojo
 * 2:psvm
 * declaro escaner
 *  sout de pedir el valor de n en un tipo char
 *  llamo a la funcion buleana
 *  **/

public class ActividadResuelta4_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("inserte una letra");
        char n=sc.next().charAt(0);

        System.out.println(esVocal(n));
    }
    static String esVocal(char n){
       boolean resultado;
       String text="";
        if (n=='a'||n=='e'||n=='i'||n=='o'||n=='u'|| n=='A'||n=='E'||n=='I'||n=='O'||n=='U'){
            resultado=true;
            text="La letra "+n+" es vocal";
        }else{
            resultado=false;
            text="La letra "+n+" no es vocal";
        }
        return text;
    }
}
