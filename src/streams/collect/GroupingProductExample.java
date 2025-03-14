package streams.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product{
    private String name;
    private String category;
    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
public class GroupingProductExample {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<>();
        list.add(new Product( "Laptop", "Electronics"));
        list.add(new Product( "Shirt", "Clothing"));
        list.add(new Product( "Phone", "Electronics"));
        list.add(new Product( "Jeans", "Clothing"));

        Map<String,List<Product>> map=list.stream().collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(map);
    }
}
