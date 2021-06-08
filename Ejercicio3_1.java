
import java.util.Scanner;

public class Ejercicio3_1 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int TemperaturaF;
    float temperaturaC;

    System.out.println("Vamos a calcular una temperatura de Fahrenheit a Celsius");
    System.out.println("Porfavor introduzca una temperatura.");
    TemperaturaF = teclado.nextInt();

    temperaturaC = (float) (TemperaturaF - 32) * 5 / 9;

    System.out.printf("La temperatura en Celsius es: %.2f ", temperaturaC);

  }

}
