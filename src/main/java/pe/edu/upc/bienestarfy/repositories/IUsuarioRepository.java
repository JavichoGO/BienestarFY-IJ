package pe.edu.upc.bienestarfy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.bienestarfy.entities.Usuario;

import java.util.List;

public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
    //JPQL
    @Query("FROM Usuario u " + "WHERE u.nombreUsuario like %:nombreUsuario%")
    List<Usuario> buscarNombre(@Param("nombreUsuario") String nombreUsuario);

    @Query("from Usuario u where u.role.nombreRole like %:nombreRole%")
    List<Usuario> searchnombreRole(@Param("nombreRole") String nombreRole);

    @Query(value="select s.nombre_suscripcion, count(u.id_usuario) from suscripcion s inner join usuario u on s.id_suscripcion = u.id_suscripcion group by s.nombre_suscripcion",nativeQuery = true)
    List<String[]> buscarCantidadUsuarios();
}
