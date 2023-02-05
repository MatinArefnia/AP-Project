public class Process {
    public Customer online;
    public void process(Customer online){
        this.online = online;
        while(true) {
            System.out.println("What would you do? Search / Register House / Charge Account / Log Out / Show My Profile");
            String command = Main.scanner.nextLine();

            if (command.equals("Search")) {
                search();
            }
            if (command.equals("Register House")) {
                registerHouse();
            }
            if (command.equals("Charge Account")){
                chargeAccount();
            }
            if (command.equals("Log Out")){
                break;
            }
            if(command.equals("Show My Profile")){
                showMyProfile();
            }
        }

    }
    public void registerHouse(){
        online.registerHouse();
    }
    public void search(){
        Main.showHouses();
        System.out.println("Choose House Code: ");
        Purchase.chooseHouse(online);
    }
    public void chargeAccount(){
        System.out.println("Enter charge amount: ");
        online.chargeAccount(Main.scanner.nextInt());
    }
    public void showMyProfile(){
        online.showCustomer();
    }
}
