package pe.edu.upc.fromzero.DTO;

import java.time.LocalDateTime;

public class ProyectosDTO {
    private int IdProject;
    private int IdEmpresa;
    private String Nombre;
    private String Descripcion;
    private double Presupuesto;
    private String Estado;
    private LocalDateTime FechaInicio;
    private LocalDateTime FechaFin;

    public int getIdProject() {
        return IdProject;
    }

    public void setIdProject(int idProject) {
        IdProject = idProject;
    }

    public int getIdEmpresa() {
        return IdEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        IdEmpresa = idEmpresa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public double getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        Presupuesto = presupuesto;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public LocalDateTime getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        FechaFin = fechaFin;
    }
}
