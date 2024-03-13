package org.example;

import java.util.Scanner;

public class Calculadora {


    public void menu(){
        Scanner scanner = new Scanner(System.in);

        int opcion, num1, num2;
        double resultado;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();

                    resultado = num1 + num2;
                    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();

                    resultado = num1 - num2;
                    System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resultado);
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();

                    resultado = num1 * num2;

                    System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + resultado);
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();

                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();

                    if (num2 == 0) {
                        System.out.println("No se puede dividir por 0.");
                    } else {
                        resultado = (double) num1 / num2;
                        System.out.println("La división de " + num1 + " y " + num2 + " es: " + resultado);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 5);
    }

    public void mostrarMenu() {
        System.out.println("-------------------");
        System.out.println("**CALCULADORA**");
        System.out.println("-------------------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("-------------------");
        System.out.println("Ingrese una opción: ");
    }

}
