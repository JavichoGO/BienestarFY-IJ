package pe.edu.upc.bienestarfy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.Categoria;

import java.util.List;


@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria,Integer> {

    //JPQL
    @Query("FROM Categoria p " + "WHERE p.nombreCategoria like %:nombreCategoria%")
    List<Categoria> buscarNombre(@Param("nombreCategoria") String nombreCategoria);

    @Query(value ="Select  c.nombre_categoria, count(u.id_usuario)\n"
    		+ "from categoria c \n"
    		+ "inner join usuario u on c.id_categoria = u.idcategoria\n"
    		+ "group by c.nombre_categoria\n"
    		+ "order by 2 desc",nativeQuery = true)
    List<String[]> contadorUsuario();
}