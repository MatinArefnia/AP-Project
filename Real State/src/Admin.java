public class Admin extends User{
    private int userCount;
    private int houseCount;
    private final String AdminPassword = "Arefnia1381";

    //getter setter
    public int getUserCount(){
        return this.userCount;
    }
    public void setUserCount(int userCount){
        this.userCount = userCount;
    }
    public int getHouseCount(){
        return this.houseCount;
    }
    public void setHouseCount(int houseCount){
        this.houseCount = houseCount;
    }
    //

    public void addUserCount(){
        this.userCount++;
    }
    public void addHouseCount(){
        this.houseCount++;
    }
    public static boolean checkAdminPassword(String adminPassword){
        if(adminPassword.equals(adminPassword) == true){
            return true;
        }
        else{
            return false;
        }
    }


}
