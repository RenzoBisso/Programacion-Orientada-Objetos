package unlu.poo.tps.tp1.ej5;

import java.time.LocalDate;
import java.util.Scanner;

public class Tarea {
    private String descripcion;
    private Prioridad prioridad;
    private boolean estado;
    private LocalDate fechaLimite;
    private LocalDate fechaRealizada;
    private LocalDate fechaCreacion;
    private boolean esVencida;



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public LocalDate getFechaRealizada() {
        return fechaRealizada;
    }

    public void setFechaRealizada(LocalDate fechaRealizada) {
        this.fechaRealizada = fechaRealizada;
    }

    public boolean isEsVencida() {
        return esVencida;
    }

    public void setEsVencida(boolean esVencida) {
        this.esVencida = esVencida;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void verificarVencimiento(){
        if(LocalDate.now().isAfter(this.fechaLimite)){
            this.esVencida=true;
        }
    }

    public void mostrarTarea(){
        this.verificarVencimiento();
        if(this.esVencida){
            System.out.println("(VENCIDA)");
        }
        System.out.println("Descripcion: "+this.descripcion+"\nPrioridad: "+this.prioridad+"\nEstado: "+this.estado+"\nFecha creacion: "+this.fechaCreacion.toString()+"\nFecha limite: "+this.fechaLimite.toString());
        if (this.fechaRealizada != null) {
            System.out.println(this.fechaRealizada.toString());
        } else {
            System.out.println("No realizada");
        }
    }
}
