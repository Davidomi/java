
import java.util.Scanner;

public class Ejercicio3_2 {

  public static void main(String[] args) throws Exception {
    Scanner teclado = new Scanner(System.in);
    int Kilometros;
    int Tiempo;
    float Metros;

    System.out
        .println("Vamos a calcular los metros que hacemos en una hora segun los Kilometros y el tiempo transcurrido");
    System.out.println("Porfavor introduzca la distancia.");
    Kilometros = teclado.nextInt();
    System.out.println("Porfavor introduzca el tiempo transcurrido");
    Tiempo = teclado.nextInt();

    Metros = (float) (Kilometros / Tiempo) * 1000;

    System.out.printf("En una hora hemos hecho: " + Metros + " metros.");

  }

}
