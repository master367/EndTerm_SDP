public class Main {
    public static void main(String[] args) {
        CartController cartController = new CartController();

        CartCommand addItemCommand1 = new AddItemCommand(cartController.getCart(), "Laptop");
        cartController.executeCommand(addItemCommand1);

        CartCommand addItemCommand2 = new AddItemCommand(cartController.getCart(), "Smartphone");
        cartController.executeCommand(addItemCommand2);

        System.out.println("Current items in the cart: " + cartController.getCart().getItems());

        CartCommand removeItemCommand = new RemoveItemCommand(cartController.getCart(), "Laptop");
        cartController.executeCommand(removeItemCommand);

        System.out.println("Current items in the cart: " + cartController.getCart().getItems());

        CartCommand removeNonExistentItemCommand = new RemoveItemCommand(cartController.getCart(), "Tablet");
        cartController.executeCommand(removeNonExistentItemCommand);

        cartController.getCart().clearCart();
        System.out.println("Final items in the cart: " + cartController.getCart().getItems());
    }
}