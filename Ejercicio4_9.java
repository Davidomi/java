import java.util.Scanner;

public class Ejercicio4_9 {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int edad;
        String nom;
        boolean repetidor;

        System.out.println("Por favor indique el nombre del alumno.");

        nom = teclado.nextLine();

        System.out.println("Inidique la seva edad");

        edad = teclado.nextInt();

        System.out.println(nom + " Es repetidor de algun curso?");

        repetidor = teclado.nextBoolean();

        if (edad > 17) {
            System.out.println(nom + " de " + edad + " anys, ja ha acabat la ESO");
        }

        switch (edad) {
            case 12:
                if (!repetidor) {
                    System.out.println(nom + " de " + edad + " anys  hauria de estar en 1º de la ESO ");
                } else if (repetidor) {
                    System.out.println(nom + " de " + edad + " anys es reperidor y no pot estar en la ESO ");
                }
                break;

            case 13:
                if (!repetidor) {
                    System.out.println(nom + " de " + edad + " anys  hauria de estar en 2º de la ESO ");
                } else if (repetidor) {
                    System.out.println(nom + " de " + edad + " anys  hauria de estar en 1º de la ESO");
                }
                break;
            case 14:
                if (!repetidor) {
                    System.out.println(nom + " de " + edad + " anys  hauria de estar en 2º de la ESO ");
                } else if (repetidor) {
                    System.out.println(nom + " de " + edad + " anys  hauria de estar en 1º de la ESO");
                }
                break;
            case 15:
                if (!repetidor) {
                    System.out.println(nom + " de " + edad + " anys  hauria de estar en 3º de la ESO ");
                } else if (repetidor) {
                    System.out.println(nom + " de " + edad + " anys  hauria de estar en 2º de la ESO");
                }
                break;
            case 16:
                if (!repetidor) {
                    System.out.println(nom + " de " + edad + " anys  hauria de estar en 4º de la ESO ");
                } else if (repetidor) {
                    System.out.println(nom + " de " + edad + " anys  hauria de estar en 3º de la ESO");
                }
                break;
            case 17:
                if (!repetidor) {
                    System.out.println(nom + " de " + edad + " anys, ja ha acabat la ESO");
                } else if (repetidor) {
                    System.out.println(nom + " de " + edad + " anys  hauria de estar en 4º de la ESO");
                }
                break;

        }
    }

}
