package es.jmruirod.firstspring7finalprojecthotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jmruirod.firstspring7finalprojecthotel.dao.HotelDao;
import es.jmruirod.firstspring7finalprojecthotel.exception.EmptyHotelListException;
import es.jmruirod.firstspring7finalprojecthotel.exception.HotelNotFoundException;
import es.jmruirod.firstspring7finalprojecthotel.model.Hotel;

@Service
public class HotelServiceInterfaceImplemented implements HotelServiceInterface
{
    @Autowired
    private HotelDao hotelDao;
    
    @Override
    public Hotel findById(Long id) 
    {
        return this.hotelDao.findById(id).orElseThrow(() -> new HotelNotFoundException(id));
    }

    @Override
    public List<Hotel> getAll() 
    {
        List<Hotel> hotels = this.hotelDao.findAll();

        if(hotels.isEmpty())
        {
            throw(new EmptyHotelListException());
        }
        return hotels;
    }

    @Override
    public Hotel findByName(String name) 
    {
        Hotel hotel = this.hotelDao.findByName(name);

        if (hotel == null) 
        {
            throw(new HotelNotFoundException(name));
        }

        return hotel;
    }
}
