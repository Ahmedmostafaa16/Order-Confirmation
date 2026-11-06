public class User { 

    private String mobileNumber ;
    private String name ;
    private String address ;


    public User(String mobileNumber ,String name ,String address){

        this.mobileNumber = mobileNumber ;
        this.name = name ;
        this.address = address ;
    }

    public String getMobileNumber(){
        return mobileNumber ;
    }
    public String getName() {
        return name ;

    }
    public String getAddress(){

        return address ;
    }
    
}
