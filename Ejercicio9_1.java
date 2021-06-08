
import java.util.Scanner;

public class Ejercicio9_1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int distancia = 0, respuesta = 0;

    System.out.println(
        "Bienvenid@ a nuestro programa lo primero que todo indique en nuestro primer vehiculo  cuanta distancia puede hacer.");
    System.out.println("Cuantos vehiculos vas ha a;adir?");//decimos la cantidad de vehiculos que tenemos
    distancia = sc.nextInt();
    sc.nextLine();
    int Kilometros_Posibles[] = new int[distancia + 1];
    Kilometros_Posibles[0] = 000;

    for (int i = 1; i <= distancia; i++) {

      System.out.println("Cauntos kilometros al dia puede hacer el vehiculo n " + i);
      Kilometros_Posibles[i] = sc.nextInt();// decimos los km que hace cada vehiculos
    }
    respuesta = -1;

    while (respuesta != 0) {
      System.out.println("Que queiere hacer o que vehiculo quiere coger?");
      System.out.println("0.-Salir del programa");

      for (int i = 1; i <= distancia; i++) {
        System.out.println(i + ".- " + Kilometros_Posibles[i]);//mostramos todas las distancias de los vehiculos
      }
      respuesta = sc.nextInt();

      if (respuesta == 0) {
        System.out.println("Se ha hacabado el programa");// salimos porque hemos elegido el vehiculo 0

      } else if (respuesta != 0 || respuesta <= Kilometros_Posibles.length) {
        System.out.println("Cuantos dias vas ha usar el vehiculo?");
        int dias = sc.nextInt();//decimos los dias que va ha hacer el conductor
        int km_disponible = Kilometros_Posibles[respuesta] * dias;
        int km_total_user = 0;
        for (int i = 1; i <= dias; i++) {
          System.out.println("Cuantos kilometros vas a hacer el dia " + i);
          int km_dia = sc.nextInt();//decimos los kilometros que hace cada dia
          if (km_dia > Kilometros_Posibles[respuesta]) {
            System.out.println("El dia " + i + " te has pasado de distancia OJO");
          }
          km_total_user = km_dia + km_total_user;//km totales

        }
        if (km_disponible < km_total_user) {
          System.out.println("Has hecho mas kilometros de los que podias hacer");

        } else if (km_disponible > km_total_user) {
          System.out.println("Has hecho menos kilometros de los que deberias");

        } else if (km_disponible == km_total_user) {
          System.out.println("Has hecho los kilometros justos");

        }

        
      }
    }
  }

}
