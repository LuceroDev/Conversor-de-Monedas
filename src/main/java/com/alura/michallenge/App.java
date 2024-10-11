package com.alura.michallenge;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
        System.out.println("1) Dólar => Peso argentino");
        System.out.println("2) Peso argentino => Dólar");
        System.out.println("3) Dólar => Real brasileño");
        System.out.println("4) Real brasileño => Dólar");
        System.out.println("5) Dólar => Peso colombiano");
        System.out.println("6) Peso colombiano => Dólar");
        System.out.println("7) Dólar => Peso mexicano");
        System.out.println("8) Peso mexicano => Dólar");
        System.out.println("9) Salir");
        System.out.print("Elija una opción válida: ");

        int option = scanner.nextInt();

        while (option != 9) {
            switch (option) {
                case 1:
                    System.out.print("Ingrese la cantidad en Dólares: ");
                    double amountInDollars = scanner.nextDouble();
                    double amountInPesos = converter.convertDollarToArgentinePeso(amountInDollars);
                    System.out.printf("El equivalente en Pesos argentinos es: %.2f\n", amountInPesos);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad en Pesos argentinos: ");
                    double amountInPesosToDollar = scanner.nextDouble();
                    double dollarsFromPesos = converter.convertArgentinePesoToDollar(amountInPesosToDollar);
                    System.out.printf("El equivalente en Dólares es: %.2f\n", dollarsFromPesos);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad en Dólares: ");
                    amountInDollars = scanner.nextDouble();
                    double amountInReais = converter.convertDollarToBrazilianReal(amountInDollars);
                    System.out.printf("El equivalente en Reales brasileños es: %.2f\n", amountInReais);
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad en Reales brasileños: ");
                    double amountInReaisToDollar = scanner.nextDouble();
                    double dollarsFromReais = converter.convertBrazilianRealToDollar(amountInReaisToDollar);
                    System.out.printf("El equivalente en Dólares es: %.2f\n", dollarsFromReais);
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad en Dólares: ");
                    amountInDollars = scanner.nextDouble();
                    double amountInColombianPesos = converter.convertDollarToColombianPeso(amountInDollars);
                    System.out.printf("El equivalente en Pesos colombianos es: %.2f\n", amountInColombianPesos);
                    break;
                case 6:
                    System.out.print("Ingrese la cantidad en Pesos colombianos: ");
                    double amountInCOPToDollar = scanner.nextDouble();
                    double dollarsFromCOP = converter.convertColombianPesoToDollar(amountInCOPToDollar);
                    System.out.printf("El equivalente en Dólares es: %.2f\n", dollarsFromCOP);
                    break;
                case 7:
                    System.out.print("Ingrese la cantidad en Dólares: ");
                    amountInDollars = scanner.nextDouble();
                    double amountInMXN = converter.convertDollarToMexicanPeso(amountInDollars);
                    System.out.printf("El equivalente en Pesos mexicanos es: %.2f\n", amountInMXN);
                    break;
                case 8:
                    System.out.print("Ingrese la cantidad en Pesos mexicanos: ");
                    double amountInMXNToDollar = scanner.nextDouble();
                    double dollarsFromMXN = converter.convertMexicanPesoToDollar(amountInMXNToDollar);
                    System.out.printf("El equivalente en Dólares es: %.2f\n", dollarsFromMXN);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.print("Elija una opción válida: ");
            option = scanner.nextInt();
        }

        System.out.println("¡Gracias por usar el conversor de monedas!");
        scanner.close();
    }
}
