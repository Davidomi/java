
/*6-Escriu un programa que et demani un text que ha de contenir 3 o més vegades la
 paraula “temps”, en cas contrari ha de tornar a demanar el missatge fins que es compleixi la condició.*/
import java.util.Scanner;

public class Ejercicio6_6 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        String palabra;
        boolean fin = false;
        int num = 0;

        while (fin == false) {

            System.out.print("Escriu un text que contengui 3 vegades la paraula temps: ");
            palabra = texto.nextLine();

            num = palabra.split("temps").length;

            if (num < 3) {
                System.out.println("El text no es correcta tornal a escriure");

            } else {
                System.out.println("El text es correcta");
                fin = true;
            }
        }
    }
}
