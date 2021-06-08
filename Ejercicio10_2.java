import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ejercicio10_20 {
    Static Scannersc = new Scanner(System.in);

    public static void main(String[] args) {
        File Ruta = Ruta();
        int numalumnos = alumnos();
        Datos(numalumnos, ruta);
        File notas = PedirRuta();
        String nombre = Nombre();
        String apellido = Apellido();
        String modulo = Modulo();
        int nota = ComprobarDatos(notas, nombre, apellido, modulo);
        if (nota >= 0) {
            System.out.println(nombre + ", " + apellido + ", " + nota);
        } else {
            System.out.println("No se ha encontrado al alumno.");
        }
        CalcularMedia();
        File notas2 = PedirRuta();
    }

    public static File Ruta() {
        System.out.println("Ruta");
        String respuesta = sc.nextLine();
        File Ruta = new File(respuesta + "/notas.txt");
        return Ruta;
    }

    public static int alumnos() {
        System.out.println("alumnos");
        int alumnos = sc.nextInt();
        return alumnos;

    }

    public static void datos(int numalumnos, File ruta) {
        try {

            PrintStream ps = new PrintStream(notas);
            ps.println("NOM COGNOM M1 M2 M3 M4 M5 M6 M7 M8 M9 M10 M11");

            for (int i = 1; i <= alumnos; i++) {
                System.out.println("nombre");
                String nombre = sc.nextLine();
                System.out.println("apellido");
                String apellido = sc.nextLine();
                ps.print(nombre + " " + apellido);
                for (int j = 1; j <= 11; j++) {
                    System.out.println("nota M" + j);
                    int nota = sc.nextInt();
                    ps.print(" " + nota);
                }
                sc.nextLine();
                ps.print("\n");
            }
        } catch (Exception ex) {
            System.out.println("error " + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception ex2) {
                System.out.println("error: " + ex2.getMessage());
            }
        }

    }

    public static String Nombre() {

        System.out.println("nombre ");
        String nombre = sc.nextLine();
        return nombre;
    }

    public static String Apellido() {

        System.out.println("apellido");
        String apellido = sc.nextLine();
        return apellido;
    }

    public static String Modulo() {

        System.out.println("modulo ");
        String modulo = sc.nextLine();
        return modulo;
    }

    public static int ComprobarDatos(File notas, String nombre, String apellido, String modulo) {

        int num;

        try {
            Scanner sc2 = new Scanner(notas);
            for (int i = 2; i < 13; i++) {
                if (modulo.equals(sc2.next())) {
                    int posnota = i;
                    break;
                }
            }

            while (sc2.hasNextLine()) {

                if (nombre.equals(sc2.next())) {
                    if (apellido.equals(sc2.next())) {
                        for (int j = 0; j < posnota; j++) {
                            sc2.next();
                        }
                        return sc2.nextInt();
                    }
                }
                sc2.nextLine();
            }
            sc2.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public static void CalcularMedia() {

        int media[] = new int[11];

        try {
            File notas = PedirRuta();
            Scanner s = new Scanner(notas);
            String linia = s.nextLine();

            while (s.hasNextLine()) {
                System.out.println("holas");
                linia = s.nextLine();
                String lin[] = linia.split(" ");
                int num = 0;
                num++;
                for (int i = 0; i < 11; i++) {

                    System.out.println("holas");
                    int nota = Integer.parseInt(lin[i + 2]);
                    System.out.println(nota);
                    media[i] = media[i] + nota;
                }
            }
            for (int j = 0; j < 11; j++) {
                System.out.println(" media  M" + (j + 1) + "  " + media[j] / num);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ficheros2_3.class.getName()).log(Level.SEVERE, null, ex);

        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
    }

    public static File PedirRuta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta donde se encuentra el archivo");
        String ruta = sc.nextLine();
        File f = new File(ruta + "/notas.txt");
        return f;
    }

    public static void Escribirdatos(File notas) {

        try {
            System.out.println(" olvidado.");
            PrintWriter pw = new PrintWriter(new FileOutputStream(notas, true));
            String nombre = sc.nextLine();
            System.out.println("apellido");
            String apellido = sc.nextLine();
            pw.println(nombre + " " + apellido);
            for (int j = 1; j <= 11; j++) {
                System.out.println(" nota M " + j);
                int nota = sc.nextInt();
                pw.println(" " + nota);
            }
        } catch (IOException ioe) {
            System.err.println("Exception: " + ioe.getMessage());
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje: " + ex2.getMessage());
            }
        }

    }

}
