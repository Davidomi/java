import java.util.Scanner;

public class Ejercicio6_1 {

    public static void main(String[] args) {
        int num_caracteres = 0;
        String cadena_original = "";
        String str = "";
        String contains = "el";
        String sino = "";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Porfavor ingrese un texto:");
        cadena_original = teclado.nextLine();
        num_caracteres = cadena_original.length();
        str = cadena_original;

        if (contains.contains("el") == true) {
            sino = "si";
        } else {
            sino = "no";
        }
        System.out.println("Tu texto tiene un total de " + num_caracteres + " caracteres");

        System.out.println("la primera vegada que la lletra 'a' apareix es " + str.indexOf('a' | 'A')
                + " y la darrera vegada es " + str.lastIndexOf('a' | 'A'));
        System.out.println("El text 'el' " + sino + " apareix");

    }
}
