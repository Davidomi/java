import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class DavidDomingoJuradoExamen {
    static Scanner sc = new Scanner(System.in);
    static File ruta;
    static String resp;
    static boolean participantes_correcto = false;
    static int corredores = 0;
    static PrintStream escritura = null;
    static BufferedReader lectura = null;

    public static void main(String[] args) {

        PedirRuta();
        Crear_archivos();
        contarcorredores();
        datos(corredores);
        leer();
    }

    public static File PedirRuta() {
        System.out.println("Introduce la ruta donde se encuentra el archivo");
        resp = sc.nextLine();
        ruta = new File(resp);
        return ruta;

    }

    public static File Crear_archivos() {
        try {

            if (!ruta.isDirectory()) {
                System.out.println("Error!!");
                System.out.println("introduce una nueva ruta");
                resp = sc.nextLine();
                ruta = new File(resp);
            } else {
                ruta = new File(resp, "concursants.txt");
                if (!ruta.exists()) {
                    ruta.createNewFile();
                }
            }

        } catch (Exception e) {
            System.out.println("Error al crear la carpeta");
        }

        return ruta;
    }

    public static int contarcorredores() {

        while (!participantes_correcto) {
            System.out.println("Dime el numero de participantes\n debe ser un valor entre 2 y 20 ");
            corredores = sc.nextInt();
            sc.nextLine();
            if (corredores < 21 && corredores > 1) {
                participantes_correcto = true;
            } else {
                System.out.println("Error");
            }
        }
        return 0;
    }

    public static void datos(int corredores) {
        try {
            escritura = new PrintStream(ruta);

            escritura.println("NOMBRE APELLIDO EDAD COCHE MODELO NUMERO RETIRO");
            for (int i = 0; i < corredores; i++) {
                escritura.print(nombre() + " ");
                escritura.print(apellido() + " ");
                escritura.print(edad() + " ");
                escritura.print(coche() + " ");
                escritura.print(modelo() + " ");
                escritura.print(numero() + " ");
                escritura.print(retiro() + " ");
                escritura.println();
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public static String nombre() {
        String nombre = "";
        System.out.println("Nombre;");
        nombre = sc.nextLine();

        return nombre;
    }

    public static String apellido() {
        String apellido = "";
        System.out.println("Apellido;");
        apellido = sc.nextLine();

        return apellido;
    }

    public static int edad() {
        int edad = 0;
        System.out.println("Edad;");
        edad = sc.nextInt();
        sc.nextLine();
        return edad;
    }

    public static String coche() {
        String coche = "";
        System.out.println("Coche");
        coche = sc.nextLine();

        return coche;
    }

    public static String modelo() {
        String modelo = "";
        System.out.println("Modelo");
        modelo = sc.nextLine();

        return modelo;
    }

    public static int numero() {
        int numero = 0;
        System.out.println("Numero");
        numero = sc.nextInt();
        sc.nextLine();
        return numero;

    }

    public static String retiro() {
        String retiro = "";
        boolean retirado = false;

        while (retirado == false) {
            System.out.println("Retirado?");
            retiro = sc.nextLine();

            if (!retiro.equalsIgnoreCase("NO") && !retiro.equalsIgnoreCase("SI")) {
                retirado = false;
                System.out.println("Porfavor indique su respuesta con SI o No");
            } else if (retiro.equalsIgnoreCase("NO") || retiro.equalsIgnoreCase("SI")) {
                retirado = true;
            }
        }

        return retiro;
    }

    public static void leer() {

        String l = "";

        try {

            lectura = new BufferedReader(new FileReader(ruta));
            while ((l = lectura.readLine()) != null) {
                String[] pilotos = l.split(" ");
                if (pilotos[6].equalsIgnoreCase("no")) {
                    System.out.println("VeloMAX" + pilotos[0]);
                    float VeloMax = sc.nextFloat();
                    System.out.println("Vueltas " + pilotos[0]);
                    int vueltas = sc.nextInt();

                    escritura.println("Piloto " + pilotos[5]);
                    escritura.println("VeloMAX " + VeloMax);
                    escritura.println("Vueltas" + vueltas);
                    escritura.println();

                    npanore++;
                    float mayorvelocidad = 0;
                    if (mayorvelocidad < VeloMax) {
                        mayorvelocidad = VeloMax;
                    }
                }
            }
            System.out.println("Mayor velocidad" + mayorvelocidad);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}