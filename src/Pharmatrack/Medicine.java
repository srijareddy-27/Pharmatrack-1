package Pharmatrack;

public class Medicine {

    private String name;
    private String code;
    private String batch;
    private int quantity;
    private String expiry;

    // Constructor
    public Medicine(String name, String code, String batch, int quantity, String expiry) {
        this.name = name;
        this.code = code;
        this.batch = batch;
        this.quantity = quantity;
        this.expiry = expiry;
    }

    public String getCode() {
        return code;
    }

    // displayMedicine()
    public void displayMedicine() {
        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Batch: " + batch);
        System.out.println("Quantity: " + quantity);
        System.out.println("Expiry: " + expiry);
        System.out.println("---------------------------");
    }

    // updateQuantity()
    public void updateQuantity(int qty) {
        quantity = qty;
    }
}
