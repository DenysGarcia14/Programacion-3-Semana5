package com.uped.proyecto.modelo;

public class Docente extends Persona {
    private String especialidad;
    private int anosExperiencia;

    public Docente(String nombre, String dui, String especialidad, int anosExperiencia) {
        super(nombre, dui);
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
    }

    public void impartirClase(String materia) {
        System.out.println(nombre + " imparte: " + materia);
    }

    @Override
    public String toString() {
        return presentarse() + " | " + especialidad + " (" + anosExperiencia + " años)";
    }
}