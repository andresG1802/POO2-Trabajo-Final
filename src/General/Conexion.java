/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package General;
import java.sql.*;


/**
 *
 * @author julianquispe
 */
public class Conexion {
    public Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:3306/sql10538765",
                    "sql10538765","k5f1scnEQp");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
    }
}
