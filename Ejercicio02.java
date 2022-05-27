package examen3Eva;

import java.io.File;
import java.util.Scanner;

/**
 * PRE:---
 * POST:Disponemos del fichero Divorcios.csv, que contiene la información sobre los divorcios
 * en España según exista o no separación previa, separado por localidades y años (estos datos
 * pertenecen al Instituto Nacional de Estadística). Queremos desarrollar un programa Java que sea
 * capaz de mostrar por pantalla:
 * 1. El número total de divorcios CON separación previa en el año 2019.
 * 2. El número total de divorcios SIN separación previa en el año 2018.
 * 3. La localidad cuyo número de divorcios (suma de ambos) desde 2013 hasta 2019 haya sido
 * mayor.
 */
public class Ejercicio02 {
    /**
     * PRE:---
     * POST: Este metodo calcula el total de divorcios en 2019 con separacion previa.
     */
    public static void conSeparacionPrevia(File file) {
        try {
            Scanner f = new Scanner(file);
            int contadorconSeparacionPrevia = 0;
            while (f.hasNextLine()) {
                String linea = f.nextLine();
                String[] tabla = linea.split(";");
                if (tabla[2].equals("2019")) {
                    if (tabla[1].equalsIgnoreCase("si")) {
                        contadorconSeparacionPrevia++;
                    }
                }
            }
            System.out.println("Ha habido un total de " + contadorconSeparacionPrevia + " en 2019 ");
        } catch (Exception ignored) {

        }
    }

    /**
     * PRE:---
     * POST: Este metodo calcula El número total de divorcios SIN separación previa en el año 2018.
     */
    public static void sinSeparacionPrevia(File file) {
        try {
            Scanner f = new Scanner(file);
            int contadorSinSeparacionPrevia = 0;
            while (f.hasNextLine()) {
                String linea = f.nextLine();
                String[] tabla = linea.split(";");
                if (tabla[2].equals("2018")) {
                    if (tabla[1].equalsIgnoreCase("no")) {
                        contadorSinSeparacionPrevia++;
                    }
                }
            }
            System.out.println("Ha habido un total de divorcios sin separacion previa de: " + contadorSinSeparacionPrevia
                                + " en 2018 ");
        } catch (Exception ignored) {

        }
    }

    public static void sumaDivorcios(File file){

    }

    public static void main(String[] args) {
        File file;
        file = new File("C:\\Users\\PABLO\\OneDrive\\Escritorio\\Divorcios.csv");
        conSeparacionPrevia(file);
        sinSeparacionPrevia(file);
    }
}
