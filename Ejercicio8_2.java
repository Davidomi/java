/*2- Genereu un programa per gestionar una reunió d'alcohòlics anònims.
 Volem que a través d'una ArrayList bidimensional es pugui guardar les dades dels assistents que es vagin donant d'alta,
  modificar-les si hi ha un error i consultar-les.
La primera cosa que heu de fer és demanar el nom del primer assistent, 
la seva edat i els dies que porta sense beure alcohol.
A continuació heu de preguntar si a la reunió vindrà algú més i 
en cas afirmatiu demanar les dades del següent, fins que ja no vulguem afegir a més gent.
Un cop ja els hem afegit, heu de mostrar per pantalla el nº d’assistents
 a la reunió i les dades de tots els assistents.
Després us adoneu que hem posat malament les dades d'un dels assistents,
 concretament el 2n, que realment es diu Jordi, te 25 anys i porta 7 dies sense beure.
  Torneu a mostrar per pantalla les dades de tots els assistents.
Ara ens truca el 3r de la llista i diu que no podrà assistir a la reunió,
 per tant l'haurem d'esborrar. Torneu a mostrar per pantalla les dades de tots els assistents.
I finalitzem el programa.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8_2 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nombre, respuesta;

    int edad, dias_sin_alcohol, j, i;

    boolean acabada = false, respuesta_valida = true, cambio = false;

    ArrayList<ArrayList> Pacientes = new ArrayList<ArrayList>();

    for (i = 0; acabada == false; i++) {
      System.out.println("Introduzca el nombre del paciente numero " + (i + 1));
      nombre = teclado.nextLine();
      Pacientes.add(new ArrayList<String>());
      Pacientes.get(i).add(nombre);
      System.out.println("Edad que tiene el asociado");
      edad = teclado.nextInt();
      teclado.nextLine();
      Pacientes.get(i).add(edad);
      System.out.println("Dias que lleva sin consumir alcohol");
      dias_sin_alcohol = teclado.nextInt();
      teclado.nextLine();
      Pacientes.get(i).add(dias_sin_alcohol);
      System.out.println("Quieres a;adir algun Paciente mas? S/N");
      respuesta = teclado.nextLine();
      if (respuesta.equalsIgnoreCase("S")) {
        acabada = false;
        respuesta_valida = true;

      } else if (respuesta.equalsIgnoreCase("N")) {
        acabada = true;
        respuesta_valida = true;
        for (i = 0; i < Pacientes.size(); i++) {
          System.out.println("Paciente " + i + " ;");
          for (j = 0; j < Pacientes.get(i).size(); j++) {
            System.out.println(Pacientes.get(i).get(j) + "");

          }
          System.out.println();
        }
        System.out.println(
            "Nos acabamos de dar cuenta que el asistente numero 2 esta mal introducido y debemos cambiarle los datos");
        Pacientes.remove(1);

        for (i = 1; cambio == false; i--) {

          System.out.println("Escribe el nombre bien (Jordi)");
          nombre = teclado.nextLine();
          Pacientes.get(1).add(nombre);

          System.out.println("Escribe edad bien (25)");
          edad = teclado.nextInt();
          teclado.nextLine();
          Pacientes.get(1).add(edad);

          System.out.println("Escribe el tiempo sin beber alcohol bien (7)");
          dias_sin_alcohol = teclado.nextInt();
          teclado.nextLine();
          Pacientes.get(1).add(dias_sin_alcohol);

          if (Pacientes.get(1).contains("Jordi") && Pacientes.get(1).contains(25) && Pacientes.get(1).contains(7)) {
            cambio = true;
          } else {
            cambio = false;
            Pacientes.remove(1);
          }

        }
        for (i = 0; i < Pacientes.size(); i++) {
          System.out.println("Paciente " + i + " ;");
          for (j = 0; j < Pacientes.get(i).size(); j++) {
            System.out.println(Pacientes.get(i).get(j) + "");
          }
        }
        System.out.println(
            "Nos acaba de informar que el tercer participante de la reunion no podra asisitir, asi que sera eliminado de la reunion");
        Pacientes.remove(2);
        for (i = 0; i < Pacientes.size(); i++) {
          System.out.println("Paciente " + i + " ;");
          for (j = 0; j < Pacientes.get(i).size(); j++) {
            System.out.println(Pacientes.get(i).get(j) + "");
          }
        }
      } else if (respuesta_valida == false || (!respuesta.equalsIgnoreCase("N") && !respuesta.equalsIgnoreCase("S"))) {
        respuesta_valida = false;
        System.out.println("La respuesta no es valida, Porfavor repita su respuesta");
        respuesta = teclado.nextLine();

      }

    }
  }

}
