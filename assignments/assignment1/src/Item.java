import java.util.List;

public class Item {
    private final int id;
    private final String name;
    private final float price;

    public Item(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public float price() {
        return price;
    }

    public ItemQuantity quantityOf(int quantity) {
        return new ItemQuantity(this, quantity);
    }

    public List<Receipt> findReceipts(List<Receipt> receipts) {
        return receipts.stream().filter(receipt -> receipt.items().stream()
                .anyMatch(quantity -> quantity.item().id == this.id)).toList();
    }
}
