package programas;

import java.util.Scanner;

public class IMC {
    public static double pIMC(double peso, double altura) {
        double IMC = peso / (altura * altura);
        return IMC;

    }
    //Datos
    public static void programaIMC(){
        Scanner intDato = new Scanner(System.in);
        System.out.print("Peso: ");
        double peso = intDato.nextDouble();
        System.out.println("Altura: ");
        double altura = intDato.nextDouble();
        //Proceso
        double IMC = pIMC(peso,altura);
        //Resultado
        System.out.println("IMC: " + IMC);

        if (IMC < 18.5) {
            System.out.println("IMC Bajo: ");
        } else if (IMC > 18.5 && IMC < 24.9) {
            System.out.println("---> IMC Normal");
        } else if (IMC > 25 && IMC < 29.9) {
            System.out.println("---> IMC Sobre peso");
        } else if (IMC > 30 && IMC < 34.9) {
            System.out.println("---> IMC Obesidad 1");
        } else if (IMC > 35 && IMC < 39.9) {
            System.out.println("---> IMC Obesidad 2");
        } else if (IMC > 40 && IMC < 49.9) {
            System.out.println("---> IMC Obesidad 3");
        } else if (IMC > 50) {
            System.out.println("---> IMC Obesidad 5");
        }
    }
}