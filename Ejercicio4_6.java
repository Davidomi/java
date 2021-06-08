import java.util.Scanner;

public class Ejercicio4_6 {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int numero_uno;
        int numero_dos;
        int numero_tres;
        float media;
        System.out.println("Por favor indique un numero ya sea positivo o negativo");

        numero_uno = teclado.nextInt();

        System.out.println("Por favor indique otro numero");

        numero_dos = teclado.nextInt();

        System.out.println("Por favor indique otro numero");

        numero_tres = teclado.nextInt();

        media = (float) (numero_uno + numero_dos + numero_tres) / 3;

        if (numero_uno > media && numero_dos > media) {
            System.out.println("La media es; " + media + " el primer y el segundo numero es mayor que la media");
        } else if (numero_uno > media && numero_tres > media) {
            System.out.println("La media es; " + media + " el tercer y segundo numero es mayor que la media");
        } else if (numero_dos > media && numero_tres > media) {
            System.out.println("La media es; " + media + " el tercer y segundo numero es mayor que la media");
        } else if (numero_uno > media) {
            System.out.println("La media es; " + media + " el primer numero es mayor que la media");
        } else if (numero_dos > media) {
            System.out.println("La media es; " + media + " el segundo numero es mayor que la media");
        } else if (numero_tres > media) {
            System.out.println("La media es; " + media + " el tercer numero es mayor que la media");

        } else {
            System.out.println("la media es; " + media + " los tres numeros son iguales");
        }
    }
}
