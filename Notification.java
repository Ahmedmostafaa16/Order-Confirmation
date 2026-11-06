public class Notification {


    private Order order ;
    private MetaApi whatsappApi ;


    public Notification(Order order ,MetaApi whatsappApi){ 
        this.order = order ;
        this.whatsappApi = whatsappApi ;
    }



    public boolean Send() {

        if (order.getPaymentMethod() != PaymentMethod.CASH){
            return false ;
        }

        User user = order.getUser() ;
        Brand brand = order.getBrand() ;
        String message = "Hello " + user.getName() + ", your order with SKU: " + order.getSKU() + "from " + brand.getName() + " has been confirmed and will be send on address:"+ user.getAddress()+". Thank you for shopping with us!" ;
        String phoneNumber = user.getMobileNumber() ;
        
        whatsappApi.sendMessage(phoneNumber , message) ;
        return true ;




    }


    
}
