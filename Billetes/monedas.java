package Billetes;

import Opciones.Lista_opciones;
import java.util.Scanner;

public class monedas {

    private static String[] opcionesMonedas = {
            "Quetzales / Dolares", "Dolares / Quetzales",
            "Quetzales / Pesos MX", "Pesos MX / Quetzales"
    };

    public static void programa() {
        Lista_opciones.cargarOpciones(opcionesMonedas);

        Scanner scanner = new Scanner(System.in);
        System.out.print("[?]: ");
        String rScanner = scanner.nextLine();

        switch (rScanner) {
            case "1":
                System.out.println("[Q] Quetzales:");
                double rQ = scanner.nextDouble();
                System.out.println("[$] Dólares: " + quetzalesADolares(rQ));
                break;

            case "2":
                System.out.println("[$] Dólares:");
                double rD = scanner.nextDouble();
                System.out.println("[Q] Quetzales: " + dolaresAQuetzales(rD));
                break;

            case "3":
                System.out.println("[Q] Quetzales:");
                double rQToMXN = scanner.nextDouble();
                System.out.println("[MX] Pesos Mexicanos: " + quetzalesAPesosMX(rQToMXN));
                break;

            case "4":
                System.out.println("[MX] Pesos Mexicanos:");
                double rMXN = scanner.nextDouble();
                System.out.println("[Q] Quetzales: " + pesosMXAQuetzales(rMXN));
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    // Funciones
    public static double quetzalesADolares(double quetzales) {
        double tasaCambio = 1 / 7.8;
        return quetzales * tasaCambio;
    }

    public static double dolaresAQuetzales(double dolares) {
        double tasaCambio = 7.8;
        return dolares * tasaCambio;
    }

    public static double quetzalesAPesosMX(double quetzales) {
        double tasaCambio = 2.6;
        return quetzales * tasaCambio;
    }

    public static double pesosMXAQuetzales(double pesosMX) {
        double tasaCambio = 1 / 2.6;
        return pesosMX * tasaCambio;
    }
}
