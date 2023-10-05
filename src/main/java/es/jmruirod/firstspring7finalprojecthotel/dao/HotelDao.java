package es.jmruirod.firstspring7finalprojecthotel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.jmruirod.firstspring7finalprojecthotel.model.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Long>
{
    @Query("SELECT h FROM Hotel h WHERE h.name = :name LIMIT 1")
    public Hotel findByName(@Param("name") String name);
}