package model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Table
@Entity
public class Book {
    @Id
    @NotEmpty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String image_url;
    private String price;

    public Book(@NotEmpty Long id, String name, String image_url, String price) {
        this.id = id;
        this.name = name;
        this.image_url = image_url;
        this.price = price;
    }


    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image_url='" + image_url + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
