public class Notification {
    private final MetaApi whatsappApi;

    public Notification(MetaApi whatsappApi) {
        this.whatsappApi = whatsappApi;
    }

    public boolean send(Order order) {
        if (order.getPaymentMethod() != PaymentMethod.CASH) {
            return false;
        }

        User user = order.getUser();

        String message = String.format(
            "Hi %s, your order #%d from %s (SKU: %s) is confirmed. " +
            "It will be delivered tomorrow to %s.",
            user.getName(),
            order.getId(),
            order.getBrand().getName(),
            order.getSku(),
            user.getAddress()
        );

        return whatsappApi.sendMessage(user.getMobileNumber(), message);
    }
}