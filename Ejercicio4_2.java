import java.util.Scanner;

public class Ejercicio4_2 {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int numero;

        System.out.println("Por favor indique un numero");

        numero = teclado.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("El numero es multiple de 2 i 3");
        } else if (numero % 2 == 0) {
            System.out.println("El numero es multiple de 2");
        } else if (numero % 3 == 0) {
            System.out.println("El numero es multiple de 3");
        } else {
            System.out.println("El numero es multiple de cap");
        }
    }
}
