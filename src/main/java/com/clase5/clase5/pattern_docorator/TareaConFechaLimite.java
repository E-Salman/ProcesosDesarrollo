package com.clase5.clase5.pattern_docorator;

import com.clase5.clase5.model.Tarea;

import java.time.LocalDate;

public class TareaConFechaLimite extends Tarea {
    private Tarea tarea;
    private LocalDate fechaLimite;

    public TareaConFechaLimite(Tarea tarea, LocalDate fechaLimite) {
        this.tarea = tarea;
        this.fechaLimite = fechaLimite;
    }

    public String mostrar() {
        return " (Vence: " + fechaLimite + ")";
    }

    public long getId() {
        return tarea.getId();
    }

    @Override
    public boolean isCompletada() {
        return tarea.isCompletada();
    }

}