package kea.exercise.orderexercise.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import jakarta.persistence.*;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JsonIdentityInfo(generator = PropertyGenerator.class, property = "id")
    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public OrderLine() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
