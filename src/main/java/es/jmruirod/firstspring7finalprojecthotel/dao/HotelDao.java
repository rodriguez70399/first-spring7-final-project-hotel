package es.jmruirod.firstspring7finalprojecthotel.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.jmruirod.firstspring7finalprojecthotel.model.Hotel;

/**
 * Esta interfaz define un repositorio de datos para la entidad Hotel.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface HotelDao extends JpaRepository<Hotel, Long>
{
    /**
     * Obtiene la lista de hoteles disponibles
     *
     * @return Listado de hoteles con isAvailable = true.
     */
    @Query("SELECT h FROM Hotel h WHERE h.isAvailable = TRUE")
    public List<Hotel> findByAvailable();
    
    /**
     * Busca y devuelve un hotel por su nombre.
     *
     * @param name El nombre del hotel que se desea buscar.
     * @return El hotel con el nombre especificado, o null si no se encuentra.
     */
    @Query("SELECT h FROM Hotel h WHERE h.name = :name")
    public Hotel findByName(@Param("name") String name);
}