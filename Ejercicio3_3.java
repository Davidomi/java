
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio3_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    LocalDateTime locaDate = LocalDateTime.now();
    String Nombre;
    String Tarea;
    int hours = locaDate.getHour();
    int minutes = locaDate.getMinute();
    int seconds = locaDate.getSecond();
    System.out.println("Porfavor indique su nombre.");
    Nombre = teclado.nextLine();
    System.out.println("Porfavor introduzca la tarea que a empleado.");
    Tarea = teclado.nextLine();

    System.out.printf(
        "Hoy " + Nombre + " ha hecho la tarea: " + Tarea + " a las; " + hours + ":" + minutes + ":" + seconds + " Hs");

  }

}
