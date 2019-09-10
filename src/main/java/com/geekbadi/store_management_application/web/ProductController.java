package com.geekbadi.store_management_application.web;

import com.geekbadi.store_management_application.models.Product;
import com.geekbadi.store_management_application.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@Controller
@Valid
@RequestMapping("/")
public class ProductController
{
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public String getProducts(Model model)
    {
        model.addAttribute("product",new Product());
        List<Product> products =productRepository.findAll();
        model.addAttribute("myProducts",products);
        return "index";
    }

    @PostMapping("/products")
    public String createProduct(@ModelAttribute Product product)
    {
        productRepository.save(product);
        return "result";
    }

    @GetMapping("/getProducts")
    public Optional<Product> getProductById(@RequestParam(value = "id") Long productId) {
        return productRepository.findById((productId));
    }


    @GetMapping("/deleteProduct")
    public ResponseEntity<?> deleteProduct(@RequestParam(value = "id") Long productId) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new ResourceNotFoundException("product", "id", (long) productId));


        productRepository.delete(product);

        return ResponseEntity.ok().build();
    }


    }


