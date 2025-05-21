package com.clase5.clase5.config;
import org.springframework.stereotype.Component;

@Component
public class Empresa {
    private String nombre = "Mi Empresa";
    private String cuit = "20-12345678-9";

    public Empresa() {
        // Constructor vacío
    }

    // Constructor
    public Empresa(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", cuit='" + cuit + '\'' +
                '}';
    }
}