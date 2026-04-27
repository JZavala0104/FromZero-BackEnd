package pe.edu.upc.fromzero.ServiceInterface;

import pe.edu.upc.fromzero.Entities.Mensajes;
import java.util.List;

public interface IMensajesService {
    public List<Mensajes> GetMensaje();
    public Mensajes InsertMensaje(Mensajes mensaje);
    public void UpdateMensaje(Mensajes mensaje);
    public void DeleteMensaje(int IdMensaje);
}
