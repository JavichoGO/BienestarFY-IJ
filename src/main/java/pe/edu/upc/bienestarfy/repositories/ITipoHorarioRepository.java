package pe.edu.upc.bienestarfy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.bienestarfy.entities.TipoHorario;

import java.util.List;


@Repository
public interface ITipoHorarioRepository extends JpaRepository<TipoHorario, Integer> {
    //JPQL
    @Query("FROM TipoHorario p " + "WHERE p.nombreTipoHorario like %:nombreTipoHorario")
    List<TipoHorario> buscarNombre(@Param("nombreTipoHorario") String nombreTipoHorario);
}
