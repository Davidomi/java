
/*2-Feu un programa amb les 2 taules de l’apartat anterior.
El primer que fareu serà copiar les dades d’aquestes taules a unes altres mida de 21 
(Podeu usar Arrays.copyOf, Arrays.copyRange o usar un bucle element per element),
 de moment només ha d’haver dades a les 11 primeres posicions i 
 la resta estaran a buides. Creeu després un altra taula de 21 posicions amb l’any de l’estrena de les pelis.
  (inicialitzeu-la amb totes les caselles a 2018).
Aquest programa s’encarregarà d’afegir, modificar i
 esborrar pel·lícules amb el seu corresponent director/a i any d’estrena.
Primer afegireu les pelis que falten,
 us heu de situar en la darrera casella lliure de la taula de pel·lícules i directors i
 anar demanant noms de pelis i directors fins a completar les taules.
Després haureu de demanar un nom de peli, buscar-la a la seva taula i
 si la trobeu heu de demanar informació per modificar el seu director/a i any d’estrena
 i substituir-les a la seva taula corresponent.
Seguidament, heu de preguntar per una posició de les taules que voleu esborrar,
 us situeu en ella i moureu les dades del nom de la peli,
 el director i any posteriors cap a endavant, deixant la casella final amb “”. 
I després usareu la comanda copyOfRange per retallar la mida de cada taula a 20.
Finalment acabareu el programa imprimint per pantalla les dades de les 3 taules.

*/
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pelis[] = { "climax", "laplace's witch", "keepers", "Killing", "burning", "journal 64", "animal",
                "ghostland", "penguin highway", "bad people's game" };
        String directores[] = { "Gaspar Noé", "Takashi Miike", "Kristoffer Nyholm", "Shinya Tsukamoto",
                "Lee Chang-Dong", "Christoffer Boe", "Armando Bo", "Pascal Laugier", "Hiroyasu Ishida",
                "Takashi Miike" };
        String cartelera[] = Arrays.copyOf(pelis, pelis.length + 2);
        String directores2[] = Arrays.copyOf(directores, directores.length + 2);
        int anos[] = { 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018,
                2018, 2018, 2018, 2018, 2018 };

        for (int i = 0; i < cartelera.length; i++) {
            System.out.println("Esribe el nombre de la pelicula:");
            cartelera[i] = sc.nextLine();
            System.out.println("Esribe el director de la pelicula:");
            directores2[i] = sc.nextLine();
            System.out.println("Esribe el año de la pelicula:");
            anos[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Escribe el nombre de la pelicula: ");
        String peli = sc.nextLine();

        for (int i = 0; i < cartelera.length; i++) {
            if (peli.equalsIgnoreCase(cartelera[i])) {
                System.out.println("Pel·licula trobada");
                System.out.println("Escribe el nombre del director:");
                directores2[i] = sc.nextLine();
                System.out.println("Escibre el año de la pelicula");
                anos[i] = sc.nextInt();
                sc.nextLine();
            }
        }

        String cartelera2[] = Arrays.copyOf(pelis, pelis.length + 11);
        String directores3[] = Arrays.copyOf(directores, directores.length + 11);
        int anos2[] = new int[21];
        Arrays.fill(anos2, 2002);

        System.out.println("Dime una posicion de la tabla que quieres borrar: ");
        int posicion = sc.nextInt();

        System.arraycopy(cartelera2, posicion, cartelera, posicion + 1, cartelera.length - (posicion + 2));
        cartelera[cartelera.length - 1] = "";

        System.arraycopy(directores3, posicion, directores2, posicion + 1, directores2.length - (posicion + 2));
        directores2[directores2.length - 1] = "";

        System.arraycopy(anos2, posicion, anos, posicion + 1, anos.length - (posicion + 2));
        anos[anos.length - 1] = 0;

        System.out.println(Arrays.toString(cartelera2));
        System.out.println(Arrays.toString(directores3));
        System.out.println(Arrays.toString(anos2));
    }
}