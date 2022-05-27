package Examen3Eva;

import java.io.File;
import java.util.Scanner;

/**
 * PRE:---
 * POST: Ejercicio 1: Queremos desarrollar un programa Java que sea capaz de analizar la información de un
 * fichero de texto. El algoritmo recibe como parámetro la dirección de un fichero de texto junto a una
 * letra del abecedario. El resultado debe mostrar por pantalla cada una de las palabras del texto que
 * empiezan o terminan con dicha letra, junto a la línea en la que se encuentran.
 */
public class Ejercicio01 {
    public static void algoritmo(File file, String a){
        try {
            Scanner f = new Scanner(file);

            while (f.hasNextLine()) {

            }
        } catch (Exception ignored) {

        }
    }

    public static void main(String[] args) {
        File file;
        file = new File("C:\\Users\\PABLO\\OneDrive\\Escritorio\\HablanosDelDon.txt");
        String a = "a";
    }
}
