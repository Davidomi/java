
import java.util.Scanner;

public class Ejercicio5_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numparti = 0;
        float distancia = 0;
        float suma = 0;
        float gran = 0;
        float petit = 1000000;

        System.out.println("Quants participants n'hi han?");
        numparti = teclado.nextInt();

        int i;
        for (i = 0; i < numparti; i++) {
            System.out.println("Quina distancia ha fet cadascun?");
            distancia = teclado.nextFloat();
            suma = suma + distancia;
            if (gran < distancia)
                gran = distancia;

            if (petit > distancia)
                petit = distancia;
        }
        float media = suma / numparti;

        System.out.println("El numero més petit és " + petit);
        System.out.println("El numero més gran és " + gran);
        System.out.println("La suma de tots els valors es " + suma);
        System.out.println("La mitjana es " + media);

    }

}
