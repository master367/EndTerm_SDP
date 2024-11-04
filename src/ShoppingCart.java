import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static ShoppingCart instance;
    private List<String> items;
    private CartState cartState;

    private ShoppingCart() {
        items = new ArrayList<>();
        cartState = new EmptyState();
    }

    public static ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println("Item '" + item + "' added to cart.");
        updateState();
    }

    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println("Item '" + item + "' removed from cart.");
        } else {
            System.out.println("Item '" + item + "' not found in cart.");
        }
        updateState();
    }

    public List<String> getItems() {
        return items;
    }

    public void clearCart() {
        items.clear();
        System.out.println("Cart cleared.");
        updateState();
    }


    public void setCartState(CartState state) {
        this.cartState = state;
    }


    private void updateState() {
        cartState.proceed(this);
    }
}
