package Lista;
import MisMetodos.Lista_opciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class lista_de_compras {

    public static String[] opciones6 = {"Lista de compras", "Salir"};

    //Programa
    public static void programa(){
        Lista_opciones.cargarOpciones(opciones6);

        Scanner opcion = new Scanner(System.in);
        System.out.println("[?]: ");
        int r = opcion.nextInt();

        switch (r){
            case 1:
                crearLista();
                break;
            case 2:
                crearLista();
                break;
        }
    }

    // Lista de Compras
    public static void crearLista(){
        //Crear una lista Vacia
        List<String> listaNombre = new ArrayList<>();

        //Pedir un producto y su precio
        Scanner item = new Scanner(System.in);
        String rP;
        double rPc;

        for (int i = 1; i<=3; i++){
            Scanner item1=new Scanner(System.in);
            System.out.println("Producto: ");
            rP = item1.nextLine();
            System.out.println("Precio: ");
            rPc = item.nextDouble();

            //Agregar la lista vacia
            listaNombre.add(rP);
        }


        //Mostrar Lista
        System.out.println(listaNombre);
    }
}
