import java.util.Scanner;

public class Ejercicio4_7 {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int velocidad;
        int senyal;
        System.out.println("Por favor indique su velocidad");

        velocidad = teclado.nextInt();

        System.out.println("Inidique la señal de la via");

        senyal = teclado.nextInt();

        if (velocidad < senyal) {
            System.out.println("La seva velocitat es correcte en aquest tram de via.");
        }

        if (senyal > 120) {
            System.out.println("No hi han senyals superiors a 120 km/h");
        }

        switch (senyal) {
            case 30:
                if (velocidad > 30 && velocidad <= 50) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 0 punts i pagaràs una multa de 100 euros");
                } else if (velocidad > 50 && velocidad <= 60) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 2 punts i pagaràs una multa de 300 euros");
                } else if (velocidad > 60 && velocidad <= 70) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 4 punts i pagaràs una multa de 400 euros");
                } else if (velocidad > 70 && velocidad <= 80) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 500 euros");
                } else if (velocidad > 80) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 600 euros");
                }
                break;
            case 40:
                if (velocidad > 40 && velocidad <= 60) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 0 punts i pagaràs una multa de 100 euros");
                } else if (velocidad > 60 && velocidad <= 70) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 2 punts i pagaràs una multa de 300 euros");
                } else if (velocidad > 70 && velocidad <= 80) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 4 punts i pagaràs una multa de 400 euros");
                } else if (velocidad > 80 && velocidad <= 90) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 500 euros");
                } else if (velocidad > 90) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 600 euros");
                }
                break;
            case 50:
                if (velocidad > 50 && velocidad <= 70) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 0 punts i pagaràs una multa de 100 euros");
                } else if (velocidad > 70 && velocidad <= 80) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 2 punts i pagaràs una multa de 300 euros");
                } else if (velocidad > 80 && velocidad <= 90) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 4 punts i pagaràs una multa de 400 euros");
                } else if (velocidad > 90 && velocidad <= 100) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 500 euros");
                } else if (velocidad > 100) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 600 euros");
                }
                break;
            case 60:
                if (velocidad > 60 && velocidad <= 90) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 0 punts i pagaràs una multa de 100 euros");
                } else if (velocidad > 90 && velocidad <= 110) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 2 punts i pagaràs una multa de 300 euros");
                } else if (velocidad > 110 && velocidad <= 120) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 4 punts i pagaràs una multa de 400 euros");
                } else if (velocidad > 120 && velocidad <= 130) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 500 euros");
                } else if (velocidad > 130) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 600 euros");
                }
                break;
            case 70:
                if (velocidad > 70 && velocidad <= 100) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 0 punts i pagaràs una multa de 100 euros");
                } else if (velocidad > 100 && velocidad <= 120) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 2 punts i pagaràs una multa de 300 euros");
                } else if (velocidad > 120 && velocidad <= 130) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 4 punts i pagaràs una multa de 400 euros");
                } else if (velocidad > 130 && velocidad <= 140) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 500 euros");
                } else if (velocidad > 140) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 600 euros");
                }
                break;
            case 80:
                if (velocidad > 80 && velocidad <= 110) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 0 punts i pagaràs una multa de 100 euros");
                } else if (velocidad > 110 && velocidad <= 130) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 2 punts i pagaràs una multa de 300 euros");
                } else if (velocidad > 130 && velocidad <= 140) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 4 punts i pagaràs una multa de 400 euros");
                } else if (velocidad > 140 && velocidad <= 150) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 500 euros");
                } else if (velocidad > 150) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 600 euros");
                }
                break;
            case 90:
                if (velocidad > 90 && velocidad <= 120) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 0 punts i pagaràs una multa de 100 euros");
                } else if (velocidad > 120 && velocidad <= 140) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 2 punts i pagaràs una multa de 300 euros");
                } else if (velocidad > 140 && velocidad <= 150) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 4 punts i pagaràs una multa de 400 euros");
                } else if (velocidad > 150 && velocidad <= 160) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 500 euros");
                } else if (velocidad > 160) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 600 euros");
                }
                break;
            case 100:
                if (velocidad > 100 && velocidad <= 130) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 0 punts i pagaràs una multa de 100 euros");
                } else if (velocidad > 130 && velocidad <= 150) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 2 punts i pagaràs una multa de 300 euros");
                } else if (velocidad > 150 && velocidad <= 160) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 4 punts i pagaràs una multa de 400 euros");
                } else if (velocidad > 160 && velocidad <= 170) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 500 euros");
                } else if (velocidad > 170) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 600 euros");
                }
                break;
            case 110:
                if (velocidad > 110 && velocidad <= 140) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 0 punts i pagaràs una multa de 100 euros");
                } else if (velocidad > 140 && velocidad <= 160) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 2 punts i pagaràs una multa de 300 euros");
                } else if (velocidad > 160 && velocidad <= 170) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 4 punts i pagaràs una multa de 400 euros");
                } else if (velocidad > 170 && velocidad <= 180) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 500 euros");
                } else if (velocidad > 180) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 600 euros");
                }
                break;
            case 120:
                if (velocidad > 120 && velocidad <= 150) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 0 punts i pagaràs una multa de 100 euros");
                } else if (velocidad > 150 && velocidad <= 170) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 2 punts i pagaràs una multa de 300 euros");
                } else if (velocidad > 170 && velocidad <= 180) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 4 punts i pagaràs una multa de 400 euros");
                } else if (velocidad > 180 && velocidad <= 190) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 500 euros");
                } else if (velocidad > 190) {
                    System.out.println("Conduint a" + velocidad + " Km/h amb una limitació de " + senyal
                            + " et descomptaran 6 punts i pagaràs una multa de 600 euros");
                }
                break;
        }

    }

}
