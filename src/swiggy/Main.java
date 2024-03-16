package swiggy;

public class Main {

    public static void main(String[] args) {
        Swiggy s= new Swiggy();
        s.login("Pavan","123456");
        Restaurant restaurant=new Restaurant(2,1,1,2);
        s.orderprocess(restaurant);
    }
}