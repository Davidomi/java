import java.util.Scanner;

public class Ejercicio4_5 {
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

        if (numero_uno >= numero_dos && numero_uno >= numero_tres && numero_dos >= numero_tres) {
            System.out.println(numero_uno + ">=" + numero_dos + ">=" + numero_tres);
        } else if (numero_uno >= numero_dos && numero_uno >= numero_tres && numero_tres >= numero_dos) {
            System.out.println(numero_uno + ">=" + numero_tres + ">=" + numero_dos);
        } else if (numero_dos >= numero_uno && numero_uno >= numero_tres && numero_dos >= numero_tres) {
            System.out.println(numero_dos + ">=" + numero_uno + ">=" + numero_tres);
        } else if (numero_dos >= numero_uno && numero_dos >= numero_tres && numero_tres >= numero_uno) {
            System.out.println(numero_dos + ">=" + numero_tres + ">=" + numero_uno);
        } else if (numero_tres >= numero_dos && numero_tres >= numero_uno && numero_uno >= numero_dos) {
            System.out.println(numero_tres + ">=" + numero_uno + ">=" + numero_dos);
        } else if (numero_tres >= numero_dos && numero_tres >= numero_uno && numero_dos >= numero_uno) {
            System.out.println(numero_tres + ">=" + numero_dos + ">=" + numero_uno);

        }
    }
}
