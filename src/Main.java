public class Main {
    public static void main(String[] args) {
        CartController cartController = new CartController();


        CartCommand addItem1 = new AddItemCommand(cartController.getCart(), "Laptop");
        CartCommand addItem2 = new AddItemCommand(cartController.getCart(), "Phone");
        CartCommand removeItem = new RemoveItemCommand(cartController.getCart(), "Phone");


        cartController.executeCommand(addItem1);
        cartController.executeCommand(addItem2);
        cartController.executeCommand(removeItem);
    }
}
