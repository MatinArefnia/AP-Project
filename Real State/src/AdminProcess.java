public class AdminProcess {
    public void process(){
        while(true) {
            System.out.println("What would you do? List of Houses / List of Customers / Log Out");
            String command = Main.scanner.nextLine();

            if (command.equals("List of Houses")) {
                listOfHouses();
            }
            if (command.equals("List of Customers")) {
                listOfCustomers();
            }
            if (command.equals("Log Out")){
                break;
            }
        }

    }
    public void listOfHouses(){
        Main.showHouses();
    }
    public void listOfCustomers(){
        Main.showCustomers();
    }
}


