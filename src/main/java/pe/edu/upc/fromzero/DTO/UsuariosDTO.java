package pe.edu.upc.fromzero.DTO;

import java.time.LocalDateTime;

public class UsuariosDTO {
    private int IdUser;
    private String Nombre;
    private String Email;
    private String Password;
    private LocalDateTime FechaRegistro;
    private int IdRol;

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public LocalDateTime getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        FechaRegistro = fechaRegistro;
    }

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int idRol) {
        IdRol = idRol;
    }
}
