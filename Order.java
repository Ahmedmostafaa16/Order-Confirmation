public class Order {

    private static int nextId= 10 ;
    private int id ;
    private String SKU ; 
    private Brand brand ;
    PaymentMethod paymentmethod ;
    private User user ;


    public Order(int id ,String SKU ,Brand brand,PaymentMethod paymentmethod,User user){
        this.id = nextId ;
        this.SKU = SKU ;
        this.brand = brand ;
        this.paymentmethod = paymentmethod ;
        this.user = user ;

    }
    
    
}
