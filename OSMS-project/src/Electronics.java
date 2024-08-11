public class Electronics extends Product{
    private String brand;
    private int warrantyPeriod;

    Electronics(int productId, String name, String brand, int warrantyPeriod) {
        super(productId, name);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    void displayInfo() {
        System.out.println("Name : " + this.getName() + "\nid : " + this.getProductId() + "\nbrand: " + brand + "\nwarranty period : " + warrantyPeriod);
    }
}
