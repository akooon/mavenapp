package kz.uib.market.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
@Data
@AllArgsConstructor
public class Product {

    private String name;
    private String category;
    private String description;
    private Double rate;
    private List<String> comments;


}
