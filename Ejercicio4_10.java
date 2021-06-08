import java.util.Scanner;

public class Ejercicio4_10 {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        float preupizza = 0;
        String pizza;
        boolean extra1;
        boolean extra2;
        boolean extra3;
        System.out.println("Indique que piza quiere entre las que tenemos;");
        System.out.println("margarita: 6$");
        System.out.println("bolonyesa: 8$");
        System.out.println("formatges: 9$");

        pizza = teclado.nextLine();

        switch (pizza) {
            case "margarita":

                preupizza = 6;
                break;

            case "bolonyesa":

                preupizza = 8;
                break;

            case "formatges":

                preupizza = 9;
                break;

        }

        System.out.println("Vols algun tipusde extra?");

        System.out.println("Formatge: +0.50$" + "(true/false)");

        extra1 = teclado.nextBoolean();

        System.out.println("Xampinyons: +0.50$" + "(true/false)");

        extra2 = teclado.nextBoolean();

        System.out.println("Salmo: +1.00$" + "(true/false)");

        extra3 = teclado.nextBoolean();

        if (extra1 == true) {
            preupizza = (float) (preupizza + 0.5);
        }
        if (extra2 == true) {
            preupizza = (float) (preupizza + 0.5);
        }
        if (extra3 == true) {
            preupizza = (float) (preupizza + 1);
        }
        System.out.println("El preu toatal apagar es; " + preupizza + "$");
    }

}
