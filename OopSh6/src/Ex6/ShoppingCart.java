package Ex6;

import java.util.Arrays;

public class ShoppingCart {
    private CartItem[] cartItems;
    public double getCartItemsTotalPrice() {
        return Arrays.stream(cartItems).mapToDouble(CartItem::getPrice).sum();
    }
}
