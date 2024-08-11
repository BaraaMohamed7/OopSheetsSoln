import java.util.ArrayList;
import java.util.Objects;

public class StoreDatabase {
    private ArrayList<Product> products;

    public StoreDatabase() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
       products.add(product);
    }

    public void removeProduct(int productId){
        for (Product product: products) {
            if (product.getProductId()== productId) {
                products.remove(product);
                break;
            }
        }

    }

    public Product searchByName(String name) {
        for (Product product: products) {
            if (Objects.equals(product.getName(), name)) {
                return  product;
            }
        }
        return null;
    }

    public void  displayAllProducts() {
        for (Product product:products) product.displayInfo();
    }

    public void sortProducts() {

        for(int i = 0; i < products.size() - 1; i++) {
            if(products.get(i).getProductId() > products.get(i+1).getProductId()) {
                Product temp = products.get(i);
                products.set(i,products.get(i+1));
                products.set(i+1,temp);
            }
        }

    }

    public Product copyProduct(int productIndex) {
        return products.get(productIndex);
    }
}
