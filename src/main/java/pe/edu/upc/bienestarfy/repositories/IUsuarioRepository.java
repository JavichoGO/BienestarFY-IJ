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
    List<Usuario> buscarnombreRole(@Param("nombreRole") String nombreRole);


}
