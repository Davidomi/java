
/*1- Genereu un programa per a la consulta d'una metgessa on el secretari s'encarrega d'organitzar les visites diàries d’aquesta.
Heu de fer un programa que a través de ArrayList pugui afegir els noms dels pacients en l'ordre en què farà les visites del dia a 
mesura que van arribant aquests pacients.
L'ordre és el de l'arribada, però es pot donar el cas que el secretari pugui colar algun pacient a la llista. Inicialment només 
agafem 4 pacients i a mesura que la metgessa vagi fent visites n’anirem afegint més.
Quan la metgessa tracta a un pacient heu de mostrar el missatge "la metgessa tracta ara al pacient X" i seguidament el 
secretari afegirà un nou pacient a la llista fins a un màxim de 10 en tot el dia.
El programa ha d'acabar quan ja no quedin més pacients per visitar (Introdueix un nom en blanc) o quan arriba al nombre 
màxims de pacients que és de 10. La metgessa no comença a visitar fins que no han arribat els 4 primers pacients. A partir de 
llavors, cada vegada que acaba un n'arriba un altre.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8_1 {
    public static void main(String[] args) {
        int i;
        Scanner teclado = new Scanner(System.in);
        String paciente;// aqui señalizamos de que tipo va entrar en la array list
        String respuesta;
        ArrayList consulta = new ArrayList();// generamos una arraylist unidimensional
        boolean acabada = false;

        for (i = 0; i < 4; i++) {// ponemos el nombre de los 4 primeros pacientes
            System.out.println("Porfavor introduzca el nombre del/de la paciente: " + i);
            System.out.println("Nombre;");
            paciente = teclado.nextLine();
            consulta.add(i, paciente);// añadimos una fila a la array con 'i' como el posicion donde esta
            // y 'paciente' con el nombre que tendra
        }
        for (i = 0; i < 10 && acabada == false; i++) {// pasaremos por toda la arrayList hasta que lleguemos a tener 1o
                                                      // valores
            // o el booleano sea true
            System.out.println("La doctora ha acabado con algun paciente? " + consulta.remove(0));// .remove sirvew para
                                                                                                  // eliminar el valor
                                                                                                  // que esta marcado
                                                                                                  // entre parentesis
            System.out.println(
                    "A venido un nuevo cliente a la consulta? El cual quieras añadirlo a la ultima posicion? S/N");
            System.out.println("En el caso de ser positivo porfavor introduzca su nombre por teclado.");
            System.out.println(
                    "En el caso de no querer intoducir ningun cliente mas, porfavor pulse ENTER sin escribir nada, gracias.");
            respuesta = teclado.nextLine();
            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Como se llama el nuevo cliente?");
                paciente = teclado.nextLine();
                consulta.add(paciente);

            } else if (respuesta.equalsIgnoreCase("N")) {
                System.out.println("Como se llama el nuevo cliente?");
                paciente = teclado.nextLine();
                consulta.add(0, paciente);

            } else if (respuesta.equalsIgnoreCase("")) {
                acabada = true;
                System.out.println("No hay, mas pacientes");
            }

        }
        System.out.println("Ya se ha acabado la consulta por hoy");

    }
}
