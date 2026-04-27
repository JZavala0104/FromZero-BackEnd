package pe.edu.upc.fromzero.ServiceInterface;

import pe.edu.upc.fromzero.Entities.Desarrolladores;
import java.util.List;

public interface IDesarrolladoresService {
    public List<Desarrolladores> GetDesarrollador();
    public Desarrolladores InsertDesarrollador(Desarrolladores desarrollador);
    public void UpdateDesarrollador(Desarrolladores desarrollador);
    public void DeleteDesarrollador(int IdDesarrollador);
}
