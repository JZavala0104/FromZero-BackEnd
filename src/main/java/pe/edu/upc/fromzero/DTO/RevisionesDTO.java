package pe.edu.upc.fromzero.DTO;

import java.time.LocalDateTime;

public class RevisionesDTO {
    private int IdRevision;
    private int IdTarea;
    private String Comentar;
    private String Estado;
    private LocalDateTime Fecha;

    public int getIdRevision() {
        return IdRevision;
    }

    public void setIdRevision(int idRevision) {
        IdRevision = idRevision;
    }

    public int getIdTarea() {
        return IdTarea;
    }

    public void setIdTarea(int idTarea) {
        IdTarea = idTarea;
    }

    public String getComentar() {
        return Comentar;
    }

    public void setComentar(String comentar) {
        Comentar = comentar;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        Fecha = fecha;
    }
}
