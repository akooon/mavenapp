package kz.uib.market.api.services;

import kz.uib.market.api.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(
                        "Pencil",
                        "Office supplies",
                        "Pen fo writing something",
                        4.9,
                        List.of("Nice pencil", "Good thing that you can write some information")
                )
        );

        products.add(new Product(
                        "Phone",
                        "Mobile phone",
                        "For make calls and watching video",
                        4.9,
                        List.of("Nice phone", "Good thing that you can spent your free and busy time")
                )
        );

        return products;
    }

    public Product searchByGet() {
        return new Product(
                "Phone",
                "Mobile phone",
                "For make calls and watching video",
                4.9,
                List.of("Nice phone", "Good thing that you can spent your free and busy time")

        );

    }
}