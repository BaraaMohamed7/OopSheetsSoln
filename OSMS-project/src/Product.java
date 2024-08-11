abstract public class Product implements Cloneable {
    private int productId;
    private String name;

    Product(int productId, String name) {
        this.productId = productId;
        this.name= name;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    abstract void displayInfo();
}
