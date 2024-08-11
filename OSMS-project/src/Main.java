public class Main {
    public static void main(String[] args) {
        StoreDatabase osms = new StoreDatabase();

        osms.addProduct(new Electronics(4,"radio", "toshiba", 5));
        osms.addProduct(new Clothing(2,"t-shirt", "men's club", "cotton"));
        osms.addProduct(new Electronics(6,"Led", "toshiba", 7));
        osms.addProduct(new Electronics(7,"Led", "toshiba", 7));

        osms.removeProduct(6);

        osms.displayAllProducts();
        System.out.println("-----------");
        osms.sortProducts();

        osms.displayAllProducts();
        System.out.println("-----------");
        osms.searchByName("radio").displayInfo();
        System.out.println("-----------");
        osms.copyProduct(0).displayInfo();
        System.out.println("-----------");
    }
}