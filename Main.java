public class Main {
    public static void main(String[] args) {
        User user = new User(
            "+201000000000",
            "Ahmed",
            "6th of October City, Egypt"
        );

        Brand brand = new Brand("Demo Brand");
        MetaApi metaApi = new MetaApi();

        Notification notification = new Notification(metaApi);
        Order order = new Order(
            "SKU-001",
            brand,
            PaymentMethod.CASH,
            user,
            notification
        );


        System.out.println("Created order #" + order.getId());
    }
}