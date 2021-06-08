/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica4;

import java.util.*;

/**
 *
 * @author montt
 */
public class practica {

    static String nomusu[]; //Array para almacenar el nombre de usuario
    static String nombre[]; //Array para almazenar el nombre real del usuario
    static String sexe[]; //Array para poner el genero del usuario
    static int edat[]; //Array para poner la edad del usuario
    static int alcada[]; //Array para poner la altura del usuario
    static String milloraficio[]; //Array para poner las aficiones del usuario
    static int distancia[]; //Array para poner la distacnai a la que está respecto a ti del usuario

    static String genero;
    static int numcandi; //Variable para determinar el numero de candidatos deseados y poder usarlo en todos los modulos sin necesidad de repetirlo.
    static int opcion = 0;
    static ArrayList<Integer> indices = new ArrayList<Integer>();

    public static void main(String[] args) {
        IntroducirDatos(); //Modulo para introducir los datos de los candidatos
        MostrarCandidatos(); //Mostrar a los candidatos
        SeleccionarPreferencias();  //Mostrar las preferencias después de haber filtrado los datos
        //EelegirPareja(); // Elegir la pareja e imprimirla
    }

    public static void IntroducirDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos candidatos quieres?");
        numcandi = sc.nextInt();

        nomusu = new String[numcandi];
        nombre = new String[numcandi];
        sexe = new String[numcandi];
        edat = new int[numcandi];
        alcada = new int[numcandi];
        milloraficio = new String[numcandi];
        distancia = new int[numcandi];

        for (int i = 0; i < numcandi; i++) {
            sc.nextLine();
            System.out.println("Esribe el nombre de usuario del candidato " + (i + 1) + ":");
            nomusu[i] = sc.nextLine();
            
            

            System.out.println("Escriu el nom real del candidat " + (i + 1) + ":");
            nombre[i] = sc.nextLine();

            System.out.println("Di el género del candidato " + (i + 1) + ":");
            sexe[i] = sc.nextLine();

            System.out.println("Di la edad del candidato " + (i + 1) + ":");
            edat[i] = sc.nextInt();

            System.out.println("Di l altura del candidato " + (i + 1) + " en centimetros:");
            alcada[i] = sc.nextInt();

            System.out.println("Di cual es la mejor aficion del candidato " + (i + 1) + ":");
            milloraficio[i] = sc.nextLine();
            sc.nextLine();

            System.out.println("Di la distancia(Km) a la que está el candidato " + (i + 1) + " respecto a ti:");
            distancia[i] = sc.nextInt();
        }
    }

    public static void MostrarCandidatos() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numcandi; i++) {
            System.out.println("Candidato " + (i + 1) + ". Nombre de usuario: " + nomusu[i] + ". Nombre real: " + nombre[i] + ". Edat: " + edat[i] +
                    ". Alzada: " + alcada[i] + ". Mejor aficion: " + milloraficio[i] + ". Distancia a la que está respecto a ti: " + distancia[i]);
        }

        sc.nextLine();
    }

    public static void SeleccionarPreferencias() {
        Scanner sc = new Scanner(System.in);

        boolean menu = true;

        System.out.println("Ahora vamos a elegir tu pareja ideal.");

        System.out.println("Di tu preferencia sexual (mujer, hombre, ambos): ");
        genero = sc.nextLine();

        System.out.println("Elige una sola opción del siguiente menú.");
        System.out.println("1. Edad");
        System.out.println("2. Altura");
        System.out.println("3. Aficion");
        System.out.println("4. Distancia");
        opcion = sc.nextInt();

        while (menu == true) {
            if (opcion == 1) {
                boolean legal = false;
                int edadmin = 0;
                int edadmax = 0;

                while (legal == false) {
                    System.out.println("Que edad minima quieres?");
                    edadmin = sc.nextInt();

                    if (edadmin < 18) {
                        System.out.println("La edad minima por defecto es 18. Por favor, introduzca otra edad minima.");
                    } else {
                        System.out.println("Que edad maxima quieres?");
                        edadmax = sc.nextInt();

                        if (edadmax < edadmin) {
                            System.out.println("La edad maxima es menor a la edad minima. Intentelo de nuevo.");
                        } else {
                            if (edadmax < 18) {
                                System.out.println("La edad minima es de 18. Por favor, introduzca otra edad maxima.");
                            } else {
                                legal = true;
                            }
                        }
                    }
                    FiltrarEdad(edadmin, edadmax);
                    menu = false;
                }
            } else if (opcion == 2) {
                boolean p = false;
                int altmin = 0;
                int altmax = 0;

                while (p == false) {
                    System.out.println("Indica la altura minima en cm que quieres:");
                    altmin = sc.nextInt();

                    if (altmin < 140) {
                        System.out.println("La altura mínima es de 140cm. Prueba de nuevo.");
                    } else {
                        System.out.println("Indica la altura maxima");
                        altmax = sc.nextInt();

                        if (altmax < altmin) {
                            System.out.println("La altura maxima es menor que la altura minima. Vuelve a probar.");
                        } else {
                            if (altmax < 140) {
                                System.out.println("La altura minima es de 140. Intente de nuevo.");
                            } else {
                                p = true;
                            }
                        }
                    }
                }
                FiltrarAltura(altmin, altmax);
                menu = false;

            } else if (opcion == 3) {
                System.out.println("Indica tu afición preferida");
                String aficionp = sc.nextLine();
                FiltrarAficion(aficionp);
                menu = false;

            } else if (opcion == 4) {
                System.out.println("Indica la distancia maxima: ");
                int dismax = sc.nextInt();
                FiltrarDistancia(dismax);
                menu = false;

            } else {
                System.out.println("La opcion escogida es erronea, vuelve a elegir.");
            }
        }
    }

    public static int[] sortear(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            sortear(A, izq, m);
            sortear(A, m + 1, der);
            sort(A, izq, m, der);
        }
        return A;
    }

    public static void sort(int A[], int izq, int m, int der) {

        int i, j, k;
        int[] B = new int[A.length];
        for (i = izq; i <= der; i++) {
            B[i] = A[i];
        }
        i = izq;
        j = m + 1;
        k = izq;
        while (i <= m && j <= der) {
            if (B[i] <= B[j]) {
                A[k++] = B[i++];
            } else {
                A[k++] = B[j++];
            }
        }
        while (i <= m) {
            A[k++] = B[i++];
        }
    }

    public static void FiltrarEdad(int edadmax, int edadmin) {
        Scanner sc = new Scanner(System.in);

        int filtraredad[] = new int[edat.length];
        int contador = 0;
        int repetidos = 0;

        for (int i = 0; i < edat.length; i++) {
            if (edat[i] >= edadmin && edat[i] <= edadmax) {
                filtraredad[i] = edat[i];
                contador++;
            }
        }
        sortear(edat, 0, edat.length - 1);

        for (int j = 0; j < contador; j++) {
            if (j > 0) {
                if (filtraredad[j - 1] == filtraredad[j]) {
                    repetidos++;
                } else {
                    repetidos = 0;
                }
                Edad(filtraredad[j], repetidos);
            } else {
                Edad(filtraredad[j], repetidos);
            }
        }
    }

    public static void Edad(int posicionedad, int repetidos) {
        int ee = -1;
        int contrep = 0;

        for (int a = 0; a < edat.length; a++) {
            if (edat[a] == posicionedad) {
                if (contrep == repetidos) {
                    ee = a;
                    if (sexe[ee].equalsIgnoreCase(genero)) {
                        System.out.println(ee + ". Usuario: " + nomusu[ee] + ", Nombre real: " + nombre[ee] + ", Edad: " + edat[ee] +
                                ", Genero: " + sexe[ee] + ". Altura: " + alcada[ee] + ", Aficion: " + milloraficio[ee] + ", Distancia: " + distancia[ee]);
                        contrep++;
                        indices.add(ee);
                    }
                } else {
                    contrep++;
                }
            } else {
                contrep = 0;
            }
        }
    }

    public static void FiltrarAltura(int altmin, int altmax) {
        int filtraraltura[] = new int[alcada.length];
        int contador = 0;
        int repetidor = 0;

        for (int e = 0; e < alcada.length; e++) {
            if (alcada[e] >= altmin && alcada[e] <= altmax) {
                filtraraltura[e] = alcada[e];
                contador++;
            }
        }

        sortear(filtraraltura, 0, filtraraltura.length - 1);
        System.out.println(Arrays.toString(filtraraltura));

        for (int q = 0; q < contador; q++) {
            if (q > 0) {
                if (filtraraltura[q - 1] == filtraraltura[q]) {
                    repetidor++;
                } else {
                    repetidor = 0;
                }
                Altura(filtraraltura[q], repetidor);
            } else {
                Altura(filtraraltura[q], repetidor);
            }
        }
    }

    public static void Altura(int posicionalt, int repetidor) {
        int ee = -1;
        int contrep = 0;

        for (int w = 0; w < alcada.length; w++) {
            if (alcada[w] == posicionalt) {
                if (contrep == repetidor) {
                    ee = w;
                    if (sexe[ee].equalsIgnoreCase(genero)) {
                        System.out.println(ee + ". Usuario: " + nomusu[ee] + ", Nombre real: " + nombre[ee] + ", Edad: " + edat[ee] +
                                ", Genero: " + sexe[ee] + ". Altura: " + alcada[ee] + ", Aficion: " + milloraficio[ee] + ", Distancia: " + distancia[ee]);
                        contrep++;
                        indices.add(ee);
                    }
                } else {
                    contrep++;
                }
            } else {
                contrep = 0;
            }
        }
    }

    public static void FiltrarAficion(String aficionp) {
        String filtraraficion[] = new String[milloraficio.length];
        int contador = 0;
        int repetido = 0;

        for (int z = 0; z < milloraficio.length; z++) {
            if (milloraficio[z].equalsIgnoreCase(aficionp)) {
                filtraraficion[z] = milloraficio[z];
                contador++;
            }
        }

        for (int u = 0; u < contador; u++) {
            if (u < 0) {
                if (filtraraficion[u - 1] == filtraraficion[u]) {
                    repetido++;
                } else {
                    repetido = 0;
                }
                Aficion(filtraraficion[u], repetido);
            } else {
                Aficion(filtraraficion[u], repetido);
            }
        }
    }

    public static void Aficion(String posicionfil, int repetido) {
        int ee = - 1;
        int contrep = 0;

        for (int k = 0; k < distancia.length; k++) {
            if (milloraficio[k] == posicionfil) {
                if (contrep == repetido) {
                    ee = k;
                    if (sexe[ee].equalsIgnoreCase(genero)) {
                        System.out.println(ee + ". Usuario: " + nomusu[ee] + ", Nombre real: " + nombre[ee] + ", Edad: " + edat[ee] +
                                ", Genero: " + sexe[ee] + ". Altura: " + alcada[ee] + ", Aficion: " + milloraficio[ee] + ", Distancia: " + distancia[ee]);
                        contrep++;
                        indices.add(ee);
                    }
                } else {
                    contrep++;
                }
            } else {
                contrep = 0;
            }
        }
    }

    public static void FiltrarDistancia(int dist) {
        int filtrardistancia[] = new int[distancia.length];
        int contador = 0;
        int repetido = 0;

        for (int h = 0; h < distancia.length; h++) {
            if (distancia[h] <= dist) {
                filtrardistancia[h] = distancia[h];
                contador++;
            }
        }

        sortear(alcada, 0, alcada.length - 1);

        for (int l = 0; l < contador; l++) {
            if (l < 0) {
                if (filtrardistancia[l - 1] == filtrardistancia[l]) {
                    repetido++;
                } else {
                    repetido = 0;
                }
                Distancia(filtrardistancia[l], repetido);
            } else {
                Distancia(filtrardistancia[l], repetido);
            }
        }
    }

    public static void Distancia(int posiciondist, int repetido) {
        int ee = -1;
        int contrep = 0;

        for (int b = 0; b < distancia.length; b++) {
            if (distancia[b] == posiciondist) {
                if (contrep == repetido) {
                    ee = b;
                    if (sexe[ee].equalsIgnoreCase(genero)) {
                        System.out.println(ee + ". Usuario: " + nomusu[ee] + ", Nombre real: " + nombre[ee] + ", Edad: " + edat[ee] +
                                ", Genero: " + sexe[ee] + ". Altura: " + alcada[ee] + ", Aficion: " + milloraficio[ee] + ", Distancia: " + distancia[ee]);
                        contrep++;
                        indices.add(ee);
                    }
                } else {
                    contrep++;
                }
            } else {
                contrep = 0;
            }
        }
    }

    public static void EelegirPareja() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(indices);

        System.out.println("Ahora que has elegido tus preferencias, elige a tu pareja ideal con un numero: ");
        int parejaideal = sc.nextInt();

        if (indices.contains(parejaideal)) {
            System.out.println("Tu pareja ideal es: " + sc.nextLine() + "Usuario: " + nomusu[parejaideal] + sc.nextLine() + "Nombre real: " + nombre[parejaideal] + sc.nextLine()
                    + "Edad: " + edat[parejaideal] + sc.nextLine() + "Genero: " + sexe[parejaideal] + sc.nextLine() + "Altura: " + alcada[parejaideal]
                    + sc.nextLine() + "Aficion: " + milloraficio[parejaideal] + sc.nextLine() + "Distancia respecto a ti: " + distancia[parejaideal]);
        }
    }
}
