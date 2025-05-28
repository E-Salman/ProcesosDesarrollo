package com.model;

public class Tarea {
    private long id;
    private String descripcion;
    private boolean completada;
 
    public Tarea(long id, String descripcion, boolean completada) {
        this.id = id;
        this.descripcion = descripcion;
        this.completada = completada;
    }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getDescripcion() {
        return descripcion;
    }
 
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
    public boolean isCompletada() {
        return completada;
    }
 
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
 
    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", completada=" + completada +
                '}';
    }
}