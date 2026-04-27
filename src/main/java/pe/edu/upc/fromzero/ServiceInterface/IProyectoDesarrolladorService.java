package pe.edu.upc.fromzero.ServiceInterface;

import pe.edu.upc.fromzero.Entities.ProyectoDesarrollador;
import java.util.List;

public interface IProyectoDesarrolladorService {
    public List<ProyectoDesarrollador> GetProyectoDesarrollador();
    public ProyectoDesarrollador InsertProyectoDesarrollador(ProyectoDesarrollador proyectoDesarrollador);
    public void UpdateProyectoDesarrollador(ProyectoDesarrollador proyectoDesarrollador);
    public void DeleteProyectoDesarrollador(int IdProyDesar);
}
