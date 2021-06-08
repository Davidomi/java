import java.util.Scanner;

public class Ejercicio4_4 {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int numero_uno;
        int numero_dos;
        int numero_tres;
        System.out.println("Por favor indique un numero ya sea positivo o negativo");

        numero_uno = teclado.nextInt();

        System.out.println("Por favor indique otro numero");

        numero_dos = teclado.nextInt();

        System.out.println("Por favor indique otro numero");

        numero_tres = teclado.nextInt();

        if (numero_uno + numero_dos == numero_tres) {
            System.out.println("La suma del primer numero y del segundo es igual al tercero");
        } else if (numero_uno + numero_tres == numero_dos) {
            System.out.println("La suma del primer numero y del tercero  es igual al segundo");
        } else if (numero_dos + numero_tres == numero_uno) {
            System.out.println("La suma del tercero  numero y del segundo es igual al primero");
        } else {
            System.out.println("Ninguna suma es igual a ningun numero");
        }
    }
}
