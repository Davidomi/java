
/*4-Escriu un programa que et demani una adreça d'email i comprovi
 amb matches si és formalment vàlida mitjançant l'expressió regular 
 "[^@]+@[^@]+\\.[a-zA-Z]{2,}" . Si no és vàlida, ha de mostrar un 
 missatge d’error i l’ha de tornar a demanar. Posteriorment, modifiqueu
  l'expressió regular i valideu si tenim una adreça acabada en @xtec.cat
 o @gmail.com, sinó ho és, mostreu el missatge de que només accepteu
 adreces d’aquests 2 tipus.
Ex: 34@jr							jr34@outlook.com
	Error, adreça no valida. Torna-la a escriure.		Només acceptem @xtec i @gmail
*/
import java.util.Scanner;

public class Ejercicio6_4 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        String correo;
        boolean fin = false;
        while (!fin) {
            System.out.println("Introduce su correo electronico");

            correo = texto.nextLine();

            if (correo.matches("[^@]+@[^@]+.[a-zA-Z]{2,}")) {

                if (correo.matches("[a-zA-Z0-9]{0,}([.]?[a-zA-Z0-9]{1,})[@](gmail.com|xtec.cat)")) {
                    System.out.print("El correu es correcte");
                    fin = true;
                } else {
                    System.out.println("Nada mas @xtec i gmail");
                }

            } else {
                System.out.println("El correo no es valido. Intentelo de nuevo");

            }
        }
    }

}
