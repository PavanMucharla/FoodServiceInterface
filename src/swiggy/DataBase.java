package swiggy;

public class DataBase {
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    private String userName="Pavan";

    private String password="123456";
    private double walletBalance=1000;
}
