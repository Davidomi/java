import java.util.Scanner;

public class Ejercicio4_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
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
                if (horari == "tarda") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (horari == "mati") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (horari != "tarda" && horari != "mati") {

                    System.out.println("No em entes quin horari vol, siusplau digues si vol; tarda o mati");

                }
                break;
            case "dimarts":
                if (horari == "tarda") {

                    System.out.println("Ho sentim molt pero no treballem els dimarts a la tarda");

                } else if (horari == "mati") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (horari != "tarda" && horari != "mati") {

                    System.out.println("No em entes quin horari vol, siusplau digues si vol; tarda o mati");

                }
                break;
            case "dimecres":
                if (horari == "tarda") {

                    System.out.println("Avui nomes fem cures de gossos");

                } else if (horari == "mati") {

                    System.out.println("Avui nomes fem cures de gossos");

                }
                break;
            case "dijous":
                if (horari == "tarda") {

                    System.out.println("Ho sentim molt pero no treballem els dimarts a la tarda");

                } else if (horari == "mati") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (horari != "tarda" && horari != "mati") {

                    System.out.println("No em entes quin horari vol, siusplau digues si vol; tarda o mati");

                }
                break;
            case "divendres":
                if (horari == "tarda") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (horari == "mati") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (horari != "tarda" && horari != "mati") {

                    System.out.println("No em entes quin horari vol, siusplau digues si vol; tarda o mati");

                }
                break;
            case "dissabte":
                if (horari == "tarda") {

                    System.out.println("No trevallem ni disabte ni diumenge");

                } else if (horari == "mati") {

                    System.out.println("No trevallem ni disabte ni diumenge");

                } else if (horari != "tarda" && horari != "mati") {

                    System.out.println("No trevallem ni disabte ni diumenge");

                }
                break;
            case "diumenge":
                if (horari == "tarda") {

                    System.out.println("No trevallem ni disabte ni diumenge");

                } else if (horari == "mati") {

                    System.out.println("No trevallem ni disabte ni diumenge");

                } else if (horari != "tarda" && horari != "mati") {

                    System.out.println("No trevallem ni disabte ni diumenge");

                }
                break;
            case "Dilluns":
                if (horari == "tarda") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (horari == "mati") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else {

                    System.out.println("No em entes quin horari vol, siusplau digues si vol; tarda o mati");
                }
                break;
            case "Dimarts":
                if (horari == "tarda") {

                    System.out.println("Ho sentim molt pero no treballem els dimarts a la tarda");

                } else if (horari == "mati") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (horari != "tarda" && horari != "mati") {

                    System.out.println("No em entes quin horari vol, siusplau digues si vol; tarda o mati");

                }
                break;
            case "Dimecres":
                if (horari == "tarda") {

                    System.out.println("Avui nomes fem cures de gossos");

                } else if (horari == "mati") {

                    System.out.println("Avui nomes fem cures de gossos");

                }
                break;
            case "Dijous":
                if (horari == "tarda") {

                    System.out.println("Ho sentim molt pero no treballem els dimarts a la tarda");

                } else if (horari == "mati") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (horari != "tarda" && horari != "mati") {

                    System.out.println("No em entes quin horari vol, siusplau digues si vol; tarda o mati");

                }
                break;
            case "Divendres":
                if (horari == "tarda") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (horari == "mati") {

                    System.out.println("La seva cita amb el seu " + animal + " el " + reserva + " per la " + horari);

                } else if (horari != "tarda" && horari != "mati") {

                    System.out.println("No em entes quin horari vol, siusplau digues si vol; tarda o mati");

                }
                break;
            case "Dissabte":
                if (horari == "tarda") {

                    System.out.println("No trevallem ni disabte ni diumenge");

                } else if (horari == "mati") {

                    System.out.println("No trevallem ni disabte ni diumenge");

                } else if (horari != "tarda" && horari != "mati") {

                    System.out.println("No trevallem ni disabte ni diumenge");

                }
                break;

            case "Diumenge":
                if (horari == "tarda") {

                    System.out.println("No trevallem ni disabte ni diumenge");

                } else if (horari == "mati") {

                    System.out.println("No trevallem ni disabte ni diumenge");

                } else if (horari != "tarda" && horari != "mati") {

                    System.out.println("No trevallem ni disabte ni diumenge");

                }
                break;

        }
    }
}
