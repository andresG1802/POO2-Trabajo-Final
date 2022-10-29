/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import General.Usuario;

/**
 *
 * @author julianquispe
 */
public class Cliente extends Usuario {

    public Cliente() {
    }

    public Cliente(int id, String contrasena, String dni, String nombres, String apellidos, String fechaNac, String sexo, String correo, String direccion) {
        super(id, contrasena, dni, nombres, apellidos, fechaNac, sexo, correo, direccion);
    }
    
}
