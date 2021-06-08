import java.util.Scanner;

public class Ejercicio4_3 {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int numero_uno;
        int numero_dos;
        int resultado;
        System.out.println("Por favor indique un numero ya sea positivo o negativo");

        numero_uno = teclado.nextInt();

        System.out.println("Por favor indique otro numero");

        numero_dos = teclado.nextInt();

        resultado = numero_uno + numero_dos;

        if (numero_uno + numero_dos > 0) {
            System.out.println("La suma es positiva " + resultado);
        } else if (numero_uno + numero_dos < 0) {
            System.out.println("La suma es negativa " + resultado);
        } else {
            System.out.println("La suma es igual a " + resultado);
        }
    }
}
