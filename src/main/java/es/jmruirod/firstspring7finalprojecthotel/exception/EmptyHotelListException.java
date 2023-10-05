package es.jmruirod.firstspring7finalprojecthotel.exception;

public class EmptyHotelListException extends RuntimeException
{
    public EmptyHotelListException()
    {
        super("No hotels registered");
    }
}
