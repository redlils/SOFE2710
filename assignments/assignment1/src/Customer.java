import java.util.*;

public class Customer {
    private final int id;
    private final String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public List<Receipt> findReceipts(List<Receipt> receipts) {
        return receipts.stream().filter(receipt -> receipt.customer().id == this.id).toList();
    }
}
