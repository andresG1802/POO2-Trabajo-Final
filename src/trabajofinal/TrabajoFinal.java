/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;

import Administrador.Administrador;
import Cliente.Cliente;
import General.Conexion;
import General.VentanaLogin;
import Vendedor.Vendedor;

/**
 *
 * @author Andres
 */
public class TrabajoFinal {
    public static Conexion cn = new Conexion();
    public static String autenticacion = "None";
    public static Cliente cliente = new Cliente();
    public static Vendedor vendedor = new Vendedor();
    public static Administrador admin =  new Administrador();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaLogin ventana=new VentanaLogin();
        ventana.setVisible(true);
    }
    
}
