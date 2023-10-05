package es.jmruirod.firstspring7finalprojecthotel.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Esta clase representa un hotel con atributos como identificador único, nombre, categoría,
 * precio y disponibilidad.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@Entity
@Table(name = "hotels")
public class Hotel 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private double price;
    private boolean isAvailable;
    
    /**
     * Constructor por defecto de la clase Hotel.
     */
    public Hotel()
    {

    }

    /**
     * Constructor de la clase Hotel con parámetros.
     *
     * @param name Nombre del hotel.
     * @param category Categoría del hotel.
     * @param price Precio del hotel.
     * @param isAvailable Indica si el hotel está disponible.
     */
    public Hotel(String name, String category, double price, boolean isAvailable) 
    {
        this.name = name;
        this.category = category;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    /**
     * Constructor de la clase Hotel con parámetros.
     *
     * @param id Identificador único del hotel.
     * @param name Nombre del hotel.
     * @param category Categoría del hotel.
     * @param price Precio del hotel.
     * @param isAvailable Indica si el hotel está disponible.
     */
    public Hotel(Long id, String name, String category, double price, boolean isAvailable) 
    {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    /**
     * Obtiene el identificador único del hotel.
     *
     * @return El identificador único del hotel.
     */
    public Long getId() 
    {
        return id;
    }

    /**
     * Establece el identificador único del hotel.
     *
     * @param id El identificador único del hotel.
     */
    public void setId(Long id) 
    {
        this.id = id;
    }

    /**
     * Obtiene el nombre del hotel.
     *
     * @return El nombre del hotel.
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Establece el nombre del hotel.
     *
     * @param name El nombre del hotel.
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * Obtiene la categoría del hotel.
     *
     * @return La categoría del hotel.
     */
    public String getCategory()
    {
        return category;
    }

    /**
     * Establece la categoría del hotel.
     *
     * @param category La categoría del hotel.
     */
    public void setCategory(String category) 
    {
        this.category = category;
    }

    /**
     * Obtiene el precio del hotel.
     *
     * @return El precio del hotel.
     */
    public double getPrice() 
    {
        return price;
    }

    /**
     * Establece el precio del hotel.
     *
     * @param price El precio del hotel.
     */
    public void setPrice(double price) 
    {
        this.price = price;
    }

    /**
     * Comprueba si el hotel está disponible.
     *
     * @return true si el hotel está disponible, false en caso contrario.
     */
    public boolean isAvailable() 
    {
        return isAvailable;
    }

    /**
     * Establece la disponibilidad del hotel.
     *
     * @param isAvailable Indica si el hotel está disponible.
     */
    public void setAvailable(boolean isAvailable) 
    {
        this.isAvailable = isAvailable;
    }

    /**
     * Devuelve una representación en cadena de texto formateada del objeto Hotel.
     *
     * @return Una cadena de texto que representa de manera formateada el objeto Hotel.
     */
    @Override
    public String toString() 
    {
        return "Hotel [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", isAvailable="
                + isAvailable + "]";
    }

    /**
     * Calcula y devuelve un valor hash único para este objeto Hotel.
     *
     * @return El valor hash único calculado para este objeto Hotel.
     */
    @Override
    public int hashCode() 
    {
        return Objects.hashCode(id);
    }

    /**
     * Compara este objeto Hotel con otro objeto para determinar si son iguales.
     *
     * @param obj El objeto con el que se va a comparar.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Hotel other = (Hotel) obj;

        if (id == null) 
        {
            if (other.id != null)
                return false;
        } 
        else if (!id.equals(other.id))
            return false;

        if (name == null) 
        {
            if (other.name != null)
                return false;
        } 
        else if (!name.equals(other.name))
            return false;

        if (category == null) 
        {
            if (other.category != null)
                return false;
        } 
        else if (!category.equals(other.category))
            return false;

        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;

        if (isAvailable != other.isAvailable)
            return false;

        return true;
    }
}
