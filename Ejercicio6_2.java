
/*2-Escriu un programa que demani un text per teclat i mostri amb un missatge per pantalla el caràcter de la 3a lletra del missatge indicant també si és o no un dígit.
Indica amb SI o NO que el missatge acaba amb el text “nt”.
Finalment mostra el text del missatge entre la 4a lletra i la 10a.
Useu mètodes de la classe String.
Ex: "Ets un indecent"
	 "La 3a lletra del missatge és la: ‘s’ i NO és un dígit."
 "El missatge acaba amb "nt": SI"
 "un ind"*/
import java.util.Scanner;

public class Ejercicio6_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto = "";
        String nt = "";
        char caracter;
        boolean nl;
        String fin;
        System.out.println("Porfavor ingrese un texto;");
        texto = teclado.nextLine();

        caracter = texto.charAt(2);

        nl = Character.isDigit(caracter);
        if (nl) {
            System.out.println("El tercer caracter es " + caracter + " un NUMERO");
        } else {
            System.out.println("El tercer caracter es " + caracter + " una LETRA");
        }

        if (texto.endsWith("nt")) {// endsWhith sirve para ver si acaba en lo que marcamos entre los parentesis.
            System.out.println("El mensaje acaba en NT");
        } else {
            System.out.println("El mensaje NO acaba en NT");
        }
        fin = texto.substring(3, 9);// substring es para extrtaer la parte del tecto que marcamos entre las
                                    // parentesis.
        System.out.println("Entre el caracter y 9 hay; " + fin);

    }
}
