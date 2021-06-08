import java.util.Scanner;

public class Ejercicio5_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        int selector = 0;
        do {
            System.out.println("Dient un numero, digues quin tipus d'operacio vol fer:");
            System.out.println("1-Suma de 2 números");
            System.out.println("2-Resta de 2 números");
            System.out.println("3-Multiplicació de 2 números");
            System.out.println("4-Divisió de 2 números");
            System.out.println("5-Acabar");
            selector = teclado.nextInt();

            switch (selector) {
                case 1:
                    System.out.println("1-Suma de 2 números");
                    System.out.println("Digues el primer numero");
                    numero1 = teclado.nextInt();
                    System.out.println("Digues el segon numero");
                    numero2 = teclado.nextInt();
                    resultado = numero1 + numero2;
                    System.out.println("El resultat es: " + resultado);
                    selector = 0;
                    break;
                case 2:
                    System.out.println("2-Resta de 2 números");
                    System.out.println("Digues el primer numero");
                    numero1 = teclado.nextInt();
                    System.out.println("Digues el segon numero");
                    numero2 = teclado.nextInt();
                    resultado = numero1 - numero2;
                    System.out.println("El resultat es: " + resultado);
                    selector = 0;
                    break;
                case 3:
                    System.out.println("3-Multiplicació de 2 números");
                    System.out.println("Digues el primer numero");
                    numero1 = teclado.nextInt();
                    System.out.println("Digues el segon numero");
                    numero2 = teclado.nextInt();
                    resultado = numero1 * numero2;
                    System.out.println("El resultat es: " + resultado);
                    selector = 0;
                    break;
                case 4:
                    System.out.println("4-Divisió de 2 números");
                    System.out.println("Digues el primer numero");
                    numero1 = teclado.nextInt();
                    System.out.println("Digues el segon numero");
                    numero2 = teclado.nextInt();
                    resultado = numero1 / numero2;
                    System.out.println("El resultat es: " + resultado);
                    selector = 0;
                    break;
                case 5:
                    System.out.println("gracias per acabar amb nosaltres");
                    break;
                default:
                    System.out.println("El numero/valor eleguido son incorrectos");
                    selector = 0;
                    break;
            }

        } while (selector != 5);

    }

}
