package pe.edu.upc.fromzero.ServiceInterface;
import pe.edu.upc.fromzero.Entities.Valoraciones;
import java.util.List;

public interface IValoracionesService {
    public List<Valoraciones> GetValoracion();
    public Valoraciones InsertValoracion(Valoraciones valoracion);
    public void UpdateValoracion(Valoraciones valoracion);
    public void DeleteValoracion(int IdValoracion);
}
