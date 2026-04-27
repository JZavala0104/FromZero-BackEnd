package pe.edu.upc.fromzero.DTO;

import java.time.LocalDateTime;

public class NotificacionesDTO {
    private int IdNotification;
    private int IdUser;
    private String Mensaje;
    private boolean Leido;
    private LocalDateTime Fecha;

    public int getIdNotification() {
        return IdNotification;
    }

    public void setIdNotification(int idNotification) {
        IdNotification = idNotification;
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

    public boolean isLeido() {
        return Leido;
    }

    public void setLeido(boolean leido) {
        Leido = leido;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        Fecha = fecha;
    }
}
