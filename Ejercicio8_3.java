
/*3- Feu un programa per organitzar una sortida educativa del centre a Barcelona, 
per fer-ho crearem un programa on tindrem 2 ArrayList, 
en la primera guardarem els llocs que volem visitar durant la sortida i
 en l'altra el nom dels alumnes que participaran en la sortida.
Primer el programa anirà demanant-nos noms de llocs interessants de Barcelona en l'ordre en que els volem visitar,
 acabarem quan no introduïm cap valor a la línia. Mostrarem la llista de tots els noms i el nº de llocs que visitarem.
Després anirem introduint els nom dels alumnes a la segona llista fins que no introduïm cap valor a la línia. 
Mostrarem el nº d'alumnes i la llista de tots els noms d'alumnes.
Ara volem saber si l'alumne «Manel» s'ha apuntat a la llista.
 Indicarem en quina posició de la llista el tenim si hi és i sinó direm que no hi és.
L'alumna «Maria» s'ha apuntat a darrera hora a la llista.
 S'ha d'afegir. Mostreu de nou la llista d'alumnes.
El «Manel» s'ha posat malalt i serà substituït per «Robert». Mostreu de nou la llista d'alumnes.
Un alumne ens pregunta si visitarem el «Camp Nou»,
 heu de mirar a la llista si l’havíem afegit i en cas contrari afegir-lo en la 2a posició.
  Mostreu de nou la llista de llocs a visitar.
Finalment ens han dit que el «Museu Picaso» està en obres i no el podrem visitar,
 cal esborrar-lo si l'havíem afegit i tornar a mostrar la llista de llocs a visitar. 

*/
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8_3 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    ArrayList lugares = new ArrayList();
    ArrayList nombres = new ArrayList();
    String alumnos, visitas, respuestalug, respuestalm;
    boolean acabada_alumnos, acabada_lugares, manel;
    int j, i;
    acabada_alumnos = false;
    acabada_lugares = false;

    for (i = 0; acabada_lugares == false; i++) {
      System.out.println("Que lugar quieres visitar?");
      visitas = teclado.nextLine();
      lugares.add(i, visitas);
      System.out.println(
          "Quieres introducir otro lugar para visitar?en caso positivo enviar un mensaje con 's' en caso negativo pulsar enter simplemente");
      respuestalug = teclado.nextLine();
      if (respuestalug.equalsIgnoreCase("S")) {
        acabada_lugares = false;

      } else if (respuestalug.equalsIgnoreCase("")) {
        acabada_lugares = true;
        for (i = 0; i < lugares.size(); i++) {
          System.out.println(lugares.get(i));
        }

      }
      for (j = 0; acabada_alumnos == false; j++) {
        System.out.println("Cual es el nombre del alumnop que viene?");
        alumnos = teclado.nextLine();
        nombres.add(j, alumnos);
        System.out.println(
            "Quieres introducir otro lugar para visitar?en caso positivo enviar un mensaje con 's' en caso negativo pulsar enter simplemente");
        respuestalm = teclado.nextLine();
        if (respuestalm.equalsIgnoreCase("S")) {
          acabada_alumnos = false;

        } else if (respuestalm.equalsIgnoreCase("")) {
          acabada_alumnos = true;
          for (j = 0; j < nombres.size(); j++) {
            System.out.println(nombres.get(j));
          }

        }
        System.out.println("El alumno Manel se ha apuntado a la salida?");

        if (nombres.contains("Manel")) {
          System.out.println("Si, Se ha apuntado es el alumno numero; " + nombres.indexOf("Manel"));
          manel = true;

        } else {
          System.out.println("no, no se ha apuntado");
          manel = false;
        }
        System.out.println("Maria se acaba de apuntar la debemos a;adir a la lista");
        nombres.add("Maria");
        System.out.println("La lista ha quedado asi;");
        for (j = 0; j < nombres.size(); j++) {
          System.out.println(nombres.get(j));
        }
        if (manel == true) {
          System.out
              .println("El Manel se ha puesto malo y no podra asistir, pero el alumno Robert sustituira su plaza");
          nombres.set(nombres.indexOf("Manel"), "Robert");
          for (j = 0; j < nombres.size(); j++) {
            System.out.println(nombres.get(j));
          }
        } else if (manel == false) {

          System.out.println("Robert se acaba de incorporar a la salida");
          nombres.add("Robert");
        }
        for (j = 0; j < nombres.size(); j++) {
          System.out.println(nombres.get(j));
        }
        System.out.println("Vamos a ir al Camp Nou? SI no esta apuntado, iremos al final");
        lugares.contains("Camp Nou");
        if (lugares.contains("Camp Nou")) {
          System.out.println("Si, vamos al camp nou");

        } else {
          System.out.println("no, no teniamos pensado ir pero ahora lo hemos a;adido en segundo lugar");
          lugares.add(1, "Camp Nou");
          for (i = 0; i < lugares.size(); i++) {
            System.out.println(lugares.get(i));
          }
          if (lugares.contains("Museo Picaso")) {
            System.out.println("El museo Picaso esta cerrado asi que no vamos a ir");
            lugares.remove(lugares.indexOf("Museo Picaso"));
            for (i = 0; i < lugares.size(); i++) {
              System.out.println(lugares.get(i));
            }

          } else {
          }
        }
      }
    }
  }
}
