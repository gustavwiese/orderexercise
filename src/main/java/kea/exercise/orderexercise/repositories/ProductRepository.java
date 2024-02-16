package kea.exercise.orderexercise.repositories;

import kea.exercise.orderexercise.OrderexerciseApplication;
import kea.exercise.orderexercise.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
