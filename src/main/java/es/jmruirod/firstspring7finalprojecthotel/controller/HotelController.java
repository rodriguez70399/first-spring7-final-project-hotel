package es.jmruirod.firstspring7finalprojecthotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.jmruirod.firstspring7finalprojecthotel.exception.BadRequestException;
import es.jmruirod.firstspring7finalprojecthotel.model.Hotel;
import es.jmruirod.firstspring7finalprojecthotel.service.HotelServiceInterface;

/**
 * Controlador REST que maneja las solicitudes relacionadas con hoteles.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@RestController
public class HotelController 
{
    @Autowired
    private HotelServiceInterface service;

    /**
     * Obtiene una lista de todos los hoteles disponibles.
     *
     * @return Lista de hoteles disponibles.
     * @apiNote GET: localhost:PUERTO/hotels
     */
    @GetMapping(value = "hotels", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> findByAvailable() 
    {
        return this.service.findByAvailable();        
    }

    /**
     * Obtiene un hotel por su nombre.
     *
     * @param name El nombre del hotel a buscar (como parte de la URL).
     * @return El hotel con el nombre especificado.
     * @apiNote GET: localhost:PUERTO/hotel/name/teapot
     */
    @GetMapping(value = "hotel/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Hotel findByName(@PathVariable String name) 
    {
        name = name.replace("-", " ");
        return this.service.findByName(name);        
    }
}
