/*  5-Escriu un programa que et demani un text. Haureu d’indicar quantes paraules hi ha en el
 missatge (useu l’espai en blanc de separador), posteriorment haureu de passar el missatge a
  majúscules i substituir qualsevol dígit que hi hagi posant pel símbol # en els eu lloc abans
   de tornat a mostrar el missatge. Useu mètodes de la classe String.
Ex: “Avui és dia 15 de Novembre de 2018”
	El missatge conté 8 paraules.
	AVUI ES DIA ## DE NOVEMBRE DE ####
*/

import java.util.Scanner;

public class Ejercicio6_5 {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        String frases;
        String MAY;

        System.out.println("Introduzca una frase; ");

        frases = texto.nextLine();
        MAY = frases.toUpperCase();

        System.out.println("Tu frase tiene;  " + frases.split("\\s+").length + " palabras");

        System.out.println(MAY.replaceAll("[0-9]", "#"));

    }

}
