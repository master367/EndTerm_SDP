public class CartWithItemsState implements CartState {
    @Override
    public void proceed(ShoppingCart cart) {
        if (cart.getItems().isEmpty()) {
            cart.setCartState(new EmptyState());
            System.out.println("Cart is now empty.");
        } else {
            System.out.println("Cart contains items.");
        }
    }
}
