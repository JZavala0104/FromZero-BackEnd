package pe.edu.upc.fromzero.DTO;

import java.time.LocalDate;

public class TipsIADTO {
    private int IdTip;
    private int IdUser;
    private String Contenido;
    private LocalDate Fecha;

    public int getIdTip() {
        return IdTip;
    }

    public void setIdTip(int idTip) {
        IdTip = idTip;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }
}
