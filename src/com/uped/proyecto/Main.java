package com.uped.proyecto;

import com.uped.proyecto.modelo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Prueba Cliente ---");
        Cliente cliente = new Cliente("Ana López", "04512378-9", "7777-1234");
        System.out.println(cliente.presentarse());

        System.out.println("\n--- Prueba Empleado ---");
        Empleado empleado = new Empleado("Luis Pérez", "06223456-1", 850.0);
        System.out.println(empleado.presentarse());
        empleado.actualizarNombre("Luis Pérez Martínez");
        System.out.println(empleado.presentarse());

        System.out.println("\n--- Prueba Estudiante ---");
        Estudiante e = new Estudiante("Carlos Ramírez", "06123456-7", "UPED-2026-045", "Ing. en Sistemas");
        System.out.println(e);
        e.matricular("Programación III");

        System.out.println("\n--- Prueba Docente (Ejercicio 8.2) ---");
        Docente docente = new Docente("María Hernández", "05987654-3", "Ingeniería de Software", 8);
        System.out.println(docente);
        docente.impartirClase("Programación III");

        System.out.println("\n--- Prueba Upcasting ---");
        Persona[] personas = {
                new Cliente("Ana", "0451...", "7777-1"),
                new Empleado("Luis", "0622...", 850.0)
        };
        for (Persona p : personas) {
            System.out.println(p.presentarse());
        }
    }
}