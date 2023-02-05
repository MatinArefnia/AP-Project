public class Contract {
    private Customer buyer;
    private Customer seller;
    private House house;

    public Contract(Customer buyer,Customer seller,House house){
        this.buyer = buyer;
        this.seller = seller;
        this.house = house;
    }
    public boolean cashCheck(){
        if(buyer.getBalance() < house.getPrice()){
            return false;
        }
        else{
            return true;
        }
    }
    public void cashTransfer(){
        this.buyer.pay(house.getPrice());
        this.seller.receive(house.getPrice());
    }
    public void houseTransfer(){
        buyer.addHouse(house);
        seller.removeHouse(house);
    }
    public void contractPaper(){
        System.out.println("House " + house.getName() + " has been sold to: ");
        System.out.println("Mr/Mrs: " + buyer.getName());
        System.out.println("Seller: " + this.seller.getName());
        System.out.println("Contract cost:" + this.house.getPrice());
        System.out.println("This contract was made by Arefnia Real State Agency");
    }
}
