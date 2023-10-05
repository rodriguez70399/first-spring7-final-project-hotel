package es.jmruirod.firstspring7finalprojecthotel.exception;

public class BadRequestException extends RuntimeException
{
    public BadRequestException(String message)
    {
        super(message);
    }
}
