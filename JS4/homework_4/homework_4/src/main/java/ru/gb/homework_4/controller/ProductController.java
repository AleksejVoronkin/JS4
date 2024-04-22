package ru.gb.homework_4.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.homework_4.model.Product;
import ru.gb.homework_4.repository.ProductRepository;

@Controller
@AllArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Добро Пожаловать!");
        return "index";
    }
    @GetMapping("/products")
    public String getProduct(Model model) {
        model.addAttribute("products", productRepository.getProducts());
        return "products";
    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product, Model model) {
        productRepository.addProduct(product);
        model.addAttribute("products", productRepository.getProducts());
        return "products";
    }
}