package kz.uib.market.api.controllers;

import kz.uib.market.api.models.Product;
import kz.uib.market.api.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> getAll() {
        return productService.getAll();
    }
    @GetMapping("/search-by")
    public Product searcByGet (){
        return productService.searchByGet();
    }

}



