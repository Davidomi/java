
import java.util.Scanner;

public class Ejercicio3_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int Numero;

        System.out.println("Introduzca un valor para calcularlo a la potencia de 2,3,5,7 y a la raiz cuadrada.");
        Numero = teclado.nextInt();

        double Potencia2 = Math.pow(Numero, 2);
        double Potencia3 = Math.pow(Numero, 3);
        double Potencia5 = Math.pow(Numero, 5);
        double Potencia7 = Math.pow(Numero, 7);
        double Raiz = Math.sqrt(Numero);

        System.out.println("Tu valor introducido es; " + Numero);
        System.out.println("Elevado a la potencia de 2;" + Potencia2);
        System.out.println("Elevado a la potencia de 3;" + Potencia3);
        System.out.println("Elevado a la potencia de 5;" + Potencia5);
        System.out.println("Elevado a la potencia de 7;" + Potencia7);
        System.out.println("y su raiz es; " + Raiz);
    }
}
