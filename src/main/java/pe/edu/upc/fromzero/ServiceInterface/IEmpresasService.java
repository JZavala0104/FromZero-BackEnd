package pe.edu.upc.fromzero.ServiceInterface;

import pe.edu.upc.fromzero.Entities.Empresas;

import java.util.List;

public interface IEmpresasService {
    public List<Empresas> GetEmpresa();
    public Empresas InsertEmpresa(Empresas empresa);
    public void UpdateEmpresa(Empresas empresa);
    public void DeleteEmpresa(int IdEmpresa);
}
