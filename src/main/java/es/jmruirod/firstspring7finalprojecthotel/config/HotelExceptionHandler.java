package es.jmruirod.firstspring7finalprojecthotel.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import es.jmruirod.firstspring7finalprojecthotel.exception.BadRequestException;
import es.jmruirod.firstspring7finalprojecthotel.exception.EmptyHotelListException;
import es.jmruirod.firstspring7finalprojecthotel.exception.HotelNotFoundException;

/**
 * Clase que maneja las excepciones personalizadas en la aplicación y las convierte en respuestas HTTP apropiadas.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@ControllerAdvice
public class HotelExceptionHandler 
{
    /**
     * Maneja la excepción HotelNotFoundException y devuelve una respuesta HTTP 404 (Not Found) con un mensaje.
     *
     * @param exception La excepción HotelNotFoundException lanzada.
     * @return Un mensaje de error con la descripción de la excepción.
     */
    @ResponseBody
    @ExceptionHandler(HotelNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String hotelNotFoundHandler(HotelNotFoundException exception)
    {
        return exception.getMessage();
    }

    /**
     * Maneja la excepción EmptyHotelListException y devuelve una respuesta HTTP 404 (Not Found) con un mensaje.
     *
     * @param exception La excepción EmptyHotelListException lanzada.
     * @return Un mensaje de error con la descripción de la excepción.
     */
    @ResponseBody
    @ExceptionHandler(EmptyHotelListException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String emptyHotelListHandler(EmptyHotelListException exception)
    {
        return exception.getMessage();
    }

    /**
     * Maneja la excepción BadRequestException y devuelve una respuesta HTTP 400 (Bad Request) con un mensaje.
     *
     * @param exception La excepción BadRequestException lanzada.
     * @return Un mensaje de error con la descripción de la excepción.
     */
    @ResponseBody
    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String badRequestHandler(BadRequestException exception)
    {
        return exception.getMessage();
    }
}