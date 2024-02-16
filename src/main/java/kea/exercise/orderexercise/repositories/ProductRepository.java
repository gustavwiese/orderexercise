package kea.exercise.orderexercise.repositories;

import kea.exercise.orderexercise.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
