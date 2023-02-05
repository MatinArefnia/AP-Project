import java.util.ArrayList;

public class Customer extends User {
    private int balance = 0;
    private ArrayList<House> customerHouses= new ArrayList<>();

    //getter setter
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    //


    public void chargeAccount(int price){
        System.out.println();
        this.balance += price;
    }
    public void pay(int price){
    this.balance -= price;
    }
    public void receive(int price){
    this.balance += price;
    }
    public void showCustomer(){
        System.out.println("Name: " + this.getName());
        System.out.println("Balance: " + this.balance);
        System.out.println("Id: " + this.getId());
        System.out.println("Owns Houses: ");
        showCustomerHouses();
        System.out.println("--------------------");
    }
    public void addHouse(House house){
        customerHouses.add(house);
    }
    public void removeHouse(House house){
        customerHouses.remove(house);
    }
    public void registerHouse(){
        House newHouse = new House();
        System.out.print("Enter House Name:");
        newHouse.setName(Main.scanner.next());
        System.out.print("Enter House price:");
        newHouse.setPrice(Main.scanner.nextInt());
        System.out.print("Enter House region:");
        newHouse.setRegion(Main.scanner.next());
        System.out.print("Enter House street:");
        newHouse.setStreet(Main.scanner.next());
        System.out.print("Enter House address:");
        newHouse.setAddress(Main.scanner.next());// address must be with sth else than next()
        newHouse.setOwner(this);
        Main.Houses.add(newHouse);
        newHouse.setHouseCode(Main.Houses.indexOf(newHouse));
        this.customerHouses.add(newHouse);
    }
    public void showCustomerHouses(){
        for(int i=0 ; i<customerHouses.size(); i++){
            customerHouses.get(i).showHouse();
        }
    }

}