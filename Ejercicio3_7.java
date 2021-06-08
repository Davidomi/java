
import java.util.Scanner;

public class Ejercicio3_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float base;
        float altura;
        float area;

        System.out.println("Queremos calcular el area de un triangulo con tu ayuda.");
        System.out.println("Por favor introduzca la medida de la base;");
        base = teclado.nextFloat();
        System.out.println("Ahora introduzca la medida de la altura");
        altura = teclado.nextFloat();
        area = (float) (base * altura) / 2;
        System.out.printf("TU area del triangulo es; %.2f ", area);
        System.out.printf("cm");

    }
}
