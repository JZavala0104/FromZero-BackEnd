package pe.edu.upc.fromzero.ServiceInterface;

import pe.edu.upc.fromzero.Entities.Proyectos;
import java.util.List;

public interface IProyectosService {
    public List<Proyectos> GetProyecto();
    public Proyectos InsertProyecto(Proyectos proyecto);
    public void UpdateProyecto(Proyectos proyecto);
    public void DeleteProyecto(int IdProyecto);
}
