package ru.gb.homework_4.repository;

import lombok.Getter;
import org.springframework.stereotype.Repository;
import ru.gb.homework_4.model.Product;

import java.util.ArrayList;
import java.util.List;

@Getter
@Repository
public class ProductRepository {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product)
    {
        products.add(product);
    }

}
