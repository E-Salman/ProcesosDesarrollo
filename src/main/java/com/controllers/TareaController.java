package com.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Tarea;

@RestController
@RequestMapping("/tareas")
public class TareaController {
    private List<Tarea> tareas = new ArrayList<>();
    private AtomicLong idGenerator = new AtomicLong();
 
    @PostMapping
    public ResponseEntity<Tarea> crearTarea(@RequestBody Tarea nuevaTarea) {
        nuevaTarea.setId(idGenerator.incrementAndGet());
        nuevaTarea.setCompletada(false);
        tareas.add(nuevaTarea);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaTarea);
    }
 
    @GetMapping
    public ResponseEntity<List<Tarea>> obtenerTodas() {
        return ResponseEntity.ok(tareas);
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<Tarea> obtenerPorId(@PathVariable long id) {
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                return ResponseEntity.ok(t);
            }
        }
        return ResponseEntity.notFound().build();
    }
 
    @PutMapping("/{id}")
    public ResponseEntity<Tarea> actualizarTarea(@PathVariable long id, @RequestBody Tarea actualizada) {
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                t.setDescripcion(actualizada.getDescripcion());
                t.setCompletada(actualizada.isCompletada());
                return ResponseEntity.ok(t);
            }
        }
        return ResponseEntity.notFound().build();
    }
 
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTarea(@PathVariable long id) {
        Iterator<Tarea> it = tareas.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();
    }
 
   
}