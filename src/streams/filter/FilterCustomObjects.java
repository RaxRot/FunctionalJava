package streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Product{
    private String name;
    private double price;
    private String category;
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
       return "name=" + name + ", price=" + price + ", category=" + category;
    }
}
public class FilterCustomObjects {
    public static void main(String[] args) {

        List<Product> productList=new ArrayList<>();
        productList.add(new Product( "Apple", 12.50, "Fruits"));
        productList.add(new Product( "Banana", 15.50, "Fruits"));
        productList.add(new Product( "Rice", 17, "Vegetables"));
        productList.add(new Product( "Onion", 19.50, "Vegetables"));

        List<Product>fruits=productList.stream().filter(fruit->fruit.getCategory().equals("Fruits")).toList();


        Predicate<Product>priceMoreThanFifteen=product->product.getPrice()>15;
        List<Product>fruitsMoreFifteen=productList.stream().filter(priceMoreThanFifteen).toList();
    }
}
