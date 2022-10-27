/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajador;

import General.Usuario;

/**
 *
 * @author julianquispe
 */
public class Trabajador extends Usuario {
    int numHijos;
    double sueldo;
    String sistPension, seguroSalud, fechaIngreso;
    
    public Trabajador(){}


    public Trabajador(int numHijos, double sueldo, String sistPension, String seguroSalud, String fechaIngreso, int id, String usuario, String contrasena, String dni, String nombres, String apellidos, String fechaNac, String sexo, String correo, String direccion, String distrito) {
        super(id, usuario, contrasena, dni, nombres, apellidos, fechaNac, sexo, correo, direccion, distrito);
        this.numHijos = numHijos;
        this.sueldo = sueldo;
        this.sistPension = sistPension;
        this.seguroSalud = seguroSalud;
        this.fechaIngreso = fechaIngreso;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getSistPension() {
        return sistPension;
    }

    public void setSistPension(String sistPension) {
        this.sistPension = sistPension;
    }

    public String getSeguroSalud() {
        return seguroSalud;
    }

    public void setSeguroSalud(String seguroSalud) {
        this.seguroSalud = seguroSalud;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    
    
    
}
