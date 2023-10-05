package es.jmruirod.firstspring7finalprojecthotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.jmruirod.firstspring7finalprojecthotel.model.Hotel;
import es.jmruirod.firstspring7finalprojecthotel.service.HotelServiceInterface;

@RestController
public class HotelController 
{
    @Autowired
    private HotelServiceInterface service;

    @GetMapping(value = "hotel/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Hotel findById(@PathVariable Long id) 
    {
        return this.service.findById(id);        
    }

    @GetMapping(value = "hotels", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> getAll() 
    {
        return this.service.getAll();        
    }

    @GetMapping(value = "hotel/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Hotel findByName(@PathVariable String name) 
    {
        return this.service.findByName(name);        
    }
}