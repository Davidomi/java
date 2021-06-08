
import java.util.*;

public class Golf2 {

    /**
     * @param args the command line arguments
     */
    static ArrayList golf = new ArrayList();
    static int M;
    static int N;

    public static void main(String[] args) {

        int golpes_jugador_1 = 0, golpes_jugador_2 = 0, golpes_jugador_3 = 0; // los golpes que va a dar cada jugador se
                                                                              // guardan
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int distancia = 0;
        for (int i = 0; i < 3; i++) {
            distancia = 0;
            System.out.println("Distancia del forat " + (i + 1));
            distancia = sc.nextInt();
            golf.add(i, distancia);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(golf.get(i));
        }
    }

}
