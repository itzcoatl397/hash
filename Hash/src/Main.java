import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int opt;
        Hash hash = new Hash();
        Scanner entrada = new Scanner(System.in);
        do {

            System.out.println("\t\tMenu hash");
            System.out.println("\t\t1.-Generar Vector");

            System.out.println("\t\t2.-Asignar  direcciones ");
            System.out.println("\t\t3.-Buscar");
            System.out.println("\t\t4.-Salir");

            System.out.println("Selection  an option : ");
            opt = entrada.nextInt();

            switch (opt){

                case  1 -> {
                    hash.Generar();
                    System.out.println("\n\n");
                    hash.Desplegar();
                    System.out.println("\n\nPresiona<Enter> para volver al menu principal");
                    break;
                }

                case  2-> {
                    hash.Direcciones();
                    System.out.println("Presiona<Enter> para volver al menu principal");
                    break;
                }

                case  3-> {
                    hash.Buscar();
                    System.out.println("\n\nPresiona<Enter> para volver al menu principal");
                    break;
                }



            }


        }while (opt != 4);

    }
}