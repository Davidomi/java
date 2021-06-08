
import java.util.Scanner;

public class Ejercicio4_12 {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        String sesion;
        boolean abono;
        float abonopreu;

        int edad;
        float entrada;
        float total;
        System.out.println("Que dia quieres tener la sesion?");
        sesion = teclado.nextLine();
        System.out.println("Que edad tienes?");
        edad = teclado.nextInt();
        System.out.println("Tienes abono? (true/false)");
        abono = teclado.nextBoolean();

        switch (sesion) {
            case "Lunes":
                entrada = 6;

                if (abono) {
                    abonopreu = (float) 1.5;

                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = (float) (entrada - abonopreu);
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }

                } else if (!abono) {
                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = entrada;
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }
                }
                break;

            case "Martes":
                entrada = 6;

                if (abono) {
                    abonopreu = (float) 1.5;

                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = (float) (entrada - abonopreu);
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }

                } else if (!abono) {
                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = entrada;
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }
                }
                break;
            case "Miercoles":
                entrada = 6;

                if (abono) {
                    abonopreu = (float) 1.5;

                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = (float) (entrada - abonopreu);
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }

                } else if (!abono) {
                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = entrada;
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }
                }
                break;
            case "Jueves":
                entrada = 6;

                if (abono) {
                    abonopreu = (float) 1.5;

                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = (float) (entrada - abonopreu);
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }

                } else if (!abono) {
                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = entrada;
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }
                }
                break;
            case "Viernes":
                entrada = 6;

                if (abono) {
                    abonopreu = (float) 1.5;

                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = (float) (entrada - abonopreu);
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }

                } else if (!abono) {
                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = entrada;
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }
                }
                break;
            case "Sabado":
                entrada = 8;

                if (abono) {
                    abonopreu = (float) 2;

                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = (float) (entrada - abonopreu);
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }

                } else if (!abono) {
                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = entrada;
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }
                }
                break;
            case "Domingo":
                entrada = 8;

                if (abono) {
                    abonopreu = (float) 2;

                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - abonopreu);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = (float) (entrada - abonopreu);
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }

                } else if (!abono) {
                    if (edad < 5 || edad > 65) {
                        total = (float) (entrada - 1.5);
                        System.out.println("La sesion en la que tiene la pelicula es " + sesion
                                + " y su entrada cuesta " + total
                                + "  ya que usted cumple la norma de que tiene abono y entra en los limites de edad");
                    } else if (edad > 5 || edad < 65) {
                        total = entrada;
                        System.out
                                .println("La sesion en la que tiene la pelicula es " + sesion + " y su entrada cuesta "
                                        + total + "  ya que usted cumple la norma de que tiene abono");
                    }
                }
                break;

        }

    }

}
