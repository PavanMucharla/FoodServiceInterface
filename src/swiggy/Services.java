package swiggy;

public abstract class Services implements Login, Payment,OrderProcess {
    private String userName="Pavan";

    private String password="123456";

    DataBase dataBase;
    Restaurant restaurant;

    @Override
    public boolean login(String userName, String password) {
        //if (dataBase.getUserName().equals(userName) && dataBase.getPassword().equals(password)) {
            if (this.userName.equals(userName) && this.password.equals(password)) {
            System.out.println("swiggy.Login Sucessfull");

        } else {
            System.out.println("invaild credentials");

        }
        return true;


    }

    @Override
    public boolean payment() {
        if (restaurant.totalCost<=dataBase.getWalletBalance()) {
            dataBase.setWalletBalance(dataBase.getWalletBalance()- restaurant.totalCost);
            System.out.println("swiggy.Payment success"+ dataBase.getWalletBalance());
        }else{
            System.out.println("swiggy.Payment unsuccessfull"+dataBase.getWalletBalance());
        }
        return true;
    }
}
