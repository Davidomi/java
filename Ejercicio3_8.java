
import java.util.Scanner;

public class Ejercicio3_8 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n1;
    int n2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int residual;

    System.out.println("Vamos a sumar, restar, multiplicar y dividir(y sabremos el residuo).");
    System.out.println("Porfavor introduzca un valor.");
    n1 = teclado.nextInt();
    System.out.println("Ahora introduzca el otro valor.");
    n2 = teclado.nextInt();

    suma = (int) n1 + n2;
    resta = (int) n1 - n2;
    multiplicacion = (int) n1 * n2;
    division = (int) n1 / n2;
    residual = (int) n1 % n2;

    System.out.println("El resultado es:");
    System.out.println("Suma:" + suma);
    System.out.println("Resta:" + resta);
    System.out.println("Multiplicacion:" + multiplicacion);
    System.out.println("Division:" + division);
    System.out.println("Residual:" + residual);

  }

}
