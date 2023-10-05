package es.jmruirod.firstspring7finalprojecthotel.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import es.jmruirod.firstspring7finalprojecthotel.exception.BadRequestException;
import es.jmruirod.firstspring7finalprojecthotel.exception.EmptyHotelListException;
import es.jmruirod.firstspring7finalprojecthotel.exception.HotelNotFoundException;

@ControllerAdvice
public class HotelExceptionHandler 
{
    @ResponseBody
    @ExceptionHandler(HotelNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String hotelNotFoundHandler(HotelNotFoundException exception)
    {
        return exception.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(EmptyHotelListException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String emptyHotelListHandler(EmptyHotelListException exception)
    {
        return exception.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String badRequestHandler(BadRequestException exception)
    {
        return exception.getMessage();
    }
}