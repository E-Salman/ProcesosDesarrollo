package com.clase5.clase5.config;

public class EmpresaSingleton {

    // Instancia única de la clase
    private static EmpresaSingleton instancia;

    // Constructor privado para evitar instanciación externa
    private EmpresaSingleton() {
        // Inicialización de recursos si es necesario
    }

    // Método público y estático para obtener la instancia única
    public static EmpresaSingleton getInstancia() {
        if (instancia == null) {
            synchronized (EmpresaSingleton.class) {
                if (instancia == null) {
                    instancia = new EmpresaSingleton();
                }
            }
        }
        return instancia;
    }

    // Métodos de la lógica de negocio de la clase
    public String mostrarMensaje() {
        return "Instancia única de EmpresaSingleton";
    }
}