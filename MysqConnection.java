package examen3Eva;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqConnection {
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    final private String host = "localhost:3306/registro";
    final private String usuario = "root";
    final private String contraseña = "";

    /*
     * Pre:---
     * Post: En este metodo crea le da el valor a connection y statement para que
     * se puedan utilizar en el resto de metodos.
     */
    public void cargarBase() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + host + "?"
                    + "user=" + usuario + "&password=" + contraseña);
            statement = connection.createStatement();
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * PRE:---
     * POST: Este metodo añadir, añade la letra, la palabra y la linea donde aparece ala base de datos.
     */
    public void añadir(String letra, String palabra, int contadorLineas) throws Exception {
        preparedStatement = connection.prepareStatement("insert into registro(" + letra + "," + palabra + "," + contadorLineas
                + ") " + "values (?,?,?)");
    }
}
