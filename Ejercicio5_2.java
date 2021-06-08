
import java.util.Scanner;

public class Ejercicio5_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nom;
        float nota = 0;
        float suma = 0;
        float gran = 0;
        float petit = 10;
        int apro = 0;
        int susp = 0;
        float totsap = 0;
        float mediap = 0;
        float totsus = 0;
        float mediasus = 0;
        float media = 0;
        int alumal = 0;
        int alumba = 0;

        System.out.println("Numero de alumnes");
        nom = teclado.nextInt();

        System.out.println("Quina nota a tret?");
        nota = teclado.nextFloat();
        suma = suma + nota;

        media = suma / nom;

        if (nota >= 5) {
            apro += 1;
            totsap = totsap + nota;
            mediap = totsap / apro;
        }

        if (nota < 5) {
            susp += 1;
            totsus = totsus + nota;
            mediasus = totsus / susp;
        }

        if (gran < nota) {
            gran = nota;
            alumal = 1;
        } else if (nota == gran) {
            alumal += 1;
        }

        if (petit > nota) {
            petit = nota;
            alumba = 1;
        } else if (nota == petit) {
            alumba += 1;
        }
        System.out.println("Han aprobat " + apro + " alumnes. La seva nota mitjana es " + mediap);
        System.out.println("Han suspés " + susp + " alumnes. La seva nota mitjana és " + mediasus);
        System.out.println("La nota mitjana total es " + media);
        System.out.println("La nota més petita és " + petit + " i l'han tret " + alumba + " alumnes");
        System.out.println("La nota més gran és " + gran + " i l'han tret " + alumal + " alumnes");
    }

}
