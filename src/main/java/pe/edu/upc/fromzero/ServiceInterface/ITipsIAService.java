package pe.edu.upc.fromzero.ServiceInterface;
import pe.edu.upc.fromzero.Entities.TipsIA;
import java.util.List;

public interface ITipsIAService {
    public List<TipsIA> GetTipsIA();
    public TipsIA InsertTipsIA(TipsIA tipsIA);
    public void UpdateTipsIA(TipsIA tipsIA);
    public void DeleteTipsIA(int IdTipsIA);
}
