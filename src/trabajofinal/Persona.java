/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinal;

/**
 *
 * @author Andres
 */
public class Persona {
    String nombreCompleto , edad , nombreUsuario , contrasena;
    public Persona(){}
    
    public Persona(String nombreCompleto, String edad, String nombreUsuario, String contrasena) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }        
}
