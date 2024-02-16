package kea.exercise.orderexercise.controllers;

import kea.exercise.orderexercise.models.OrderLine;
import kea.exercise.orderexercise.repositories.OrderLineRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderlines")
public class OrderLineController {
    private OrderLineRepository orderLineRepository;

    public OrderLineController(OrderLineRepository orderLineRepository) {
        this.orderLineRepository = orderLineRepository;
    }

    @GetMapping
    public List<OrderLine> getAll(){
        return orderLineRepository.findAll();
    }
}
