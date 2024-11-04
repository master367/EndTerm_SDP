public class CartController {
    private ShoppingCart cart;

    public CartController() {
        this.cart = ShoppingCart.getInstance();
    }


    public void executeCommand(CartCommand command) {
        command.execute();
    }


    public ShoppingCart getCart() {
        return cart;
    }
}
