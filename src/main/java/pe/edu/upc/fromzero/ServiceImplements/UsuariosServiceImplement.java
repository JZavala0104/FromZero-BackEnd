package pe.edu.upc.fromzero.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fromzero.Entities.Usuarios;
import pe.edu.upc.fromzero.Repositories.IUsuariosRepository;
import pe.edu.upc.fromzero.ServiceInterface.IUsuariosService;

import java.util.List;

@Service
public class UsuariosServiceImplement implements IUsuariosService {
    @Autowired
    private IUsuariosRepository usuariosRepository;

    @Override
    public List<Usuarios> GetUsuario() {
        return usuariosRepository.findAll();
    }

    @Override
    public Usuarios InsertUsuario(Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

    @Override
    public void UpdateUsuario(Usuarios usuario) {
        usuariosRepository.save(usuario);
    }

    @Override
    public void DeleteUsuario(int IdUsuario) {
        usuariosRepository.deleteById(IdUsuario);
    }
}
