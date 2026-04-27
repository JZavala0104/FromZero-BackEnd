package pe.edu.upc.fromzero.ServiceInterface;

import pe.edu.upc.fromzero.Entities.Notificaciones;

import java.util.List;

public interface INotificacionesService {
    public List<Notificaciones> GetNotificacion();
    public Notificaciones InsertNotificacion(Notificaciones notificacion);
    public void UpdateNotificacion(Notificaciones notificacion);
    public void DeleteNotificacion(int IdNotificacion);
}
