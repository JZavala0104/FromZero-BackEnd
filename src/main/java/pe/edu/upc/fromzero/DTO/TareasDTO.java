package pe.edu.upc.fromzero.DTO;

public class TareasDTO {
    private int IdTarea;
    private int IdProyecto;
    private String Titulo;
    private String Descripcion;
    private String FechaLimite;
    private String Estado;

    public int getIdTarea() {
        return IdTarea;
    }

    public void setIdTarea(int idTarea) {
        IdTarea = idTarea;
    }

    public int getIdProyecto() {
        return IdProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        IdProyecto = idProyecto;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getFechaLimite() {
        return FechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        FechaLimite = fechaLimite;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
