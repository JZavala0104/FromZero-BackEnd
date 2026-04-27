package pe.edu.upc.fromzero.DTO;

import pe.edu.upc.fromzero.Entities.Usuarios;

import java.time.LocalDateTime;

public class CodigoGeneradoDTO {
    private int IdCode;
    private int IdUser;
    private String Prompt;
    private String Codigo;
    private String Lenguaje;
    private LocalDateTime Fecha;

    public int getIdCode() {
        return IdCode;
    }

    public void setIdCode(int idCode) {
        IdCode = idCode;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getPrompt() {
        return Prompt;
    }

    public void setPrompt(String prompt) {
        Prompt = prompt;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getLenguaje() {
        return Lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        Lenguaje = lenguaje;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        Fecha = fecha;
    }
}
