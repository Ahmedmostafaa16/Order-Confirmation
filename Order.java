public class Order {
    private static int nextId = 10;

    private final int id;
    private final String sku;
    private final Brand brand;
    private final PaymentMethod paymentMethod;
    private final User user;
    private Notification notification;

    public Order(String sku, Brand brand, PaymentMethod paymentMethod, User user, Notification notification) {
        this.id = nextId++;
        this.sku = sku;
        this.brand = brand;
        this.paymentMethod = paymentMethod;
        this.user = user;
        notification.send(this);
    }

    public int getId() {
        return id;
    }

    public String getSku() {
        return sku;
    }

    public Brand getBrand() {
        return brand;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public User getUser() {
        return user;
    }
}