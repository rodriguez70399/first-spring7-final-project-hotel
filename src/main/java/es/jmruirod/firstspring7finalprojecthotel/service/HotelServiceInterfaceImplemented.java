package es.jmruirod.firstspring7finalprojecthotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jmruirod.firstspring7finalprojecthotel.dao.HotelDao;
import es.jmruirod.firstspring7finalprojecthotel.model.Hotel;

@Service
public class HotelServiceInterfaceImplemented implements HotelServiceInterface
{
    @Autowired
    private HotelDao hotelDao;
    
    @Override
    public Hotel findById(Long id) 
    {
        return this.hotelDao.findById(id).orElse(null);
    }

    @Override
    public List<Hotel> getAll() 
    {
        return this.hotelDao.findAll();
    }

    @Override
    public Hotel findByName(String name) 
    {
        return this.hotelDao.findByName(name);
    }
}
