package examen3Eva;


import java.util.Scanner;

/**
 * PRE:---
 * POST:Ejercicio 4: Implementa un método recursivo en Java llamado tablaMultiplicar() que muestre por
 * pantalla la tabla de multiplicar (únicamente de los multiplicadores pares) del número solicitado
 * (hasta multiplicar por 100).
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero que desea multiplicar");
        int numero = sc.nextInt();
        int cien = 100;
        tablaMultiplicar(numero, cien);
    }

    /**
     * PRE:---
     * POST: Este metodo realizara la tabla de multiplicar del numero introducido por el usuario recursivamente
     * hasta 100 y solo los multiplicadores pares.
     */
    public static void tablaMultiplicar(int numero, int cien) {
        if (cien > 0) { //mayor que 0 para que multiplique el 0
            tablaMultiplicar(numero, cien - 2); //Resto dos para que haga los pares solo.
        }
        System.out.println("\t" + numero + " x " + cien + " = " + (numero * cien));
    }
}
