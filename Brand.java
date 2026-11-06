public class Brand{

    private static int nextId = 1 ;
    private int id ;
    private String name ;

    public Brand(int id ,String name ){

        this.id = nextId ;
        this.name = name ;
    
    }

    public int getId(){

        return id ;
    }
    public String getName(){

        return name ;
    }





}