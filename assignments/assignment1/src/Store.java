import java.util.*;

public class Store {
    private final int id;
    private final String name;

    public Store(int id, String name) {
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
        return receipts.stream().filter(receipt -> receipt.store().id == this.id).toList();
    }
}
