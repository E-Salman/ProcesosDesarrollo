package com.clase5.clase5.pattern_docorator;

import com.clase5.clase5.model.Tarea;

public class TareaConPrioridad extends Tarea {
    private Tarea tarea;
    private int prioridad;

    public TareaConPrioridad(Tarea tarea, int prioridad) {
        this.tarea = tarea;
        this.prioridad = prioridad;
    }

    public String mostrar() {
        return "[Prioridad: " + prioridad + "] " + super.toString();
    }

    @Override
    public long getId() {
        return tarea.getId();
    }

    @Override
    public boolean isCompletada() {
        return tarea.isCompletada();
    }

    // Otros métodos delegados si es necesario...
}
