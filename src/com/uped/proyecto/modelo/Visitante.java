package com.uped.proyecto.modelo;

public class Visitante extends Persona {
    public Visitante(String nombre) {
        super(nombre); // Invoca al constructor de Persona que asigna "PENDIENTE" al DUI
    }

    @Override
    public String toString() {
        return "Visitante {" + presentarse() + "}";
    }
}
