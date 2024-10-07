package servicies;

import model.Tarea;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataTareas {
    public static ArrayList listaTareas(){

        ArrayList<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("Tarea1", "hacer los ejercicios 1 al 10", LocalDate.of(2024, 9, 10), "Pendiente"));
        tareas.add(new Tarea("Tarea2", "Hacer la página 210 de Literatura", LocalDate.of(2024, 10, 14), "Pendiente"));
        tareas.add(new Tarea("Tarea3", "Arregla el código de JAVA", LocalDate.of(2024, 10, 18), "En progreso"));
        tareas.add(new Tarea("Tarea4", "Hacer los verbos de inglés", LocalDate.of(2024, 5, 27), "Completado"));
        tareas.add(new Tarea("Tarea5", "Hacer los ejercicos de Fisica", LocalDate.of(2024, 9, 12), "Completao"));

        return tareas;
    }


}
