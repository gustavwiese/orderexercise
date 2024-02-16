package kea.exercise.orderexercise.repositories;

import kea.exercise.orderexercise.models.OrderLine;
import kea.exercise.orderexercise.models.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    private ProductRepository productRepository;
    private OrderLineRepository orderLineRepository;

    public InitData(ProductRepository productRepository, OrderLineRepository orderLineRepository) {
        this.productRepository = productRepository;
        this.orderLineRepository = orderLineRepository;
    }

    public void run(String... args){
        System.out.println("InitData running");

        Product product1 = new Product();
        product1.setName("Bread");
        product1.setDescription("Whole grain bread");
        product1.setPrice(19.95);
        product1.setEAN13("123456789");

        Product product2 = new Product();
        product2.setName("Milk");
        product2.setDescription("Light milk");
        product2.setPrice(9.95);
        product2.setEAN13("987654321");

        Product product3 = new Product();
        product3.setName("Butter");
        product3.setDescription("Salted butter");
        product3.setPrice(15.95);
        product3.setEAN13("385919380");

        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);

        OrderLine line1 = new OrderLine();
        line1.setProduct(product1);
        line1.setQuantity(2);
        orderLineRepository.save(line1);

        OrderLine line2 = new OrderLine();
        line2.setProduct(product1);
        line2.setQuantity(7);
        orderLineRepository.save(line2);
    }


}
