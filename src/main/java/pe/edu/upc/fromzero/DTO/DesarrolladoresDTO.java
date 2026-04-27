package pe.edu.upc.fromzero.DTO;

public class DesarrolladoresDTO {
    private int IdDesarrollador;
    private int IdUser;
    private String Habilidades;
    private int Experiencia;
    private String Portafolio;

    public int getIdDesarrollador() {
        return IdDesarrollador;
    }

    public void setIdDesarrollador(int idDesarrollador) {
        IdDesarrollador = idDesarrollador;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(String habilidades) {
        Habilidades = habilidades;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int experiencia) {
        Experiencia = experiencia;
    }

    public String getPortafolio() {
        return Portafolio;
    }

    public void setPortafolio(String portafolio) {
        Portafolio = portafolio;
    }
}
