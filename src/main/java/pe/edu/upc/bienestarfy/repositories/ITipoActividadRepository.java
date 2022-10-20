package pe.edu.upc.bienestarfy.repositories;
import pe.edu.upc.bienestarfy.entities.TipoActividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoActividadRepository extends JpaRepository<TipoActividad,Integer> {
}
