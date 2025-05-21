package com.clase5.clase5.model;

public class Tarea implements Cloneable{
    private long id;
    private String descripcion;
    private boolean completada;

    public Tarea() {
    }
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
    @Override
    public Tarea clone() {
        Tarea clon = new Tarea();
        clon.setDescripcion(this.descripcion);
        clon.setCompletada(false); // Las tareas clonadas empiezan como "no completadas"
        return clon;
    }
}
