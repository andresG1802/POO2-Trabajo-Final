/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;

import Cliente.Cliente;
import General.Conexion;
import General.VentanaLogin;
import Trabajador.Trabajador;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Andres
 */
public class TrabajoFinal {
    public static Conexion cn = new Conexion();
    public static Cliente cliente = new Cliente();
    public static Trabajador trabajador = new Trabajador();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaLogin ventana=new VentanaLogin();
        ventana.setVisible(true);
    }
    
}
