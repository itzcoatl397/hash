import java.util.Random;
import java.util.Scanner;

public class Hash {

    int   k[] = new int[10];
    int  v[] = new int[10];
    Random azar = new Random();
    Scanner entrada = new Scanner(System.in);
    public void Generar(){

        for (int i = 0; i <k.length ; i++) {
            System.out.println("Ingrese  los datos ");
            k[i]= entrada.nextInt() ;
            v[i]=0;
        }


    }
    public void Desplegar(){
        System.out.println("Numero  de control del arreglo llaves\n");
        for (int i = 0; i <k.length; i++) {

            System.out.println("[" +i+1+"].- "+k[i]);
        }
    }

    public  void Direcciones(){
        int  D,DX;
        int  n= k.length-1;
        System.out.println(n);
        for (int i = 0; i <=n ; i++) {

            D=(k[i] % n)+1;
            while (v[D]  != 0){

                DX = D+1;
                if (DX > n){
                    D=0;
                }else {
                    D=DX;
                }
            }
            v[D] = k[i];

        }
        System.out.print("\n Valores capturados  Direcciones Asignadas");

        for (int i = 0; i <v.length ; i++) {
            System.out.println("\n"+i+1+".-" +k[i]+" .- "+v[i]);

        }
    }

    public void Buscar(){

        int  D,DX;
        int  n= v.length-1;


        System.out.println("\tNumero de control  en el arreglo de las claves hashing");
        for (int i = 0; i <v.length ; i++) {

            System.out.println("\t[ " +i+1+"].- "+v[i]);
        }

        System.out.println("******¿Que clave dea buscar ?*****");
        int key = entrada.nextInt();

            D = (key % n)+1;


            if (v[D]==key){
                System.out.println("\n\tEl elemento " + key+" esta en la  position "+ D+1);
            }else {
                DX= D+1;
                while (DX <= n &&  v[DX] !=key  &&  v[DX]!=0 && DX  !=  D){
                    DX = DX +1;

                    if (DX > n){
                        DX = 0;

                    }

                }
                if (v[DX] == key){
                    System.out.println("\n\tEl elemento " + key+" esta en la  position "+ D+1);
                }else {
                    System.out.println("\n\tEl elemento " + key+" no esta en el arreglo ");
                }
            }

    }
}
