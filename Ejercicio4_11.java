import java.util.Scanner;

public class Ejercicio4_11 {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        String reserva;
        String animal;
        String horari;
        System.out.println("Hola, bones, benvinguda,benvinguda al nostre veterinari online");
        System.out.println("Quin dia vol reservar?");

        reserva = teclado.nextLine();

        System.out.println("Quin tipus de animal vol portar?");

        animal = teclado.nextLine();

        System.out.println("Quin Horari vol?");

        horari = teclado.nextLine();

        switch (reserva) {

            case "dilluns":
                System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);
                break;
            case "dimarts":
                System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);
                break;
            case "dimecres":
                if (animal == "gos") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (animal == "Gos") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else {
                    System.out.println("Avui nomes fem cures de gossos");

                }
                break;
            case "dijous":
                System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);
                break;
            case "divendres":
                System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);
                break;
            case "dissabte":
                System.out.println("No trevallem ni disabte ni diumenge");
                break;
            case "diumenge":
                System.out.println("No trevallem ni disabte ni diumenge");
                break;
            case "Dilluns":
                System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);
                break;
            case "Dimarts":
                System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);
                break;
            case "Dimecres":
                if (animal == "gos") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (animal == "Gos") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else {
                    System.out.println("Avui nomes fem cures de gossos");

                }
                break;
            case "Dijous":
                System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);
                break;
            case "Divendres":
                System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);
                break;
            case "Dissabte":
                System.out.println("No trevallem ni disabte ni diumenge");
                break;
            case "Diumenge":
                System.out.println("No trevallem ni disabte ni diumenge");
                break;

        }
    }
}
