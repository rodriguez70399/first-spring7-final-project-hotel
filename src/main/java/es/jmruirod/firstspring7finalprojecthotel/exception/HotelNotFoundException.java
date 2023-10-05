package es.jmruirod.firstspring7finalprojecthotel.exception;

/**
 * Excepción personalizada que se lanza cuando no se encuentra un hotel.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public class HotelNotFoundException extends RuntimeException
{
    private final static String NOT_FOUND_MESSAGE = "Could not find hotel ";

    /**
     * Constructor de la excepción para un hotel no encontrado por su identificador único.
     *
     * @param id El identificador único del hotel no encontrado.
     */
    public HotelNotFoundException(Long id)
    {
        super(NOT_FOUND_MESSAGE + id);
    }

    /**
     * Constructor de la excepción para un hotel no encontrado por su nombre.
     *
     * @param name El nombre del hotel no encontrado.
     */
    public HotelNotFoundException(String name)
    {
        super(NOT_FOUND_MESSAGE + name);
    }
}
