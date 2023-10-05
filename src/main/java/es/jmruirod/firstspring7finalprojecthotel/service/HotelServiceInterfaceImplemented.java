package es.jmruirod.firstspring7finalprojecthotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jmruirod.firstspring7finalprojecthotel.dao.HotelDao;
import es.jmruirod.firstspring7finalprojecthotel.exception.BadRequestException;
import es.jmruirod.firstspring7finalprojecthotel.exception.EmptyHotelListException;
import es.jmruirod.firstspring7finalprojecthotel.exception.HotelNotFoundException;
import es.jmruirod.firstspring7finalprojecthotel.model.Hotel;

/**
 * Implementación concreta de la interfaz HotelServiceInterface que proporciona los métodos
 * para gestionar hoteles y manejar excepciones personalizadas.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@Service
public class HotelServiceInterfaceImplemented implements HotelServiceInterface
{
    @Autowired
    private HotelDao hotelDao;
    
    /**
     * {@inheritDoc}
     * 
     * @throws HotelNotFoundException Si el hotel no se encuentra.
     */
    @Override
    public Hotel findById(Long id) 
    {
        return this.hotelDao.findById(id).orElseThrow(() -> new HotelNotFoundException(id));
    }

    /**
     * {@inheritDoc}
     * 
     * @throws EmptyHotelListException Si el listado de hoteles esta vacio.
     */
    @Override
    public List<Hotel> getAll() 
    {
        List<Hotel> hotels = this.hotelDao.findAll();

        if(hotels.isEmpty())
        {
            throw new EmptyHotelListException();
        }
        return hotels;
    }

    /**
     * {@inheritDoc}
     * 
     * @throws HotelNotFoundException Si el hotel no se encuentra.
     */
    @Override
    public Hotel findByName(String name) 
    {
        Hotel hotel = this.hotelDao.findByName(name);

        if (hotel == null) 
        {
            throw new HotelNotFoundException(name);
        }

        return hotel;
    }
}

