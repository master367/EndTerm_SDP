public class RemoveItemCommand implements CartCommand {
    private ShoppingCart cart;
    private String item;

    public RemoveItemCommand(ShoppingCart cart, String item) {
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        cart.removeItem(item);
    }
}

