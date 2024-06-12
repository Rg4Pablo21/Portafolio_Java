package calculadora;

import java.util.Scanner;

public class mate {



    public static void programa () {

        // Crea una lista de 4 opciones
        String[] ListaOpciones = {
                "Suma", "Resta",
                "Multiplicacion", "Division",

        };

        // Imrpime las opciones de la lista
        for (int i = 0; i < ListaOpciones.length; i++) {
            System.out.printf("[%d] %s", i + 1, ListaOpciones[i]);

            for (int j = 0; j < (14 - ListaOpciones[i].length()); j++) {
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0) {
                System.out.println("");
            }
        }

        // Lo que se tiene que hacer
        Scanner intprograma = new Scanner(System.in);
        System.out.print("[?]: ");
        int casos = intprograma.nextInt();

        System.out.print("Ingrese un numero: ");
        int n1 = intprograma.nextInt();
        System.out.print("Ingrese otro número: ");
        int n2 = intprograma.nextInt();

        switch (casos) {
            case 1:
                System.out.println("Resultado: " + suma(n1,n2));
                break;
            case 2:
                System.out.println("Resultado: " + resta(n1, n2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicacion(n1, n2));
                break;
            case 4:
                System.out.println("Resultado: " + division(n1, n2));
                break;

        }
    }
    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
    public static int resta(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }
    public static double division(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error:");
            return 0;
        }
        return num1 / num2;
    }
    public static void main(String[] args) {
        programa();
    }
}


