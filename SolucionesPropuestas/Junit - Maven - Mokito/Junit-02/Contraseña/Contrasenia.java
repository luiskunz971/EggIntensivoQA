package org.example;

import java.util.Scanner;

public class Contrasenia {

    public void verificarContrasenia(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        boolean esValida = esSegura(contrasena);

        if (esValida) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("Contraseña no segura.");
            if(!tieneMayuscula(contrasena)) System.out.println("Debe tener al menos una letra mayúscula.");
            if(!tieneMinuscula(contrasena))System.out.println("Debe tener al menos una letra minuscula.");
            if(!tieneCaracterEspecial(contrasena))System.out.println("Debe tener al menos una carácter especial.");
            if(!tieneLongitudCorrecta(contrasena))System.out.println("Debe tener al menos 8 caracteres.");
            if(!tieneNumero(contrasena))System.out.println("Debe tener al menos un número.");

        }


    }
    public static boolean esSegura(String contrasena) {
        return tieneLongitudCorrecta(contrasena) &&
                tieneMayuscula(contrasena) &&
                tieneMinuscula(contrasena) &&
                tieneNumero(contrasena) &&
                tieneCaracterEspecial(contrasena);
    }

    private static boolean tieneLongitudCorrecta(String contrasena) {
        return contrasena.length() >= 8;
    }

    private static boolean tieneMayuscula(String contrasena) {
        for (char caracter : contrasena.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                return true;
            }
        }
        return false;
    }

    private static boolean tieneMinuscula(String contrasena) {
        for (char caracter : contrasena.toCharArray()) {
            if (Character.isLowerCase(caracter)) {
                return true;
            }
        }
        return false;
    }

    private static boolean tieneNumero(String contrasena) {
        for (char caracter : contrasena.toCharArray()) {
            if (Character.isDigit(caracter)) {
                return true;
            }
        }
        return false;
    }

    private static boolean tieneCaracterEspecial(String contrasena) {
        for (char caracter : contrasena.toCharArray()) {
            if (!Character.isLetterOrDigit(caracter)) {
                return true;
            }
        }
        return false;
    }
}
