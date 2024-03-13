package org.example;

public class ParImpar {

    public void parImpar(){
        int numero = solicitarNumero();
        boolean esPar = esPar(numero);
        System.out.println("El numero ingresado es: "+ numero);
        System.out.println("El numero ingresado es:"+ (esPar(numero) ? "Par" : "Impar"));
    }
    public int solicitarNumero() {
        int numero = (int) (Math.random() * (50 - 20 + 1)) + 20;
        return numero;
    }

    public boolean esPar(int numero){
        return numero % 2 == 0;
    }
}
