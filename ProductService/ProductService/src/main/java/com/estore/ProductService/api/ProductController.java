package com.estore.ProductService.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping
    public String GetProducts() {
        return "all products";
    }

    @PostMapping
    public String CreateProduct() {
        return "product created";
    }

    @DeleteMapping
    public String DeleteProduct() {
        return "product deleted";
    }

    @PutMapping
    public String UpdateProduct() {
        return "product updated";
    }
}
