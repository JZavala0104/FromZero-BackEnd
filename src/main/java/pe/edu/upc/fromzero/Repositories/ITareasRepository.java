package pe.edu.upc.fromzero.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.fromzero.Entities.Tareas;

@Repository
public interface ITareasRepository extends JpaRepository<Tareas, Integer> {
}
