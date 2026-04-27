package pe.edu.upc.fromzero.ServiceInterface;

import pe.edu.upc.fromzero.Entities.Tareas;
import java.util.List;

public interface ITareasService {
    public List<Tareas> GetTarea();
    public Tareas InsertTarea(Tareas tarea);
    public void UpdateTarea(Tareas tarea);
    public void DeleteTarea(int IdTarea);
}
