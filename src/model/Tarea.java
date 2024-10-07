package model;

import java.time.LocalDate;

public class Tarea {

    private String Titulo;
    private String Descripcion;
    private LocalDate fechaLimite;
    private String Estado;

    public Tarea(String titulo, String descripcion, LocalDate fechaLimite, String estado){
        this.Titulo = titulo;
        this.Descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.Estado = estado;
    }

    //geters
    public String getTitulo() {
        return Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public String getEstado() {
        return Estado;
    }

    //seters

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "Titulo='" + Titulo + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", fechaLimite=" + fechaLimite +
                ", Estado='" + Estado + '\'' +
                '}';
    }
}
