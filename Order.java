public class Order {

    private static int nextId= 10 ;
    private int id ;
    private String SKU ; 
    private Brand brand ;
    private PaymentMethod paymentmethod ;
    private User user ;
    private Notification notification ;
    private MetaApi whatsappApi ;


    public Order(String SKU ,Brand brand,PaymentMethod paymentmethod,User user,Notification notification){
        this.id = nextId ;
        this.SKU = SKU ;
        this.brand = brand ;
        this.paymentmethod = paymentmethod ;
        this.user = user ;
        notification.send(this,whatsappApi) ;

    }

    public int getId(){
        return id ;
    }
    public String getSKU(){
        return SKU ;
    }
    public Brand getBrand(){
        return brand ;
    }
    public PaymentMethod getPaymentMethod(){
        return paymentmethod ;
    }
    public User getUser(){
        return user ;
    }

        
    
    
}
