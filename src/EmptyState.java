public class EmptyState implements CartState {
    @Override
    public void proceed(ShoppingCart cart) {
        if (!cart.getItems().isEmpty()) {
            cart.setCartState(new CartWithItemsState());
            System.out.println("Cart is now filled with items.");
        } else {
            System.out.println("Cart is empty.");
        }
    }
}
