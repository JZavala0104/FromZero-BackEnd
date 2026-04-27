package pe.edu.upc.fromzero.DTO;

import java.time.LocalDateTime;

public class MensajesDTO {
    private int IdMensaje;
    private int IdProyecto;
    private int IdUser;
    private String Mensaje;
    private LocalDateTime Fecha;

    public int getIdMensaje() {
        return IdMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        IdMensaje = idMensaje;
    }

    public int getIdProyecto() {
        return IdProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        IdProyecto = idProyecto;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        Fecha = fecha;
    }
}
