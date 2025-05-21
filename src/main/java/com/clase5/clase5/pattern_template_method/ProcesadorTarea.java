package com.clase5.clase5.pattern_template_method;

import com.clase5.clase5.model.Tarea;
import org.springframework.http.ResponseEntity;

import java.util.List;

public abstract class ProcesadorTarea {

    private List<Tarea> tareas;

    public ProcesadorTarea(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public ResponseEntity<Tarea> procesar(long id) {
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                return procesarTareaEncontrada(t);
            }
        }
        return ResponseEntity.notFound().build();
    }

    protected abstract ResponseEntity<Tarea> procesarTareaEncontrada(Tarea tarea);
}
