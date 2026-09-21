package com.uped.proyecto.modelo;

public class Cliente extends Persona {
    private String telefono;

    public Cliente(String nombre, String dui, String telefono) {
        super(nombre, dui); // Invocación obligatoria en primera línea
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}