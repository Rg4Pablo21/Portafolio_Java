import Interfaz_grafica.Banner;
import MisMetodos.Lista_opciones;
import IMC.IMC;
import colegio.Primeroprimaria;
import conversor.metros_kilometros;
import calculadora.mate;
import Lista.lista_de_compras;
import conversor.monedas;
import libros.Biblioteca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Banner.mensaje_1();

        // Lista de opciones
        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Fahrenheit / Celsius", "Calcular edad",
                "Conversor", "Lista de Compras",
                "Conversor Monedas", "Biblioteca",
                "Colegio", "Salir"
        };

        boolean programaEnEjecucion = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nSeleccione una opción:");
            Lista_opciones.cargarOpciones(listaDeOpciones);

            // Leer la opción del usuario
            System.out.print("\nIngrese el número de la opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            // Procesar la opción seleccionada
            switch (opcion) {
                case 1:
                    mate.programa();
                    break;
                case 2:
                    IMC.programaIMC();
                    break;
                case 3:
                    metros_kilometros.otro();
                    break;
                case 4:
                    Banner.mensaje_1();
                    break;
                case 5:
                    lista_de_compras.programa();
                    break;
                case 6:
                    lista_de_compras.crearLista();
                    break;
                case 7:
                    monedas.programa();
                    break;
                case 8:
                    Biblioteca.programa();
                    break;
                case 9:
                    Primeroprimaria.programa();
                    break;
                case 10:
                    System.out.println("FINAL DEL PROGRAMA");
                    programaEnEjecucion = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 10.");
                    break;
            }



        } while (programaEnEjecucion);

        scanner.close();
    }
}
