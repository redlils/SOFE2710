public class ItemQuantity {
    private final Item item;
    private final int amount;

    public ItemQuantity(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public Item item() {
        return item;
    }

    public int amount() {
        return amount;
    }
}
