package kea.exercise.orderexercise.repositories;

import kea.exercise.orderexercise.models.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine,Integer> {



}
