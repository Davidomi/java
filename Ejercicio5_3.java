
import java.util.Scanner;

public class Ejercicio5_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float saldo;
        float saldototal = 0;
        float valor = 0;
        int operpos = 0;
        int operneg = 0;
        int oper = 0;
        String saldopn = "";

        System.out.println("Quin es el teu saldo inicial");
        saldo = teclado.nextFloat();
        teclado.nextLine();
        saldototal = saldo;
        do {

            System.out.println("Que valor quieres introducir?");

            valor = teclado.nextFloat();

            oper = oper + 1;
            saldototal = saldototal + valor;
            if (valor < 0) {
                operneg++;
            } else if (valor > 0) {
                operpos++;
            }
        } while (valor != 0);

        if (saldototal < 0) {
            saldopn = "negativo";

        } else if (saldototal > 0) {
            saldopn = "positivo";

        } else if (saldototal == 0) {
            saldopn = "positivo";
        }

        System.out.println("El teu saldo final es de; " + saldototal);
        System.out.println("Heu fet " + oper + " operacions");
        System.out.println("Heu fet " + operneg + " operacions negatives");
        System.out.println("Heu fet " + operpos + " operacions positibes");
        System.out.println("El teu saldo final es " + saldopn);
    }
}
