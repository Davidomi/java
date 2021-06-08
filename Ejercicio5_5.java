import java.util.Scanner;

public class Ejercicio5_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float kg_patatas = 0;
        float kgtotales = 0;

        int viajes = 0;
        int numneg = 0;
        float mitjana = 0;

        do {

            do {
                System.out.println("Quants kilos de patates portes? En el viatje ");
                kg_patatas = teclado.nextFloat();

                kgtotales = kg_patatas + kgtotales;
                if (kg_patatas < 0) {
                    numneg = numneg + 1;

                }
                mitjana = (float) kgtotales / viajes;

            } while (viajes == 10);
            viajes++;
        } while (kgtotales < 5000 || kgtotales == 5000);
        System.out.println("Heu fet " + viajes + " viatjges");
        System.out.println("Heu transoprtat un total de " + kgtotales + " KG");
        System.out.println("La mitjana de KG es de " + mitjana + " KG");
        System.out.println("Viatges amb mes kg ");
        System.out.println("Viatges amb menos kg ");
        System.out.println("Heu posat un total " + numneg + " numeros negatius.");
    }
}