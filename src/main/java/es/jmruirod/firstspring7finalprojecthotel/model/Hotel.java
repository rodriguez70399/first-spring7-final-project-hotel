package es.jmruirod.firstspring7finalprojecthotel.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
    
    public Hotel()
    {

    }

    public Hotel(String name, String category, double price, boolean isAvailable) 
    {
        this.name = name;
        this.category = category;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Hotel(Long id, String name, String category, double price, boolean isAvailable) 
    {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category) 
    {
        this.category = category;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public boolean isAvailable() 
    {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) 
    {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() 
    {
        return "Hotel [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", isAvailable="
                + isAvailable + "]";
    }

    @Override
    public int hashCode() 
    {
        return Objects.hashCode(id);
    }

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
