
import java.util.Scanner;

public class Ejercicio3_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int enter;

        System.out.println("Vamos a convertir un numero decimal en octal y en hexadecimal");
        System.out.println("Porfavor introduzca un valor");
        enter = teclado.nextInt();

        System.out.println("Tu valor introducido es; " + enter);
        System.out.printf("En octal el valor es; %o\n", enter);
        System.out.printf("En hexadecimal; %x ", enter);
    }
}
