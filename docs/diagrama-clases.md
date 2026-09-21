# Diagrama de Clases - Jerarquía de Herencia

```mermaid
classDiagram
    class Persona {
        #String nombre
        #String dui
        +presentarse() String
    }

    class Cliente {
        -String telefono
        +getTelefono() String
    }

    class Empleado {
        -double salario
        +getSalario() double
        +actualizarNombre(String) void
    }

    class Estudiante {
        -String carnet
        -String carrera
        +matricular(String) void
    }

    class Docente {
        -String especialidad
        -int aniosExperiencia
        +impartirClase(String) void
    }

    Persona <|-- Cliente
    Persona <|-- Empleado
    Persona <|-- Estudiante
    Persona <|-- Docente