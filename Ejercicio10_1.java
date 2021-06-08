import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class Ejercicio10_1 {
static Scanner sc= new Scanner(System.in);
    
    public static void main(String[] args) {
       File busqueda =new File (args[0]) ;
       busqueda=busq(busqueda);
        carpeta(busqueda);

  }
    public static File busq(File busqueda){
        
    try {

        if (!busqueda.isDirectory()){
            System.out.println("Error!!");
System.out.println("introduce una nueva ruta");
String ruta= sc.nextLine();
busqueda = new File(ruta);
        }

        }
    catch(Exception e) {
            System.out.println("Error al crear la carpeta");
         }
        
        
        return busqueda;    
    }
    public static void carpeta(File busqueda){

        File carpeta [] = busqueda.listFiles();
int directorio =0, archivo=0;

        for (int i = 0 ; i<carpeta.length; i++){
            if(carpeta[i].isDirectory()){
                System.out.println("Es un directorio");
directorio++;
            }else if(carpeta[i].isFile()){
                System.out.println("Es un archivo");
archivo++;
            }
        }
System.out.println("hay " + directorio + " directorios y " +archivo+" archivos");
    }
    public static void menu(File busqueda){
        System.out.println("Que quieres hacer ahora\n 1. Borrar ficheros\n 2.Borrar carpetas \n3.Borrar todo\n0.Nada");
        int respuesta = sc.nextInt();
        switch(respuesta){
            case 1:
caso1(busqueda,busqueda.listFiles());
            break;
            
            case 2:
                 System.out.println("Has elegido borrar directorios");
                 caso2(busqueda,busqueda.listFiles());
             break;

             case 3:
                 System.out.println("Has elegido borrar todo");
                 caso3(busqueda, busqueda.listFiles());


            case 4:

            break;
        }
    }
    public static void caso1(File busqueda, File carpeta[]){
        if(carpeta !=null){
            for (int i=0; i<carpeta.length; i++){
                         if (carpeta[i].isFile()){
                           carpeta[i].delete();
                         }
            }
        }

    }
    public static void caso2(File busqueda, File carpeta[]) {
        if(carpeta !=null){
         for (int i=0; i<carpeta.length; i++){
                      if (carpeta[i].isDirectory()){
                        caso3(carpeta[i], carpeta[i].listFiles());
                        carpeta[i].delete();
                      }
          }

        }
     }

       public static void caso3(File busqueda, File carpeta[]) {
           if(carpeta !=null){
           for (int i=0; i<carpeta.length; i++){
                  if (carpeta[i].isFile()){
                      carpeta[i].delete();
                  } else if (carpeta[i].isDirectory()){
                      caso3(carpeta[i], carpeta[i].listFiles());
                      carpeta[i].delete();
                  }
          }
        }
    }

    
}
