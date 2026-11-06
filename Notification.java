public class Notification { 


    private Order order ;
    private MetaApi whatsappApi ;


    public Notification(Order order) {
        this.order = order ;
        this.whatsappApi = whatsappApi ;
    }



    public boolean Send() {

        if (order.paymentmethod == PaymentMethod.CASH) {

            if (!whatsappApi.sendMessage(order.user.getMobileNumber(),"hi{order.user.getName()} your order with id {order.id},from {order.brand.getName()} and SKU {order.SKU} has been placed successfully and will be delivered to {order.user.getAddress()}")) {

                return false;
            }

        } else if (order.paymentmethod == PaymentMethod.ONLINE) {
            return false ;

        return true ;


        }


    }
    
}
