package org.example;

import java.util.Scanner;

public class Nota {
    public static String obtenerNota(int puntuacion) {
        String nota;
        switch (puntuacion) {
            case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100:
                nota = "A";
                break;
            case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89:
                nota = "B";
                break;
            case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79:
                nota = "C";
                break;
            case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69:
                nota = "D";
                break;
            default:
                nota = "F";
        }
        return nota;
    }

    public void nota(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una puntuación: ");
        int puntuacion = scan.nextInt();
        System.out.println("La nota correspondiente es: "+obtenerNota(puntuacion));

    }
}
