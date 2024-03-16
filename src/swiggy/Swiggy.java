package swiggy;

public class Swiggy extends Services{

    Restaurant restaurant;


    @Override
    public boolean orderprocess( Restaurant restaurant) {
        double totalAmt= ((restaurant.biryani * restaurant.biryaniCost) +(restaurant.sweet * restaurant.sweetCost)+(restaurant.drink* restaurant.drinkCost)+
                (restaurant.friedRice* restaurant.friedRiceCost));
        restaurant.totalCost = totalAmt;
        System.out.println(totalAmt);
        return true;
    }

}
