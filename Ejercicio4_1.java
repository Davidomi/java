import java.util.Scanner;

public class Ejercicio4_1 {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int numero_1, numero_2, numero_3;

        System.out.println("Porfavor ingresa un numero");
        numero_1 = teclado.nextInt();
        System.out.println("Ahora ingresa otro numero");
        numero_2 = teclado.nextInt();
        System.out.println("Ahora el tercer numero");
        numero_3 = teclado.nextInt();
        if (numero_1 > numero_2) {
            if (numero_1 > numero_3) {
                System.out.println("El mayor es el numero 1: " + numero_1);
            } else {
                System.out.println("El mayor es el numero 3: " + numero_3);
            }
        } else if (numero_2 > numero_3) {
            System.out.println("El mayor es el numero 2: " + numero_2);
        } else {
            System.out.println("El mayor es el numero 3: " + numero_3);
        }
    }

}
