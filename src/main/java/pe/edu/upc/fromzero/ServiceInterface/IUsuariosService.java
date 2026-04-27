package pe.edu.upc.fromzero.ServiceInterface;
import pe.edu.upc.fromzero.Entities.Usuarios;
import java.util.List;

public interface IUsuariosService {
    public List<Usuarios> GetUsuario();
    public Usuarios InsertUsuario(Usuarios usuario);
    public void UpdateUsuario(Usuarios usuario);
    public void DeleteUsuario(int IdUsuario);
}
