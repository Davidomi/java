/*3-Creeu un programa on es guardi les posicions en un moment donat de les peces blanques i
 de les peces negres en una partida de dames en format char (caràcter)
 

El taulell és de 10x10 posicions, en cada casella potser que hi hagi una peça blanca 'B',
 una negra 'N' o que estigui buida ' '.
El programa ha de demanar quantes peces blanques tinc en el taulell (entre 1 i 20),
 si introdueix un valor fora del rang ha d'informar de l'error i tornar a demanar-ho. 
Un cop sabem quantes peces blanques hi ha, heu d'anar introduint  una per una la posició
 que ocupen aquelles peces indicant primer el número de filera i després el número de columna.
Després s'ha de fer el mateix amb les negres. Demanar el número de peces i introduir les posicions.
Finalment heu de fer un volcat a pantalla del contingut de la matriu per mostrar els valors que heu guardat.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7_3 {
    public static void main(String[] args) {
        // variables
        // scaner
        Scanner teclado = new Scanner(System.in);
        // array bidimensional;
        int fila = 10, columna = 10;// aqui generamos las variables para luego marcar cual va a ser la distancia de
                                    // la tabla
        char[][] tablero = new char[fila][columna];// generamos array llamada tablero y marcamos la distancia de cada
                                                   // dimension con las varables anterriores mencionada

        boolean fibucleblan = false;
        int fichabla = 0;
        boolean fibucleneg = false;
        int fichaneg = 0;
        // programa
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tablero[i][j] = '⁃';
            }
        }

        while (!fibucleblan) {// decimos cuantas piezas blancas hay
            System.out.print("Digues quantes peces blanques vols afegir (ha de ser un número entre 0 i 20) : ");
            fichabla = teclado.nextInt();

            if (fichabla <= 20 && fichabla >= 0) {
                for (int i = 1; i < fichabla + 1; i++) {
                    System.out.println("A quina fila vols posar la fitxa blanca num " + i);
                    int pos1 = teclado.nextInt();
                    System.out.println("A quina columna vols posar la fitxa blanca num " + i);
                    int pos2 = teclado.nextInt();

                    fibucleblan = true;

                    tablero[pos1][pos2] = '⦾';
                }
            } else {
                System.out.println("Error. El número a de ser entre 0 i 20.");
            }
        }
        while (!fibucleneg) {
            System.out.print("Digues quantes peces negres vols afegir (ha de ser un número entre 0 i 20) : ");
            fichaneg = teclado.nextInt();

            if (fichaneg <= 20 && fichaneg >= 0) {
                for (int i = 1; i < fichaneg + 1; i++) {
                    System.out.println("A quina fila vols posar la fitxa negra num " + i);
                    int pos1 = teclado.nextInt();
                    System.out.println("A quina columna vols posar la fitxa negra num " + i);
                    int pos2 = teclado.nextInt();

                    fibucleneg = true;

                    tablero[pos1][pos2] = '⦿';
                }

                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        System.out.print("|" + tablero[i][j]);
                    }
                    System.out.println("|");
                }
            } else {
                System.out.println("Error. El número a de ser entre 0 i 20.");
            }
        }

    }

}
