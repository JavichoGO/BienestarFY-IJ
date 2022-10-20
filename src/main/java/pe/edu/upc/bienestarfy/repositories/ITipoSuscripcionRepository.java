package pe.edu.upc.bienestarfy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;


@Repository
public interface ITipoSuscripcionRepository extends JpaRepository<TipoSuscripcion,Integer> {
}
