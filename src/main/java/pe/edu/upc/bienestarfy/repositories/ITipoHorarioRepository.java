package pe.edu.upc.bienestarfy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.bienestarfy.entities.TipoHorario;


@Repository
public interface ITipoHorarioRepository extends JpaRepository<TipoHorario, Integer> {

}
