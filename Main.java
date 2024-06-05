//Importar del nombrePaqueta.nombreClase
import Interfaz_grafica.Banner;
import Opciones.Lista_Opciones;
import Programas.ProgramasIMC;
import interfazgrafica.Baner;
import Matematicas.Mate;
import Opciones.Lista_Opciones;
import Lista.ListaDeCompras;

//Importar de nombreLibreria.nombrePaquete.nombreClase
import java.util.Scanner;

public class Main {
    //Metodo Main
    public static void main(String[] args) {

        //Lista de opciones
        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit / Celsius", "Calcular edad",
                "Grados", "Lista de Compras",
                "Opción_7", "Opción_8",
                "Opción_9", "Salir" };

        boolean programa = true;

        do {
            //nombreClase.nombreMetodo
            Banner.mensaje_1();
            Lista_Opciones.cargarOpciones(listaDeOpciones);



            Scanner intOpciones = new Scanner(System.in);
            System.out.print("[?]: ");
            int opcion = intOpciones.nextInt();
            System.out.println("---------------------------------------------------------------------------------------");




//Cargar Opcion del Usuario
            switch (opcion){
                case 1:
                    Mate.programa();
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    ListaDeCompras.programa();
                    break;
                case 7:
                    System.out.println("Opcion7");
                    break;
                case 8:
                    System.out.println("Opcion8");
                    break;
                case 9:
                    System.out.println("Opcion9");
                    break;
                case 10:
                    System.out.println("FINAL DEL PROGRAMA");
                    programa=false;
                    break;
            }

        }while (programa);


    }

}