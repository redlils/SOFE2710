import java.util.List;

public class Receipt {
    private final int id;
    private final Store store;
    private final Customer customer;
    private final List<ItemQuantity> items;
    private final float amount;
    private final PaymentType payment;

    public Receipt(int id, Store store, Customer customer, float amount, PaymentType payment, ItemQuantity... items) {
        this.id = id;
        this.store = store;
        this.customer = customer;
        this.items = List.of(items);
        this.amount = amount;
        this.payment = payment;
    }

    public int id() {
        return id;
    }

    public Store store() {
        return store;
    }

    public Customer customer() {
        return customer;
    }

    public List<ItemQuantity> items() {
        return items;
    }

    public float amount() {
        return amount;
    }

    public PaymentType payment() {
        return payment;
    }
}
