package pe.edu.upc.fromzero.ServiceInterface;

import pe.edu.upc.fromzero.Entities.Revisiones;
import java.util.List;

public interface IRevisionesService {
    public List<Revisiones> GetRevision();
    public Revisiones InsertRevision(Revisiones revision);
    public void UpdateRevision(Revisiones revision);
    public void DeleteRevision(int IdRevision);
}
