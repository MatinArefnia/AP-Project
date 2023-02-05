public class House {

    private Customer owner;
    private int price;
    private String name;
    private String region;
    private String street;
    private String address;
    private int houseCode;

    //getter setter
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getRegion(){
        return this.region;
    }
    public void setRegion(String region) { this.region = region; }
    public String getStreet(){
        return this.street;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public Customer getOwner(){ return this.owner;}
    public void setOwner(Customer owner){ this.owner = owner;}
    public int getHouseCode(){ return this.houseCode;}
    public void setHouseCode(int houseCode){ this.houseCode = houseCode;}
    //

    public void showHouse(){
        System.out.println("House " + this.name);
        System.out.println("This House Owns by " + this.owner.getName());
        System.out.println("Cost: " + this.price + "$");
        System.out.println("Region: " + this.region);
        System.out.println("Address: " + this.address);
        System.out.println("House Code: " + this.houseCode);
        System.out.println("------------------------------------------");

    }

}
