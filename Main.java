    // Importar del nombrePaquete.nombreClase
    import Interfaz_grafica.Banner;
    import Opciones.Lista_opciones;
    import programas.IMC;
    import programa.metros_kilometros;
    import matematicas.mate;
    import Lista.lista_de_compras;
    import Billetes.monedas;

    // Importar de NombreLibreria.NombrePaquete.NombreClase
    import java.util.Scanner;

    public class Main {
        // Metodo Main
        public static void main(String[] args) {

            // Lista de opciones
            String[] listaDeOpciones = {
                    "Calculadora", "IMC",
                    "Fahrenheit / Celsius", "Calcular edad",
                    "Grados", "Lista de Compras",
                    "Conversor Monedas", "Opción_8",
                    "Opción_9", "Salir" };

            boolean programaEnEjecucion = true;

            do {
                // nombreClase.nombreMetodo
                Banner.mensaje_1();
                Lista_opciones.cargarOpciones(listaDeOpciones);

                Scanner intOpciones = new Scanner(System.in);
                System.out.print("[?]: ");
                int opcion = intOpciones.nextInt();
                System.out.println("---------------------------------------------------------------------------------------");

                // Cargar Opción del Usuario
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

                        break;
                    case 6:
                        lista_de_compras.crearLista();
                        break;
                    case 7:
                        monedas.programa();
                        break;
                    case 8:
                        System.out.println("Opción 8");
                        break;
                    case 9:
                        System.out.println("Opción 9");
                        break;
                    case 10:
                        System.out.println("FINAL DEL PROGRAMA");
                        programaEnEjecucion = false;
                        break;
                }

            } while (programaEnEjecucion);
        }
    }
