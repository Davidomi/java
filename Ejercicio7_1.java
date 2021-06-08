/*1-Escriviu un programa on hi haurà 2 taules amb informació sobre pel·lícules del Festival de Sitges.
 
Una taula contindrà els noms de 10 pel·lícules: CLIMAX, Laplace's Witch, KEEPERS, Killing, BURNING,
JOURNAL 64, ANIMAL, GHOSTLAND, PENGUIN HIGHWAY, Bad People’s Game

L'altra taula contindrà el nom del director/a de cada film: Gaspar Noé, Takashi Miike,
Kristoffer Nyholm, Shin'ya Tsukamoto, Lee Chang-Dong, Christoffer Boe, Armando Bo, Pascal Laugier,
Hiroyasu Ishida, Takashi Miike

(No canvieu l'ordre, perquè ha de coincidir amb els noms de l'altra taula)

El programa us ha de demanar que trieu si voleu a partir d’una pel·lícula obtenir el director, 
l’opció inversa o Acabar. (Podeu fer un menú amb números).  Heu de repetir l’acció fins que seleccioni 
una opció vàlida. Un feta la tria, heu d'introduir el nom i us ha de retornar per pantalla el seu corresponent 
de l'altra taula.

Vigileu!!! Un director/a pot haver fet més d’una pel·lícula.

Si no heu localitza el nom de la pel·lícula o del director/a, ha de sortir un missatge indicant que no s’ha trobat.
Finalment, quan seleccioneu Acabar sortireu del programa.
*/

import java.util.Scanner;

public class Ejercicio7_1 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        boolean trobat = false;
        boolean pregunta = false;

        while (!pregunta) {
            System.out.println(
                    "Que vols fer :\n1.- A partir d’una pel·lícula obtenir el director\n2.- A partir d’un director obtenir la  pel·licula\n3.- Finalitzar\nDigues un numero;");
            int resp = texto.nextInt();

            String pelis[] = { "climax", "laplace's witch", "keepers", "Killing", "burning", "journal 64", "animal",
                    "ghostland", "penguin highway", "bad people's game" };
            String directors[] = { "Gaspar Noé", "Takashi Miike", "Kristoffer Nyholm", "Shinya Tsukamoto",
                    "Lee Chang-Dong", "Christoffer Boe", "Armando Bo", "Pascal Laugier", "Hiroyasu Ishida",
                    "Takashi Miike" };
            texto.nextLine();

            switch (resp) {
                case 1:
                    while (!trobat) {
                        System.out.println(
                                "Digues la pel·licula que vols seleccionar: \n-Climax \nLaplace's witch \n-Keepers \n-Killing \n-Burning \n-Journal 64 \n-Animal \n-Ghostland \n-Penguin highway \n-Bad people's game");
                        String a = texto.nextLine();

                        for (int i = 0; i < pelis.length; i++) {
                            if (a.equals(pelis[i])) {
                                System.out.println("El director és: " + directors[i]);
                                trobat = true;
                                pregunta = true;
                                break;
                            }

                        }
                        if (!trobat) {
                            System.out.println("Error. No s'ha trobat la pel·licula.");
                        }
                    }

                    break;

                case 2:
                    while (!trobat) {
                        System.out.println(
                                "Digues el Director que vols seleccionar: \n-Gaspar Noé \n-Takashi Miike \n-Kristoffer Nyholm \n-Shinya Tsukamoto \n-Lee Chang-Dong \n-Christoffer Boe \n-Armando Bo \n-Pascal Laugier \n-Hiroyasu Ishida \n-Takashi Miike");
                        String b = texto.nextLine();

                        for (int i = 0; i < directors.length; i++) {
                            if (b.equals(directors[i])) {
                                System.out.println("La pel·licula és: " + pelis[i]);
                                trobat = true;
                                pregunta = true;
                            }
                        }
                        if (!trobat) {
                            System.out.println("Error. No s'ha trobat el Director.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Finalitzat");
                    pregunta = true;
            }
        }
    }
}