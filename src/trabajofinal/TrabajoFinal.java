/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;

import General.Conexion;
import General.VentanaLogin;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Andres
 */
public class TrabajoFinal {
    public static Conexion cn = new Conexion();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaLogin ventana=new VentanaLogin();
        ventana.setVisible(true);
    }
    
}
