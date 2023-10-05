package es.jmruirod.firstspring7finalprojecthotel.exception;

/**
 * Excepción personalizada que se lanza cuando la lista de hoteles está vacía.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public class EmptyHotelListException extends RuntimeException
{
    /**
     * Constructor de la excepción que indica que la lista de hoteles está vacía.
     */
    public EmptyHotelListException()
    {
        super("No hotels registered");
    }
}