import java.util.Scanner;

public class Enter {

    public static void enterFirst(){
        Scanner enterScanner = new Scanner(System.in);
        System.out.println("Do you have an account already? (Type Quit To Stop Program)");
        String answer = enterScanner.next();
        if(answer.equals("Yes") || answer.equals("yes") || answer.equals("YES")){
            login();
        }
        else if(answer.equals("No") || answer.equals("no") || answer.equals("NO")){
            signUp();
        }
        else if(answer.equals("Quit")){
            Main.quit = false;
        }
        else if(answer.equals("Admin")){
            adminLogin();
        }
        else {
            System.out.println("Wrong format entered");
        }

    }

    public static void login(){
        System.out.print("Enter Your Name:");
        String tempName = Main.scanner.next();
        if(ifCustomerExists(tempName)){
            System.out.print("Enter Your Password:");
            String tempPassword = Main.scanner.next();
            Customer current = getCustomerByName(tempName);
            if(current.getPassword().equals(tempPassword)){
            Process p = new Process();
            p.process(current);
            }
            else{
                System.out.println("Wrong password");
            }
        }
        else{
            System.out.println("There is no User with that name");
        }


    }
    public static void signUp(){
        Scanner enterScanner = new Scanner(System.in);
        Customer online = new Customer();
        System.out.println("Enter Your Name:");
        String tempUsername = enterScanner.nextLine();
        if(!ifCustomerExists(tempUsername)) {
            online.setName(tempUsername);
            System.out.println("Enter Your Password:");
            online.setPassword(enterScanner.next());
            online.setBalance(0);
            Main.Customers.add(online);
            Process p = new Process();
            p.process(online);
        }
        else{
            System.out.println("There exist such Username");
        }


    }

    public static void adminLogin(){
        Scanner enterScanner = new Scanner(System.in);
        System.out.println("Enter admin password:");
        String tempAdminPassword = enterScanner.next();
        if(Admin.checkAdminPassword(tempAdminPassword) == true){
            AdminProcess p = new AdminProcess();
            p.process();
        }
        else{
            System.out.println("Wrong password");
        }

    }

    public static boolean ifCustomerExists(String name) {
        for (Customer customer : Main.Customers) {
            if (customer.getName().equals(name))
                return true;
        }
        return false;
    }
    public static Customer getCustomerByName(String name) {
        for (Customer customer : Main.Customers) {
            if (customer.getName().equals(name))
                return customer;
        }
        return null;
    }

}
