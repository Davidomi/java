
import java.util.Scanner;

public class Ejercicio3_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float radio;
        float L;
        float A;
        System.out.println("Introduzca el valor del radio de la circurferencia y calcularemos la longitud y el area.");
        radio = teclado.nextFloat();
        double radio_ele = Math.pow(radio, 2);
        L = (float) (2 * 3.14 * radio);
        A = (float) (3.14 * radio_ele);

        System.out.println("Tu valor introducido es; " + radio + " cm");
        System.out.printf("La longitud es de ; %.2f \n", L);
        System.out.printf("El area es de ; %.2f \n", A);

    }
}
