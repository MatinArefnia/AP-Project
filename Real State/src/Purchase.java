
public class Purchase {
    public static int code;
    public static void chooseHouse(Customer online){
        //online choose house with houseCode code:
        System.out.println("Which Code you want to purchase? (Enter -1 if you want to quit)");
        code = Main.scanner.nextInt();
        if(code != -1){
            Contract contract = new Contract(online,Main.Houses.get(code).getOwner(),Main.Houses.get(code)) ;
            if(!contract.cashCheck()){
                System.out.println("You don't have enough money for that house!");
            }
            else {
                contract.cashTransfer();
                contract.houseTransfer();
                contract.contractPaper();
            }
        }

    }

}
