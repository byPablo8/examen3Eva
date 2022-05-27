package examen3Eva;

import java.io.File;
import java.util.Scanner;


public class Ejercicio01 {
    /**
     * PRE:---
     * POST: Este metodo realiza el algoritmo que analiza un fichero de texto junto a una
     * letra del abecedario. El resultado muestra por pantalla cada una de las palabras del texto que
     * empiezan o terminan con dicha letra, junto a la línea en la que se encuentran, y despues lo aañade a la base de datos.
     */
    public static void algoritmo(File file, String a) { //le paso por parametro el fichero y la String.
        try {
            MysqConnection connection = new MysqConnection();
            connection.cargarBase();//conexion ala base de datos.
            Scanner f = new Scanner(file);
            int contadorLineas = 0;
            while (f.hasNextLine()) {
                String linea = f.nextLine();
                String[] tabla = linea.split(" ");
                for (int i = 0; i < tabla.length; i++) {
                    //Remplazo las comas y puntos del texto
                    tabla[i].replace(",", "").replace("\\.", "");
                    //Si empieza por a o acaba por a
                    if (tabla[i].substring(0, 1).equals(a) || tabla[i].substring(tabla[i].length() - 1,
                            tabla[i].length()).equals(a)) {
                        System.out.println("La palabra: " + tabla[i] + " En la linea: " + contadorLineas);
                        connection.añadir(a, tabla[i], contadorLineas); //Lo añado ala base de datos
                    }
                }
                contadorLineas++;
            }
            System.out.println("Añadido a la base de datos correctamente");
        } catch (Exception ignored) {

        }
    }

    /**
     * PRE:---
     * POST: Ejercicio 1: Queremos desarrollar un programa Java que sea capaz de analizar la información de un
     * fichero de texto. El algoritmo recibe como parámetro la dirección de un fichero de texto junto a una
     * letra del abecedario. El resultado debe mostrar por pantalla cada una de las palabras del texto que
     * empiezan o terminan con dicha letra, junto a la línea en la que se encuentran.
     */
    public static void main(String[] args) throws Exception {
        File file;
        //Ruta del fichero utilizado.
        file = new File("C:\\Users\\PABLO\\OneDrive\\Escritorio\\HablanosDelDon.txt");
        String a = "a";
        algoritmo(file, a);//el metodo algoritmo
    }
}
