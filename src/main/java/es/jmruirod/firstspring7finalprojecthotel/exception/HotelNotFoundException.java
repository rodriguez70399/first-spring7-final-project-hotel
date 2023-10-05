package es.jmruirod.firstspring7finalprojecthotel.exception;

public class HotelNotFoundException extends RuntimeException
{
    private final static String NOT_FOUND_MESSAGE = "Could not find hotel ";

    public HotelNotFoundException(Long id)
    {
        super(NOT_FOUND_MESSAGE + id);
    }

    public HotelNotFoundException(String name)
    {
        super(NOT_FOUND_MESSAGE + name);
    }
}
