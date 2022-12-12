package productsList;

import java.util.HashMap;
import java.util.Map;

public class ProductList {
    private final Map<Product, Integer> productList = new HashMap<>();

    public Map<Product, Integer> getProductList() {
        return productList;
    }

    public double totalCost(Map<Product, Integer> productList) {
        double sum = 0;
        for (Map.Entry<Product, Integer> products : productList.entrySet()) {
            sum = sum + products.getKey().getCost()*products.getValue();
        }
        return sum;
    }

    public void add(Product product, Integer number) {
        if (productList.containsKey(product))
            throw new IllegalArgumentException("Такой продукт уже есть!");
        if (number == null || number < 0) {
            productList.put(product, 1);
        } else productList.put(product, number);
    }

    @Override
    public String toString() {
        return productList.toString();
    }
}
