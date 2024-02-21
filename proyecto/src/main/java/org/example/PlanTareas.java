package org.example;
import java.util.*;

public class PlanTareas {
    private Map<String, List<String>> tareasPorMiembro;

    public PlanTareas() {
        this.tareasPorMiembro = new HashMap<>();
    }

    public void asignarTarea(String miembro, String tarea) {
        if (!this.tareasPorMiembro.containsKey(miembro)) {
            this.tareasPorMiembro.put(miembro, new ArrayList<>());
        }
        this.tareasPorMiembro.get(miembro).add(tarea);
    }

    public void mostrarTablaDeTareas() {
        for (Map.Entry<String, List<String>> entry : this.tareasPorMiembro.entrySet()) {
            System.out.println(entry.getKey() + ": " + String.join(", ", entry.getValue()));
        }
    }

    public int calcularCargaDeTrabajo(String miembro, Map<String, Integer> pesosPorTarea) {
        int cargaDeTrabajo = 0;
        if (this.tareasPorMiembro.containsKey(miembro)) {
            for (String tarea : this.tareasPorMiembro.get(miembro)) {
                cargaDeTrabajo += pesosPorTarea.getOrDefault(tarea, 0);
            }
        }
        return cargaDeTrabajo;
    }
}
