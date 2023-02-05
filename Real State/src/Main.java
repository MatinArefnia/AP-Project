import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean quit= true;

    public static ArrayList<House> Houses = new ArrayList<>();
    public static ArrayList<Customer> Customers = new ArrayList<>();
    public static void showCustomers(){
        for(int i=0 ; i<Customers.size() ; i++) {
            Customers.get(i).showCustomer();
        }
    }
    public static void showHouses(){
        for(int i=0 ; i<Houses.size() ; i++) {
            Houses.get(i).showHouse();
        }
    }

    public static void main(String[] args) {

        while(quit){
            Enter.enterFirst();
        }









    }


}