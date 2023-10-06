package es.jmruirod.firstspring7finalprojecthotel.service;

import java.util.List;

import es.jmruirod.firstspring7finalprojecthotel.model.Hotel;

/**
 * Interfaz que define los métodos para el servicio de gestión de hoteles.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface HotelServiceInterface 
{
    /**
     * Obtiene una lista de todos los hoteles disponibles.
     * 
     * @return Lista de hoteles disponibles.
     */
    public List<Hotel> findByAvailable();

    /**
     * Obtiene un hotel identificado por su nombre.
     * 
     * @param name El nombre del hotel a buscar.
     * @return El hotel buscado, o null si no se encuentra.
     */
    public Hotel findByName(String name);
}
