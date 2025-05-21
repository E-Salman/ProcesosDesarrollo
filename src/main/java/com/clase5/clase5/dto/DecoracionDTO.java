package com.clase5.clase5.dto;

import java.time.LocalDate;

public class DecoracionDTO {
    private int prioridad;
    private LocalDate fechaLimite;

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @Override
    public String toString() {
        return "DecoracionDTO{" +
                "prioridad=" + prioridad +
                ", fechaLimite=" + fechaLimite +
                '}';
    }
}
