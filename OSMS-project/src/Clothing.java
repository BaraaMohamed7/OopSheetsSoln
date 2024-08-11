public class Clothing extends Product{
    private String size;
    private String material;

    Clothing(int productId, String name, String size, String material) {
        super(productId, name);
        this.size = size;
        this.material = material;
    }

    @Override
    void displayInfo() {
        System.out.println("Name : " + this.getName() + "\nid : " + this.getProductId() + "\nsize: " + size + "\nmaterial : " + material);
    }
}
