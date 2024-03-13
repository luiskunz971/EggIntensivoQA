package org.example;

import java.util.Scanner;

public class AreaPerimetro {

    public void calculadora(){
        Scanner scanner = new Scanner(System.in);

        int opcionFigura;
        do {
            System.out.println("**Elija la figura geométrica:**");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Paralelogramo");
            System.out.println("4. Salir");
            System.out.println("*******************************");
            System.out.print("Ingrese una opcion:");
            opcionFigura = scanner.nextInt();
        } while (opcionFigura < 1 || opcionFigura > 4);

        int opcionCalculo;
        do {
            System.out.println("***Elija qué desea calcular:***");
            System.out.println("1. Perímetro");
            System.out.println("2. Área");
            System.out.println("3. Salir");
            System.out.println("*******************************");

            opcionCalculo = scanner.nextInt();
        } while (opcionCalculo < 1 || opcionCalculo > 3);

        double resultado = 0;
        switch (opcionFigura) {
            case 1: // Círculo
                if (opcionCalculo == 1) { // Perímetro
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    resultado = 2 * Math.PI * radio;
                } else if (opcionCalculo == 2) { // Área
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    resultado = Math.PI * Math.pow(radio, 2);
                }
                break;
            case 2: // Triángulo
                if (opcionCalculo == 1) { // Perímetro
                    System.out.print("Ingrese la longitud del lado a del triángulo: ");
                    double ladoA = scanner.nextDouble();
                    System.out.print("Ingrese la longitud del lado b del triángulo: ");
                    double ladoB = scanner.nextDouble();
                    System.out.print("Ingrese la longitud del lado c del triángulo: ");
                    double ladoC = scanner.nextDouble();
                    resultado = ladoA + ladoB + ladoC;
                } else if (opcionCalculo == 2) { // Área
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    resultado = (base * altura) / 2;
                }
                break;
            case 3: // Paralelogramo
                if (opcionCalculo == 1) { // Perímetro
                    System.out.print("Ingrese la longitud del lado a del paralelogramo: ");
                    double ladoA = scanner.nextDouble();
                    System.out.print("Ingrese la longitud del lado b del paralelogramo: ");
                    double ladoB = scanner.nextDouble();
                    resultado = 2 * (ladoA + ladoB);
                } else if (opcionCalculo == 2) { // Área
                    System.out.print("Ingrese la base del paralelogramo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del paralelogramo: ");
                    double altura = scanner.nextDouble();
                    resultado = base * altura;
                }
                break;
        }

        if (opcionCalculo == 1) {
            System.out.println("El perímetro es: " + resultado);
        } else if (opcionCalculo == 2) {
            System.out.println("El área es: " + resultado);
        }
    }


}
