package es.jmruirod.firstspring7finalprojecthotel.service;

import java.util.List;

import es.jmruirod.firstspring7finalprojecthotel.model.Hotel;

public interface HotelServiceInterface 
{
    /**
     * Obtiene un hotel identificado por su ID.
     * 
     * @param id El ID del hotel a buscar,
     * @return El hotel buscado.
     */
    public Hotel findById(Long id);

    /**
     * Obtiene una lista de todos los hoteles disponibles.
     * 
     * @return Lista de hoteles.
     */
    public List<Hotel> getAll();

    /**
     * Obtiene un hotel identificado por su nombre.
     * 
     * @param name El nombre del hotel a buscar,
     * @return El hotel buscado.
     */
    public Hotel findByName(String name);
}
