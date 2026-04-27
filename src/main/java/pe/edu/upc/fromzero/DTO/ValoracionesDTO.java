package pe.edu.upc.fromzero.DTO;

public class ValoracionesDTO {
    private int IdValoracion;
    private int IdProyecto;
    private double Puntuacion;
    private String Comentario;

    public int getIdValoracion() {
        return IdValoracion;
    }

    public void setIdValoracion(int idValoracion) {
        IdValoracion = idValoracion;
    }

    public int getIdProyecto() {
        return IdProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        IdProyecto = idProyecto;
    }

    public double getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        Puntuacion = puntuacion;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }
}
