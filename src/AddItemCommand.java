public class AddItemCommand implements CartCommand {
    private ShoppingCart cart;
    private String item;

    public AddItemCommand(ShoppingCart cart, String item) {
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        cart.addItem(item);
    }
}
